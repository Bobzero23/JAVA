package data_structure_and_algorithm_dsa;

public class Array_2D {

	public static void main(String[] args) {

		/* creating a 2D array with 3rows and 4 columns */
		int[][] arr = new int[3][4];

		/* just for assigning elements */
		int count = 0;

		/* a loop for assigning elements */
		/* this loop refers to the rows */
		for (int i = 0; i < arr.length; i++) {
			/* this loop will refer to columns */
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;

			}
		}

		/* now let's display the elements of our array */
		/* we again gonna need two for loop so you might copy from above */

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
