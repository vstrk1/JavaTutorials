/**
 * Created by v.stuparenko on 31.07.2015.
 */
public class Animals { // создаем класс с животными
    private String name = "Animal"; // создаем прайват стринг  , засовываем в нее значение
    public String favFood = "Food"; //  вторую паблик  , и засовываем в нее значение

    protected final void changeName(String newName){ // создаем протектед метод , который принимает на себя стринг
        this.name = newName; // то что дали на метод присваеваем в пероеменную  нейм
    }

    protected final String getName(){ // создаем протектед метод
        return this.name;  // // возвращает  нам имя
    }
    public void eatStuff(){   // создаем паблик метод
        System.out.println("Yum " + favFood); // метод выводит на экран сообщение - Yum + любимая еда
    }

    public void walkAround(){ // создаем паблик метод
        System.out.println(this.name + " walks around");  //выдаем имя + сообщение
    }
    public Animals(){   //создали стандартный прайват конструктор

    }
    public Animals(String name, String favFood){  //еще один конструктор (принимает имя и любимую еду)
        this.changeName(name); //  вызывает первый метод , ложит в него имя , которое втолкали вначале
        this.favFood = favFood; //присваем любимую еду
    }
}
