import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CheckSystemTime implements Runnable {          //класс
    public void run(){                                  //метод
        Date rightNow;                                      //обьект дата
        Locale currentLocale;           // обьект локация
        DateFormat timeFormatter;       // обьект формат даты
        String timeOutput;              // стринга

        rightNow = new Date();          //  //инициализированили дату
        currentLocale = new Locale("en"); // установили локацию

        timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale); // устанновили формат времени
        timeOutput = timeFormatter.format(rightNow);        // инициализировали выходное время , суем туда текущее время

        System.out.println("Time: " + timeOutput);          // отображаем все это


    }

}
