
public class JavaLesson17 {         //создали клас
public static void main(String[] args){         //запуск
    Thread getTime = new GetTime20();       //создали новый поток
    Runnable getMail = new GetDaMail(10);  //создали еще один поток
    Runnable getMailAgain = new GetDaMail(20); // и тут
    getTime.start();//ЗАПУСКАЕМ ПЕРВІЙ ПОТОК
    new Thread(getMail).start(); //ЗАПУСКАЕМ ПОТОК ГЕТ ПЕЙЛ
    new Thread(getMailAgain).start(); //ЗАПУСКАЕМ ТРЕТИЙ ПОТОК
}


}
