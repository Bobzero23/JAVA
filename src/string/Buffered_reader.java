package string;

/*needed imports*/
import java.io.*;

/*HII INATUMIKA KAMA SCANNER SEMA YENYEWE HUWA 
 * INAWEKA KATIKA STRING ITABIDI UWE UNAMODIFY DATA*/
public class Buffered_reader {

	
	/*and to use buffer reader inabid tu throw exception*/
	public static void main(String[] args) throws Exception  {

		/*asking for a user input*/
		System.out.println("Enter a number here: ");

		/*ili kutumia buffer reader inabdi tuwe na object ya input stream reader*/
		InputStreamReader isr = new InputStreamReader(System.in);
		
		
		/*after creating inputstreamreader object we use in buffer reader*/
		BufferedReader br = new BufferedReader(isr);
		
		/*this will display but rightnow our input is string*/
//		System.out.println(br.readLine());
		
		
		/*now we change input to integere*/
		int i = Integer.parseInt(br.readLine());
		
		/*now displaying after changin it to int*/
		System.out.println(i);
		
		
		

	}

}
