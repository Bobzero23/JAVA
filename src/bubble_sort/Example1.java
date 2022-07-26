package bubble_sort;

public class Example1 {

	public static void main(String[] args) {

		//this is my array with un-orderd number 
		int[] array = { 5, 9, 2, 1, 8, 4, 6, 7, 3, 0 };
		
		//this is my bubble sort method
		bubbleSort(array);

		//here is where display the output
		//I wish I could just only call the method
		for (int i : array) {
			System.out.print(i);
		}
	}

	//here is the bubble sort method
	//just try to understand it is easy
	public static void bubbleSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					
					

				}
			}
		}

	}
}