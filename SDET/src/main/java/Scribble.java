import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Scribble {

	public static void main(String[] args) {
	 Date d = new Date();
	 System.out.println(d);

	 SimpleDateFormat FormatDt = new SimpleDateFormat("yyyy-MM-dd");
	 String NewDate = FormatDt.format(d);
	 System.out.println(NewDate);
	 
	 
	 LocalDate newDate =  LocalDate.now();
	  LocalDate newDate1 =  LocalDate.now().plusDays(1);  //2023-08-21
	  System.out.println("-----------");
	  System.out.println(newDate);
	  System.out.println(newDate1);
	  
	  String stringDt = newDate.toString();

}

}