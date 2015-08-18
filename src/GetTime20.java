import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime20 extends  Thread {   //создали класс , он расшир€ет Thread


    public void run(){          //создали метод ран
        Date rightNow;          //создали переменную типа дейт
        Locale currentLocale;       //типа локаль
        DateFormat timeFormatter;
        DateFormat dateFormatter;
        String timeOutput;
        String dateOutput;

        for(int i = 1; i<20 ; i++) { //20 раз цикл
            rightNow = new Date();      //создали новое врем€
            currentLocale = new Locale("en"); //установили локацию EN
            timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale); //форматируем врем€ исход€ из текущего положени€
            dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale); //форматируем дату исход€ из текущего положени€
            timeOutput = timeFormatter.format(rightNow);        //тут показ≥ваем текущее врем€
            dateOutput = dateFormatter.format(rightNow);        //тут показ≥ваем текущую дату
            System.out.println(timeOutput); //в≥водим
            System.out.println(dateOutput);
            System.out.println();//пуста€ строка
            try{  //трай
                Thread.sleep(2000); //спим на две секунд≥
            }catch (InterruptedException e){ //кетчи если не спим

            }

        }



    }

}
