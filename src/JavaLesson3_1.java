/**
 * Created by v.stuparenko on 09.07.2015.
 */
public class JavaLesson3_1 {
    public static void main(String[] args) {
     char theGrade = 'R';   //обьявляем переменную
        switch (theGrade) //суем в свитч эту переменную и проверяем условия
        {
            case 'A':
                System.out.println("Great job");
        break;
            case 'B':
                System.out.println("Nice");
                break;
            case 'F':
                System.out.println("OK");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'Q':
                System.out.println("Great!");
                break;
            default: System.out.println("FC U");
                break;
        }
    }
}
