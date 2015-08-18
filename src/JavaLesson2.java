import java.util.Scanner;

/**
 * Created by v.stuparenko on 08.07.2015.
 */
public class JavaLesson2 {
static Scanner userInput = new Scanner(System.in);  //scanner - простой текстовый редактор,принемает на себя (System.in)
    public static void main(String[] args){
        System.out.print("Your favorite number:"); //выводим меседж
        if (userInput.hasNextInt()){ //ЕСЛИ (с потока ввода userInput можно считать чтото)
            int numberEntered = userInput.nextInt(); //создаем переменную , суем в нее данные введенные в поле
            System.out.println("You entered " + numberEntered); //вы ввели + новая теременная выше

            int numEnteredTimes2 = numberEntered + numberEntered;//обьявляем еще одну переменную - она равна сумме той что мы ввели
            System.out.println(numberEntered + "+" + numberEntered + "=" + numEnteredTimes2);//месседж того , чему равна сумма

            int numEnteredTimesSelf = numberEntered * numberEntered; //перемножение
            System.out.println(numberEntered + "*" + numberEntered + "=" + numEnteredTimesSelf); //месседж

            int numEnteredMinus2 = numberEntered - 2; //число - 2
            System.out.println(numberEntered + " - 2 ="  + numEnteredMinus2); //месседж

            int numEnteredDivide2 = numberEntered / 2; //деление на два
            System.out.println(numberEntered + " / 2 ="  + numEnteredDivide2);//месседж

            int numEnteredRemainder= numberEntered % 2; //остаток два
            System.out.println(numberEntered + " % 2 ="  + numEnteredDivide2); //месседж
            numberEntered +=2; //+2
            numberEntered -=2; //-2
            numberEntered--; //-1
            numberEntered++; //+1
            int numberABS = Math.abs(numberEntered); //7
            int whichIsBigger = Math.max(5, 7);//5
            double numSQRT = Math.sqrt(5.23);
            int numCeiling = (int) Math.ceil(5.23);
            int numFloor = (int) Math.floor(5.23);//5
            int numRound = (int) Math.round(5.63);//6
            int randomNumber = (int) (Math.random()*11); //создаем рандомное число
            System.out.println("Random Number " + randomNumber); //месседж рандом намбера

            /*
            *               //так можно писать комменты
             */
        }else {
            System.out.println("Enter an integer next time"); //а если число не ввели показываем сообщение

        }
    }
}
