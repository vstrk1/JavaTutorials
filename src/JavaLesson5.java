import java.util.Scanner;

/**
 * Created by v.stuparenko on 13.07.2015.
 */
public class JavaLesson5 {  //создаем класс
    static int randomNumber; //создаем статисеское число
    static Scanner userInput = new Scanner(System.in); //создаем текстовый редактор
    public static void main(String[]args){ //запускающий класс

        System.out.println(getRandomNum()); //показываем на экране функцию getRandomNum
        int guessResult = 1; //создаем число
        int randomGuess = 0; //создаем число случайное  = 0
        while (guessResult != -1) //ПОКА гесресалт не равно -1 делать {
        {
            System.out.println("Guess a number between 0 and 50"); //показываем месседж что рандомное число между 0 и 50
            randomGuess  = userInput.nextInt();     //вводим число в созданное поле , результат записываем в переменную рандом гесс
            guessResult = checkGuess(randomGuess); //в нашу переменную гесресалт записываем результат функции, которая принимает на себя рандомгес, то что мы ввели в поле короче
        }
        System.out.println("Yes the random number is " + randomGuess); //показываем месседж и число которое мы ввели , типо это правильно
    }

   public static int getRandomNum(){             // создаем функцию интовою , ничего на себя не принимает
  randomNumber = (int) (Math.random() * 51); //создаем переменную , (хз чего она фиолетовая), в переменную суем рандомное число
       return randomNumber; //функция возвращает эту переменную
}
    public static int checkGuess(int guess)     //создаем функцию  проверка случайного числа, которое мы ввели
    {
        if (guess== randomNumber){      //если введенное число = нашему созданному
            return  -1;     //возвращаем -1 , которое помогает нам выйти из уловия while ,  и перейти к принтлну
        }else //иначе
        {
            return guess; //возвращаем guess2
        }
    }
}
