package binary_search;
/*started from the middle then look if the target is 
 * less or more and the disregard the other half and 
 * repeat the same steps until the target is found*/

//we need to import array class so we can use its mehtods
import java.util.Arrays;

public class BinarySerach {

	public static void main(String[] args) {

		//here I created the array called array
		int array[] = new int[100];

		//here is the target number which I am looking for 
		int target = 105;
		 
		//I donno what is this for loop for 
		for(int i = 0; i<array.length; i++) {
			array[i] = i;
		}
		
		//here is our manually binary search method to find the target
		int index = Arrays.binarySearch(array,target);
		
		//here is the checking point to see whether we found the target or not 
		if(index == -1) {
			System.out.println(target + " not found");
		}
		else {
			System.out.println(target+ " found at: "+ index);
		}
		
		
	}

}
