package ibm.com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
	 public static void main(String args[]) throws ParseException {
	      Date dNow = new Date( );
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	      System.out.println("当前时间为: " + ft.format(dNow));
	      System.out.println(ft.parse("2020-08-08 11:11:11"));
	   }

}
