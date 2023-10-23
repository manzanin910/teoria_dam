package basic;

public class galaxy_collision{
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        int depth = 10;

        int numeroDeGal = 10;
        int value = 0;

        char[][][] grid = new char[rows][cols][depth];

        InitializeGrid(grid);

        // generador de galaxias en posiciones y pesos aleatorios;
        while(value < numeroDeGal){

            int randomizerXPos = (int) Math.round(Math.random() * (rows-1));
            int randomizerYPos = (int) Math.round(Math.random() * (cols-1));
            int randomizerZPos = (int) Math.round(Math.random() * (depth-1));

            int randomizerGal = (int) Math.round(Math.random() * (numeroDeGal-1) + 1);

            grid[randomizerXPos][randomizerYPos][randomizerZPos] = String.valueOf(randomizerGal).charAt(0);

            value++;
        }

        printGrid(grid);
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
}