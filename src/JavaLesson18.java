import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaLesson18 {                                                                                             //создали класс
    public static void main(String[] args){            //метод для запуска
        addThreadsToPool();                         //тут запускаем метод , который описан ниже

    }
    public static void addThreadsToPool(){          // создали метод
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);  //создали обьект,на него подаем длинну пула ?
        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);//вызываем метод , который создает переодическое действие
        // в него засовываем задачу , которую будем выполнять , время задержки первого выполнения, время между другим выполнением и
        //тип времени
        eventPool.scheduleAtFixedRate(new PerformSystemCheck(" Mail"), 5, 5, TimeUnit.SECONDS);
        //вызываем новую переодизацию , на нее подаем другоую задачу с определенным параметром
        eventPool.scheduleAtFixedRate(new PerformSystemCheck(" Calendar"), 10, 10, TimeUnit.SECONDS);
        // то же самое но с другим параметром
        System.out.println("Number of threads " + Thread.activeCount()); //саут количество активных потоков
        Thread[] listOfThreads = new Thread[Thread.activeCount()]; // создаем массив из количества потоков
        Thread.enumerate(listOfThreads); //походу то же самое
        for(Thread i : listOfThreads){ // в данном случае цикл столько сколько активных потоков
            System.out.println(i.getName());  //каждый раз выводим название потока ?  (нул если поток остановлен)
        }
        System.out.println("______________________________");
        for(Thread i : listOfThreads){     // кртим цикл столько сколько активныхх потоков
            System.out.println(i.getPriority());   // отображает приоритет потока
        }
        System.out.println("_______________________________");
        eventPool.shutdown();                       //закрываем пул с потоками
        try{
            Thread.sleep(20000);   //спим на 20 сек
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

