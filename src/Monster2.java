import java.util.Arrays;

/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class Monster2 {          //создаем класс монстер2
    static char[][] battleBoard = new char[10][10];   //cоздаем двумерный массив battleBoard /char -символьный тип/ статик (вызываем это дерьмо с любой точки , не создавая класса)
    public static void boildBattleBoard(){  //пишем статический  метод (ничего не возвращает)
        for (char[] row: battleBoard)   //для (создаем  одномерный массив row)/(row:строка) //УСЛОВИЕ - АВТОМАТИЧЕСКИ ROW КАЖДЫЙ РАЗСВАИВАЕТСЯ НОВОЕ ЗНАЧЕНИ ДВУМЕРНОГО МАССИВА BattleBoard (100 раз будет цикл в данном случае)
        {
            Arrays.fill(row,'*');       //заполняем массив (ставим наш массив, заполняем его звездочкамими )
        }
    }
    public static void redrawBoard()    //создаем метод
    {
        int k = 1;          //создаем переменую к = 1
        while (k <= 30) {       //пока к<=30
            System.out.print("-");  //чертачку рисуем
            k++;    //увеличеваем на 1
        }
        System.out.println(); //типо делаем отсуп

        for (int i = 0; i< battleBoard.length;i++)      //для  делаем цикл столько раз , сколько СТРОК !!!! (сколько циферок в первом кубике) - 10
        {
            for (int j = 0; j<battleBoard[i].length; j++) // каждый раз вызывается новый цикл , повторяется столько раз ,сколько СТОЛБЦОВ в ВЫБРАННОЙ СТРОКЕ i - это номер строки
            {
                System.out.print("|"+battleBoard[i][j]+"|" ); //короче для каждого стобца в каждой строке дорисовываем палочку слева и справа
            }

            System.out.println(); //строка пустая
        }
        k = 1;
        while (k <= 30) {
            System.out.print("-");      //опять рисуем черточки
            k++;
        }
        System.out.println();
    }
    public final  String TOMBSTONE = "Here Lies a Dead monster"; //надгробная плита с надписью  //Эсоздаем константу строку
    private int health = 500; //приватные переменные
    private int attack = 20; //тут
    private int movement =2 ; //тут
    private boolean alive = true; //и тут
    public String name = "Big Monster"; //публичная переменная имя монстра (тип ? )//default man
    public char NameChar1 = 'B';
    public int xPosition = 0; //тут
    public int yPosition = 0;//тут
    public static int numOfMonsters = 0;

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
    public boolean getAlive() ////создаем метод, который возвращает прайват переменную получить жизни ?
    {
        return  alive; //ВОЗВРАЩЕНИЕ ПЕРЕМЕННОЙ
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
            alive = false; //мертвый монстр
        }
    }

    public void moveMonster(Monster2[] monster, int arrayItemIndex ) { //создаем метод , подаем на него констркуктор монстер 2  , в массиве , и создаем интовую переменную индекса
        boolean isSpaceOpen = true; //создаем булевую переменую - присваеваем ей тру
        int maxXBoardSpace = battleBoard.length - 1; // создаем инту , которая возвращает нам разность между длинной строк таблицы и еденицей
        int maxYBoardSpace = battleBoard[0].length - 1; // создаем инту , которая возвращает нам разность медлу длинной стобцов и еденицей

        while (isSpaceOpen) { //пока переменная выше булевая тру делаем :
            int randomMoveDirection = (int) (Math.random() * 4); //создаем рандомную инту (число - это диапазон , тут от 0 до 3)
            int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1)); //создаем рандомную инту, умноженную на диапазон , который берется из значения мувемент , который мы либо задаем либо он стандартный + 1
            System.out.println(randMoveDistance + " " + randomMoveDirection); //выводим наши две вышенаписанные переменные
            battleBoard[this.yPosition][this.xPosition] = '*'; //заполняем данные нашего текущего положения места монстра звездочкой
            if (randomMoveDirection == 0) { //ЕСЛИ наше первое рандомное число равно 0 то делаем
                if ((this.yPosition - randMoveDistance) < 0) { //ЕСЛИ y-позиция нашего монстра минус произведения рандомного числа из значеня монстра мувемент меньше 0 то
                    this.yPosition = 0; //присваеваем у-поицию монстра нулю
                } else { //иначе , если не меньше нуля
                    this.yPosition = this.yPosition - randMoveDistance; //присваеваем новую у-позицию разность между нашим текущим положением и рандомным значением randMoveDistance
                }
            } else if (randomMoveDirection == 1) { // ИНАЧЕ ЕСЛИ наш первый рандом равен 1 делаем :

                if ((this.yPosition + randMoveDistance) > maxXBoardSpace) { //если сумма нашей текщей х-позиции и рандомного второго числа больше нашей максимальной длинны строк ?  то
                    this.xPosition = maxXBoardSpace; //присваевам новое значение положение по х-координатам
                } else { //иначе
                    this.xPosition = xPosition - randMoveDistance; //присваем новое х-значение которое равно разности между текущим х-позицией и рандомным вторым числом
                }

            } else if (randomMoveDirection == 2) { //ИНАЧЕ ЕСЛИ наш первый рандом равен 2 делаем :

                if ((this.yPosition + randMoveDistance) > maxYBoardSpace) {  //если сумма нашей текщей у-позиции и рандомного второго числа больше нашей максимальной длинны СТОЛБЦОВ ?  то
                    this.yPosition = maxYBoardSpace; //присваеваем нашему у-позиции макисальное количество длинны столбцов-1
                } else { //ИНАЧЕ
                    this.yPosition = yPosition - randMoveDistance; //присваем у-позиции разность между нашей изначальной у-позицией и второму рандомЗначению
                }
            } else {   //ИНАЧЕ ВСЕГО ЭТО ДЕРЬМА ДЕЛАЕМ :
                if ((this.xPosition - randMoveDistance) < 0) { //если текущая икс-позиция меньше нулья
                    this.xPosition = 0; //присваеваем ей нуль
                } else { //иначе
                    this.xPosition = xPosition - randMoveDistance;//присваеваем нашей икспозиции разность между текущей позицией и рандомному числу
                }
            }

            for (int i = 0; i < monster.length; i++) { //КРУТИМ ЦИКЛ СТОЛЬКО СКОЛЬКО длинна строк монстра ? что
                //monster frank x=1 y=3
                if (i == arrayItemIndex) { //если счетчик равен индексу (на который мы подаем значение)
                    continue; ///продолжаем ? что
                }
                if (onMySpace(monster, i, arrayItemIndex)) { //ЕСЛИ (вызываем метод , вызываем и , вызываем  значение , которое подаем на метод)
                    isSpaceOpen = true;  // наше изначальное булевое присваеваем тру
                    break; //откидываемся
                } else { //ИНАЧЕ
                    isSpaceOpen = false; //меняем на фолс
                }
            }
        } //end of while loop
        battleBoard[this.yPosition][this.xPosition] = this.NameChar1; //всовываем в наши новые коорлинаты букву нашего монстра

    }


    public boolean onMySpace(Monster2[] monster, int indexToChk1, int indexToChk2) { //создаем метод ,принимает на себя имя монстра , номер счетчика выше (это длинна монстра) и значение индекса , котоое int arrayItemIntex = ArrayUtils.indexOf(Monsters, m);
        if ((monster[indexToChk1].xPosition) == (monster[indexToChk2].xPosition) && (monster[indexToChk1].yPosition) == (monster[indexToChk2].yPosition)) //если значение совпадают
        {
            return true; //возвращаем тру
        } else {
            return false;//или фолс
        }


    }


        public Monster2(int newHealth, int newAttack, int newMovement, String name)  //конструктор
        {
            this.health = newHealth;        //на этот конструктор подаем только четыре параметра
            this.attack = newAttack;        //а не все как по умолчанию
            this.movement = newMovement;
            this.name = name;   //нейм можно менять потому что он паблик
            int maxXBoardSpace = battleBoard.length - 1; //создаем переменную интовую , она равна 9 поидее (КОРОЧЕ ЭТО КОЛИЧЕСТВО СТРОК - 1)
            int maxYBoardSpace = battleBoard[0].length - 1; //создаем переменную интовую , она тоже равна 9 (это количество стобцов в первой строке - 1)
            int randNumX, randNumY; //создаем просто интовый две переменных
            do {            //ДЕЛАТЬ

                randNumX = (int) (Math.random()*maxXBoardSpace); //короче берем рандомное число и умнажаем на 9
                randNumY = (int) (Math.random()*maxYBoardSpace); //то же самое и для этого дерьма

            }while (battleBoard[randNumX][randNumY] != '*'); // ПОКА (наш первый массив) , присваем ему нове значение (создает рандомный двумерный массив) НЕ РАВЕН *
            this.xPosition = randNumX;  //всовываем новое значение х в переменную выше
            this.yPosition = randNumY; //всовываем новое значение у в переменную выше
            this.NameChar1 = this.name.charAt(0); //в эту переменную суем первую букву имени монстра

            battleBoard[this.yPosition][this.xPosition] = this.NameChar1; //КОРОЧЕ  В ЭТИ РАНДОМНЫЕ КООРДИНАТЫ СУЕМ НАЗВАНИЕ БУКВЫ МОНСТРА
            numOfMonsters++;     //чтото увелипчиваем на 1

        }


    //Default Constructor
    public Monster2() //конструктор по умолчанию
    {
        numOfMonsters++;
    }

    public static void main (String[]args){ //создали запускающуюся штуку
        Monster2 Frank = new Monster2(); //создали новый обьект , вызвали конструктор по дефолту
        System.out.println(Frank.attack); //вывели значение атака (20)
    }

    public Monster2(int newHealth){ //создали конструктор который принимает на себя только здоровье
        health = newHealth;
    }

    public Monster2(int newHealth, int newAttack) //создали конструктор , который принимает на себя здорове и атаку
    {
        this(newHealth); //создаем новую переменную ?
        attack = newAttack; //приняли значение сверху (20)
    }
}
