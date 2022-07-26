package for_loop;

public class Enhanced_for_loop {

	public static void main(String[] args) {

		/*lets create an array just for demo*/
		int[] arr = {1, 3, 4, 5, 6, 7};
		
		/*here is how we use enhanced arrays*/
		for(int k : arr) {
			System.out.print(k + " ");
		}
		/*for space purpose*/
		System.out.println("\n");
		
		
		/*lets say we have 2D arrays*/
		int[][] arr1 = {{5, 6, 7, 2},{4, 6, 6, 7},{3, 6, 1, 8}} ;
	
		
		/*lets use enhanced array to display the elements*/
		for(int[] i : arr1 ) {
			for(int x : i) {
				System.out.print(x + " ");
				
				/*for space purpose*/
			}System.out.println();
		}
		
		
	}

}
