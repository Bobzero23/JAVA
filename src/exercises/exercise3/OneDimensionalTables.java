package exercises.exercise3;

/*This code will multiply every element in the table with 2*/

import java.util.Arrays;

public class OneDimensionalTables {

    public static void main(String[] args) {
        int [] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < table.length; i++) {
            table[i] = table[i] * 2;
        }

        System.out.println(Arrays.toString(table));
    }
}
