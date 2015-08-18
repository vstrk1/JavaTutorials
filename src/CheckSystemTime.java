import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Владислав on 15.08.2015.
 */
public class CheckSystemTime implements Runnable {
    public void run(){
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormatter;
        String timeOutput;

        rightNow = new Date();
        currentLocale = new Locale("en");

        timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
        timeOutput = timeFormatter.format(rightNow);

        System.out.println("Time: " + timeOutput);


    }

}
