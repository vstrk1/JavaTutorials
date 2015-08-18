/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class JavaLesson4 {
    public static void main(String[] args)
    {
        int i =1; //обьявляем переменную
        while(i <= 20) //пока i меньше 20 делаем
        {
            if(i ==3) {  //если i = 3
                i+=2 //i прибавляем 2
                ;continue;} //продолжаем
            System.out.println(i); //выводим переменную i в консоль
            i++; // увеличиваем на 1
            if ((i%2)==0) //если число четное
            {
                i++;    //увеличиваем на 1
            }
            if(i>10) //если число больше 10
            {
                break; //вылетаем к чертовой матери
            }
        }
    }
}
