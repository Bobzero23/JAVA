package patterns;
/*This code will execute the right triangle with increasing numberes*/

public class NumberTriangle {

	public static void main(String[] args) {

		int n = 5;
		 
		for (int i = 1, p = 0; i <= n; i++) {
			p++;
			p = 1;
			

			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
				p++;
			}
			System.out.println();
		}

	}
}

// Jiongeze kwa kweli siwez kuchuka notes za kila kitu
// *jaribu ku'initialize p = 1 alaf katika inner loop usiweke p alaf print utapata kitu kinaitwa FLOYD TRIANGLE
