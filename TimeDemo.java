// 161019: : : : : : : : : : : : : : : : : : : : 
//cwcoleman * * * * * * * * * * * * * 
import java.util.Calendar;
import java.util.Date;
public class TimeDemo {
   public static void main(String[] args) 
   {
      //Date Object
      Date date = new Date();
      /*getTime():It returns the number of milliseconds since 
       * January 1, 1970, 00:00:00 GMT 
       * represented by this date.
       */
     long timeMilli = date.getTime();
      System.out.println("Time in milliseconds using Date class: " + timeMilli);
      int timeInt = (int)(timeMilli / 10000);
	
	 System.out.println("Integer Time " + timeInt);
      //Calendar Object
      Calendar calendar = Calendar.getInstance();
      /*The method getTimeInMillis() returns the 
       * Calendar's time value in milliseconds.
       */
      long timeMilli2 = calendar.getTimeInMillis();
      System.out.println("Time in milliseconds using Calendar: " + timeMilli2);
   }
}
