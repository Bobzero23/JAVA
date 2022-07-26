package reading_and_writing_text_file;

import java.io.*;

public class Writing_text_file {

	public static void main(String[] args) {
		

		try { // try block
			PrintWriter outfile =  new PrintWriter("Written_file.txt");
			// here we pass in the name of the text folder 

			outfile.println("YES IT WORKED!!...\n"
					+ "THIS IS WRITTEN FROM YUOR FILE");//writing in file 
		    outfile.close(); //we shall close the method

			
		}catch (IOException e) {
			//catch block
		}
	}

}
