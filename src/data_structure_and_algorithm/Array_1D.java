package data_structure_and_algorithm;

public class Array_1D {

	public static void main(String[] args) {

		/* array declaration */
		int[] arr = new int[6];

		/* for elements */
		int count = 1;

		/* adding elements with for loop */
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			count++;
		}
		
		/*displaying the elements*/
		for (int x = 0; x < 6; x++) {
			System.out.print(arr[x] + ", ");
		}

	}

}
