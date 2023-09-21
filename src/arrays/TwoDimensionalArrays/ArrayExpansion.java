package arrays.TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayExpansion {
    public static void main(String[] args) {
        List<List<Integer>> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> newRow = new ArrayList<>();

            // Increment the value in each cell of the array
            for (int j = 0; j <= i; j++) {
                int value = (j > 0) ? array.get(i - 1).get(j - 1) + 1 : 0;
                newRow.add(value);
            }

            array.add(newRow);
        }

        // Print the final result
        for (List<Integer> row : array) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
