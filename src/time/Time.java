package time;

import java.text.SimpleDateFormat;

/*HERE WE GONNA SEE HOW TO GET THE DATE AND TIME AND ALL OF THAT KINDA STUFFS*/

/*must imports*/
import java.util.*;

/*main class*/
public class Time {

	/*main mehtod*/
	public static void main(String[] args) {

		/*this object will display the full date and time */
		Date object = new Date();
		System.out.println(object);
		
		/*this one will give whatever you want depends on the parameters*/
		SimpleDateFormat sdf = new SimpleDateFormat("G");
		System.out.println(sdf.format(object));
		
	}

}
