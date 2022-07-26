package patterns;
//This code is for creating left triangle 

public class LeftTriangle {
//
	public static void main(String[] args) {
		
		int n = 5, i, j;
// This code will execute the epmty right Triangle star
		for (i = 1; i <= n; i++) { //outer loop
			
			for (j = i; j <= n; j++) {//first inner loop
				System.out.print("  ");
			}
// This code will execute the left Triangle star
			for (j = 1; j < i; j++) {// second inner loop
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

// SOMA KWA MAKINI MAELEZO YAFUATAYO 
// Ili kutengeneza right triangle inner loop ya kwanza weka EMPTY increasing alaf inner loop ya pili weka decreasing amabayo NOT EMPTY
//UKIJUA KUCHEZA NA HIZI EMPTY NA ZISIZO EMPTY IMEKWISHA HIO


