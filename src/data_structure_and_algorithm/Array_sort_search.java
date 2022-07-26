package data_structure_and_algorithm;

/*import array to use its methods*/
import java.util.Arrays;

public class Array_sort_search {

	/* this is a searching method */
	public static int search(int array[], int key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		/* this is another way of creating 1D array */
		int arr[] = new int[] { 4, 5, 7, 2, 8, 1, 6 };

		/* for array displaying */
		/* before sorting */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		/* sorting an array */
		Arrays.sort(arr);

		/* just to give a line */
		System.out.println();

		/* for array displaying */
		/* after sorting */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		/*variable for searching*/
		int indexVariable = search(arr, 7);
		 
		/*just to give a line*/
		System.out.println();
		
		/*conditions on answers*/
		if(indexVariable == -1)
			System.out.println("Index not found");

		else{
			System.out.println("The number you are searching is at index " + indexVariable );
		}
	}

}
