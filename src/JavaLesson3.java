/**
 * Created by v.stuparenko on 09.07.2015.
 */
public class JavaLesson3 {
    public static  void main(String[] args){
        int randomNumber = (int) (Math.random()*50); //создаем рандомное число

        /*Relational Operators:
        Java has 6 relational operators
        * > : Greater Than
        * == : Equal To
        * != : Not Equal To
        * >= : Greater Yhan Or Equal To
        * <= : Less Than Or Equal To
         */
    if (randomNumber< 25){
        System.out.println("The random number is less than 25");      //ну тут все ясно
    }
        else if (randomNumber > 40) {
        System.out.println("The random number is greater than 40");
    }
    else if (randomNumber == 18) {
        System.out.println("The random number is equal to 18");         //ну тут все ясно
    }
    else if (randomNumber != 40) {
        System.out.println("The random number is not equal to 40");     //ну тут все ясно
    }
        else {
        System.out.println("Nothing Worked");                           //ничего не работает
    }
        if (!(false)) //усли тру
        {
            System.out.println("\nI turned false into true"); //месседж
        }
        if ((false) ^ (true)) //сложение по модулю два //выдаем тру когда значения разные
        {
            System.out.println("One are true");
        }
        System.out.println("The random number is " + randomNumber);
    }
}
