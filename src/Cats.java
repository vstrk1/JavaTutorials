/**
 * Created by v.stuparenko on 31.07.2015.
 */
public class Cats extends  Animals { // создаем класс , который расширяет животных
    public String favToy = "Yarn"; // создали строку
    public void playWith(){ //создали метод
        System.out.println("Yeah " + favToy); // выводит меседж + любимую игрушку
    }

    public void walkAround(){ //  создаем метод , который называется так же как и в анималс , НО именно ОН БУДЕТ ВЫЗЫВАТЬСЯ , при вызове с другого класса
        System.out.println(this.getName() + " stalks around"); // меседж возвращает
    }

    public String getToy(){ // метод
        return this.favToy; // возвращает строку той
    }
    public Cats(){ // стандартный конструктор

    }

    public Cats(String name, String favFood, String favToy){ // новый конструктор , принимает имя еду и игрушку
        super(name, favFood); // короче передаем наверх эти значения
        this.favToy = favToy; //  и эти тоже
    }

}
