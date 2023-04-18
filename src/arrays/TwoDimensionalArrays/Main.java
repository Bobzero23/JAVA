package arrays.TwoDimensionalArrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int gridOuterLength = grid.length;
        int gridInnerLength = grid[0].length;


        for(int i = 0; i < gridOuterLength; i++) {
            for(int j = 0; j < gridInnerLength; j++) {
                System.out.print(grid[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
