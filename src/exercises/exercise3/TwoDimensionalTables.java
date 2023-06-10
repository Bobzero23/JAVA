package exercises.exercise3;

/*Displaying the odd numbers in the two-dimensional table*/

public class TwoDimensionalTables {

    public static void main(String[] args) {
         int[][] table = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

         for(int i = 0; i < table.length; i++) {
             for(int j = 0; j < table[0].length; j++) {
                 if(table[i][j] % 2 != 0) {
                     System.out.print(table[i][j] + " ");
                 }
             }
         }
    }
}
