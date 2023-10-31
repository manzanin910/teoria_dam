package basic;

public class galaxy_collision{
    public static void main(String[] args) throws InterruptedException {
        int rows = 10;
        int cols = 10;
        int depth = 10;

        int NumberOfGalax = 10;
        int pesosDeGal = 9;
        int value = 0;

        int numberOfGen = 50;

        char[][][] grid = new char[rows][cols][depth];

        InitializeGrid(grid);

        grid[1][2][3] = '6';
        grid[7][5][3] = '2';
        grid[8][2][3] = '3';
       
        /* 
        // generador de galaxias en posiciones y pesos aleatorios;
        while(value < NumberOfGalax){

            int randomXPos = (int) Math.round(Math.random() * (rows-1));
            int randomYPos = (int) Math.round(Math.random() * (cols-1));
            int randomZPos = (int) Math.round(Math.random() * (depth-1));

            int randomGalaxNumber = (int) Math.round(Math.random() * (pesosDeGal-1) + 1);

            grid[randomXPos][randomYPos][randomZPos] = String.valueOf(randomGalaxNumber).charAt(0);

            value++;
        }*/

        for(int gen = 1; gen <= numberOfGen; gen++){

            clearConsole();
            System.out.println("<------------------<{Generación " + gen + "}>------------>");
            printGrid(grid);

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    for(int k = 0; k < depth; k++){
                        int lowestDistance = LargeAndCloseNumberFinder(grid, i, j, k);
                        Displacement(i, j, k, grid, lowestDistance);
                    }
                }
            }

            Thread.sleep(2000);
        }
        
    }

    // inicializar el tablero con espacios vacíos;
    public static void InitializeGrid(char[][][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        int depth = grid[0][0].length;

        for(int i = 0;  i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < depth; k++){
                    grid[i][j][k] = '.';
                }
            }
        }
    }

    // imprimir en consola las diferentes generaciones;
    public static void printGrid(char[][][] grid){
        for(int z = 0; z < grid[0][0].length; z++){
            System.out.println("[Rebanada " + Integer.valueOf(z+1) + "]");

            for(int x = 0; x < grid.length; x++){
                for(int y = 0; y < grid[0].length; y++){

                    System.out.print(grid[x][y][z]);
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    // encuentra el número más cercano y grande con un target de referencia;
    public static int LargeAndCloseNumberFinder(char[][][] grid, int x, int y, int z){

        int distanciaMasCercana = 0;;
        int maxDistance = 80; // cualquier número grande para comparar después;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                for(int k = 0; k < grid[0][0].length; k++){

                    if(grid[i][j][k] != '.' && Integer.valueOf(grid[i][j][k]) > grid[x][y][z]){

                        // hay que calcular la diferencia en coordenadas, tienes que separar y restar cada una:
                        int Distance = Math.abs(x - i) + Math.abs(y - j) + Math.abs(z - k);
                    
                        if(maxDistance > Distance){

                            maxDistance = Distance;
                            distanciaMasCercana = maxDistance;
                        }
                    }
                    
                }
            }
        }

        return distanciaMasCercana;
    }

    // Desplazamiento de la galaxia hacia otra según la distancia a la que está;
    public static void Displacement(int x, int y, int z, char[][][] grid, int distance){

        // desplazamientos (en z solo queremos que vaya hacia adelante y hacia atrás);
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1, 0, 0, 0, 0 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1, 0, 0, 0, 0 };
        int[] dz = { 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0 };

        // Contenedores de coordenadas (se van actualizando según la posición);
        int X = x;
        int Y = y;
        int Z = z;

        for(int i = 0; i < 12; i++){

            // siguiente posición;
            int newX = x + dx[i];
            int newY = y + dy[i];
            int newZ = z + dz[i];

            int newDistance = Math.abs(newX - x) + Math.abs(newY - y) + Math.abs(newZ - z);

            if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && newZ >= 0 && newZ < grid[0][0].length){
                if(newDistance < distance && grid[newX][newY][newZ] == '.'){

                    distance = newDistance;
                    
                    X = newX;
                    Y = newY;
                    Z = newZ;
                }

                if (newDistance == 1 && grid[newX][newY][newZ] != '.' && grid[x][y][z] != '.') {

                    // Convertir caracteres a enteros y sumarlos;
                    int sum = Character.getNumericValue(grid[x][y][z]) + Character.getNumericValue(grid[newX][newY][newZ]);

                    // queremos restringir que la suma solo sea en un rango de 0 y 9;
                    if (sum >= 0 && sum <= 9) {
                        
                        grid[X][Y][Z] = String.valueOf(sum).charAt(0);

                        // queremos que el anterior valor no siga en el tablero;
                        grid[newX][newY][newZ] = '.';
                    }else{
                        grid[X][Y][Z] = '9';

                        grid[newX][newY][newZ] = '.';
                    }
                }
            }
        }

        // si la celda destino es '.' significa que el valor no se ha movido como debería;
        if (grid[X][Y][Z] == '.'){

            // copiamos el VALOR a la posición en donde debería estar, estamos sustituyendo el '.' por el número en cuestión;
            grid[X][Y][Z] = grid[x][y][z];

            // Restablece el espacio original como vacío;
            grid[x][y][z] = '.';
        }
        
    }

    public static void clearConsole() {

        try {
            final String os = System.getProperty("os.name"); // identifica el sistema operativo (en este caso Windows);

            // si es Windows, ejecuta el proceso de abajo;
            if(os.contains("Windows")) {

                // Se ejecuta en la cmd, se usa "/c" para indicarle que cierre después de completar, y "cls" que es lo que se ejecuta para limpiar la consola;
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } 
        } catch (Exception e) {
            // toda excepción;
        }
        
    }
}