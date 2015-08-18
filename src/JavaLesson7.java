/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class JavaLesson7 { //создаем новый класс
    public static void main(String[] args) //запускающийся класс
    {
        Monster Frank = new Monster(); //создаем новый обьект (стандартный конструктор)
        Frank.name = "Frank"; //даем ему новое имя (эта переменная публичная поэтому ей ворочаем как хотим)
       System.out.println(Frank.name+"has on attack of " +Frank.getAttack()); //вызвываем имя нашего обьекта + приватную переменную
    }


}
