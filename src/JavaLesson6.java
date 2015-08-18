import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by v.stuparenko on 14.07.2015.
 */
public class JavaLesson6 {
    static Scanner userInput = new Scanner(System.in);
    public static  void main(String[] args) {
        System.out.println("How old are you ? ");
        int age = checkValidAge();
        if (age !=0){
            System.out.println("You are " + age + " years old");
        }
        }

    public static int checkValidAge(){
        try {
            return userInput.nextInt();
        }catch (InputMismatchException e){
            userInput.next();
            System.out.println("Dat ist a whole number");
            return 0;
        }

    }
}
