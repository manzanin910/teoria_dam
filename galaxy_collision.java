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
        grid[4][5][3] = '2';
        grid[2][3][3] = '4';
        grid[2][2][3] = '7';
        grid[6][4][3] = '3';
        grid[8][2][3] = '4';
        
        printGrid(grid);

        System.out.println(whereTheBigNumber(grid, 2));

        /* 
        // generador de galaxias en posiciones y pesos aleatorios;
        while(value < NumberOfGalax){

            int randomXPos = (int) Math.round(Math.random() * (rows-1));
            int randomYPos = (int) Math.round(Math.random() * (cols-1));
            int randomZPos = (int) Math.round(Math.random() * (depth-1));

            int randomGalaxNumber = (int) Math.round(Math.random() * (pesosDeGal-1) + 1);

            grid[randomXPos][randomYPos][randomZPos] = String.valueOf(randomGalaxNumber).charAt(0);

            value++;
        }

        for(int gen = 1; gen <= numberOfGen; gen++){
            System.out.println("<------------------<{Generación " + gen + "}>------------>");
            printGrid(grid);
            Thread.sleep(2000);
        }
        */
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

    public static String whereTheBigNumber(char grid[][][], int number){

        String numeros = "";


        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                for(int k = 0; k < grid[0][0].length; k++){

                    if(Character.getNumericValue(grid[i][j][k]) > number && grid[i][j][k] != '.'){
                        numeros = "x: " + i + " y: " + j + " z: " + k;
                    }
                }
            }
        }

        return numeros;
    }
}
