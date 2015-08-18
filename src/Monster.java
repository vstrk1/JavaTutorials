/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class Monster {          //создаем класс монстер
    public final  String TOMBSTONE = "Here Lies a Dead monster"; //надгробная плита с надписью  //Эсоздаем константу строку
    private int health = 500; //приватные переменные
    private int attack = 20; //тут
    private int movement =2 ; //тут
    private int xPosition = 0; //тут
    private int yPosition = 0;//тут
    private boolean alive = true; //и тут
    public String name = "Big Monster"; //публичная переменная имя монстра (тип ? )//default man

    public int getAttack()  //создаем метод , который возвращает прайват переменную атака
    {
        return  attack; //ВОЗВРАЩЕНИЕ
    }

    public int getMovement()    //создаем метод, который возвращает прайват переменную
    {
        return  movement; //ВОЗВРАЩЕНИЕ
    }

    public int getHealth() ////создаем метод, который возвращает прайват переменную получить жизни ?
    {
        return  health; //ВОЗВРАЩЕНИЕ ПЕРЕМЕННОЙ
    }
    public void setHealth(int decreaseHealth) //создаем метод по установки здоровья , принимает на себя переменную инт
    { //воид ничего не возвращает нам
        health = health - decreaseHealth; //уменьшаем  короче здоровье
        if (health<0) //если наше здоровье меньше нуля
        {
            alive = false;   //мы умираем (((
        }
    }
    public void setHealth(double decrease)    //чтото связано с перегрузкой метода //короче это такой же метод как и выше
            //только принимает на себя другое значение (разница в типах переменных ?)
    {
        int intDecreaseHealth = (int) decrease; //создаем переменную я хз
        health = health - intDecreaseHealth;
        if (health<0)       //тут условие как и выше
        {
            alive = false;
        }
    }

        public  Monster(int newHealth, int newAttack, int newMovement)  //конструктор
        {
            this.health = newHealth;        //на этот конструктор подаем только три параметра
            this.attack = newAttack;        //а не все как по умолчанию
            this.movement = newMovement;
        }

    //Default Constructor
    public Monster() //конструктор по умолчанию
    {

    }

    public static void main (String[]args){ //создали запускающуюся штуку
        Monster Frank = new Monster(); //создали новый обьект , вызвали конструктор по дефолту
        System.out.println(Frank.attack); //вывели значение атака (20)
    }

    public Monster(int newHealth){ //создали конструктор который принимает на себя только здоровье
        health = newHealth;
    }

    public Monster(int newHealth, int newAttack) //создали конструктор , который принимает на себя здорове и атаку
    {
        this(newHealth); //создаем новую переменную ?
        attack = newAttack; //приняли значение сверху (20)
    }
}
