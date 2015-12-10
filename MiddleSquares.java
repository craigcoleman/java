//Get a random seed  
//Multiply the seed by itself
//Output the middle of this result
//Middle squares method
// Started code by CW Coleman 151210

import java.util.Calendar;
import java.util.Date;
public class MiddleSquares{
   public static void main(String[] args) 
   {
		long timeMilli1,  timeMilli2, timeSeed;
		int i,seed,  length, mid, maxmin;
		String timestr;
		String str;
		String newstr;
		
      //Date Object
      Date date = new Date();
      /*getTime():It returns the number of milliseconds since 
       * January 1, 1970, 00:00:00 GMT 
       * represented by this date.
       */
		timeMilli1 = date.getTime();
		timeMilli2 = date.getTime();
			timestr =  Long.toString(timeMilli1) + Long.toString(timeMilli2);
			System.out.println("timeSeed  " +timestr);
			length = String.valueOf(timestr).length();
			mid = length / 2 ;  //  change to get middle
			maxmin = mid / 2  ;  // change to get middle
			System.out.println("\t" +length+"\t"+mid+"\t"+maxmin);
			str = timestr.substring(maxmin, length - maxmin);
			System.out.println("\t seed string debug = " +str);
			seed  = Integer.parseInt(str);
			System.out.println("\t seed = "+seed);
     	
   }
}
