package helloWorld;

// add a *time-stamp*
import java.text.SimpleDateFormat; 
import java.util.Date;

public class Hello {
	public static void main(String args[]) {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd, yyyy HH:mm:ss");
		String formattedDate = formatter.format(now);
		System.out.println("Now time is " + formattedDate + "\nHello " + args[0] +"!");
	}

}
