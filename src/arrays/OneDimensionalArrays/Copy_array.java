package arrays.OneDimensionalArrays;

/*HERE I AM GONNA TRY TO COPY AN ARRAY TO ANOTHER ARRAY*/

/*main class*/
public class Copy_array {

	
	/*main method*/
	public static void main(String[] args) {
		
		/*the array which will be copited*/
		int[] arr = {1, 3, 5, 0, 8, 2};
		
		/*declarations*/
		int[] array = new int[arr.length]; //the array which will copy
		
		
		/*using for loop to loop the arr*/
		for(int i = 0; i < arr.length; i++) {
			array[i] += arr[i];
		}
		
		/*displaying the output*/
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
