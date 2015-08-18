/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class JavaLesson4_1 {
    public static void main(String[] args)
    {
        double myPi  = 4.0; //слхдаем переменную дабл
        double j = 3.0; //еще одну
        //4-4/3+4/5-4/7
        while (j<8001){ //пока вторая переменная будет меньше 8001 делай
            myPi = myPi- (4/j)+(4/(j+2)); //манипуляции вследствии чего получаем свое чило пи
            j +=4;
            System.out.println(myPi);// выводим свое число пи
        }
        System.out.println("Value of PI" + Math.PI); //выводим библиотечное число пи
    }
}
