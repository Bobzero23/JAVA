package reading_and_writing_text_file;
import java.util.Scanner;
import java.io.*;

public class Reading_text_file {

	public static void main(String[] args) {

		File file = new File("Written_file.txt");
		/*creating a file object*/

		try { 
			Scanner scan = new Scanner(file);
			/*scanning the file*/
			String insideText;
			/*initializing a string variable*/

			while (scan.hasNextLine()) {
				/*checking if there is a text when scanning*/
				insideText = scan.nextLine();
				/*setting text to inside text variable*/
				System.out.println(insideText);
				/*displaying the text*/
			}
			scan.close();
				/*closing the scan*/
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			/*displaying the error*/
		}
	}
}