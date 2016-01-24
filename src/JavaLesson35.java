import java.awt.*;

/**
 * Created by vstrk on 1/24/16.
 * Dis class about solving java errors
 */

public class JavaLesson35 {

    private static void printSomething() {

    }

    public static void main(String[] args) {
        int number = 12;

        String anotherNum = Integer.toString(number);

        int numberTwo = Integer.parseInt(anotherNum);

        double pi = 3.14;

        Dimension dim = new Dimension();

        long randLong = Math.round(pi);
        getStuff(1, 12.23);


    }// END OF main()

    public static void getStuff(int number1, double number2) {

        int[][] intArray = new int[10][10];
        String howMany = " ";
        System.out.println(intArray.length);

        int xInt = 1, yInt = 1;
        xInt = yInt++;
        System.out.println("xInt");

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Friday");
                break;

        }
    }

} // END OF LavaLesson35
