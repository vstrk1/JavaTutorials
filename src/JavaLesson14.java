
public class JavaLesson14 { //создали клас
    public static void main(String[] args) { //метод который запускает класс
        Animals genericAnimal = new Animals(); // создали переменную кастомного типа, инициализировали ее
        System.out.println(genericAnimal.getName()); // выводим имя
        System.out.println(genericAnimal.favFood); //выводим любимую еду

        Cats morris = new Cats("Morris", "Tuna" , "Rubber Mouse"); //создаем переменную типа  кетс , иницализируем ее (принимает на себя три параметра)
        System.out.println(morris.getName()); //отображаем имя
        System.out.println(morris.favFood); //еду
        System.out.println(morris.favToy); //игрушку


        Animals taddy = new Cats("Taddy", "Salmon", "Ball"); //создаем переменную типа анималс , инициализируем ее через кетс
        acceptAnimal(taddy); //вызываем метод , который принимает на себя обьект

    }
    public static void acceptAnimal(Animals randAnimal){ //создаем статический метод (принимает на себя обьект анимал)
        System.out.println(); //пустая строка
        System.out.println(randAnimal.getName()); //выводим имся нашего обьекта
        System.out.println(randAnimal.favFood); // и его любимой еды

        randAnimal.walkAround(); // вызываем метод животного
        Cats tempCat = (Cats) randAnimal; // создаем ногового кота из того животного которого вснунули вначале метода
        System.out.println(tempCat.favToy); // показываем его любимую игрушку

        if(randAnimal instanceof  Cats) { //сравниваем первое со вторым
            System.out.println(randAnimal.getName() + " is a Cat"); // говорим что да окей
        }
    }
}
