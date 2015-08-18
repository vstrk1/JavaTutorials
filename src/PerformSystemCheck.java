import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Владислав on 15.08.2015.
 */
public class PerformSystemCheck implements Runnable {    // создали класс , имплементим ранабл
    private  String checkWhat;    // создали прайват
    ReentrantLock lock = new ReentrantLock();    //создаем обьект типа (когда много потоков соперничают за право получения блокировки, общая пропускная способность обычно лучше у reentrantLock, чем у synchronized)

    public PerformSystemCheck(String checkWhat){   // создали метод , принимает на стринг
        this.checkWhat = checkWhat;   // засовываем сюда этот прайват


    }

     public void run(){    //создали метод ран
         lock.lock();    // вызвали метод , который блокирует кусок кода
         System.out.println("Checking" + this.checkWhat);  //показываем сообщение
         lock.unlock(); // разблокируем (обязательно)

    }
}
