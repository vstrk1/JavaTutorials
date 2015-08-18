import java.util.Scanner;

/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class JavaLesson4_2 {
        static Scanner userinput = new Scanner(System.in); //scanner - простой текстовый редактор,принемает на себя (System.in)
        public static void main (String[] args) {
        String contYorn = "Y"; //создаем переменную
        int h = 1; //создаем переменную , суем 1
        while (contYorn.equalsIgnoreCase("y")) //пока (сравниваем значение переменной , с данным условием , две строки )
        {
            System.out.println(h); //выводим h
            System.out.println("Continue y or n ? "); //месседж
            contYorn = userinput.nextLine(); //суем в нее что хотим
            h++; //увеличиваем h на 1
        }
    }
}
