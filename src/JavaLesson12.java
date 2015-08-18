import java.util.Arrays;
import java.util.LinkedList;

public class JavaLesson12 { //создали класс
    public static void main(String[] args){ //создали метод который запускает класс
        LinkedList linkedListOne = new LinkedList();//создаем пустой список
        LinkedList<String> names = new LinkedList<String>(); //создаем список который содержит элементы стринг
        names.add("Ahmed Bennani"); //суем значение раз
        names.add("Ali Syed"); //два

        names.addLast("Nathan Martin"); //в конеч списка добавляем мартина
        names.addFirst("Joshua Smith"); //самоо первого джошуа
        names.add(0, "Noah Peeters"); //в первую ячейу (0) суем питера
        names.set(2, "Paul Newman"); // во вторую пауля
        names.remove(4); //удаляем четрверутю ячейку
        names.remove("Joshua Smith"); //удадяем конкретно джошуа

        for(String name : names) {  //крутим список столько сколько у нас элементов в листе
            System.out.println(name); //показываем имена
        }
        System.out.println("\nFirst Index : " + names.get(0)); //показываем первое имя
        System.out.println("\nLast Index : " + names.getLast()); //последнее
        LinkedList<String> nameCopy = new LinkedList<String>(names); // создаем лист  , в который суем список из неймов
        System.out.println("\nnameCopy: " + nameCopy); // показываем этот список

        if (names.contains("Noah Peeters")){ //если список содержит эту строку
            System.out.println("\nNoahs Here"); //выводим меседж в консоль
        }
        if(names.containsAll(nameCopy)){ //если в первом листе все тоже что и втором листе
            System.out.println("\nCollections the Same"); //показываем месседж
        }
        System.out.println("\nAli index at: " + names.indexOf("Ali Syed")); // показываем индекс записи
        System.out.println("\nList Empty: " + names.isEmpty()); //выводим булевое значение на проверку пустого спика
        System.out.println("\nHow Many: " + names.size()); // выволим количесто записей в листе
        System.out.println("\nLook without Error: " + names.peek()); //получает первый элемент из этого списка
        System.out.println("\nremove first element: " + nameCopy.poll()); ////получает и удалеяет первый элемент из списка
        System.out.println("\nremove last element: " + nameCopy.pollLast()); //получает и удаляет последний элемент из списка + выдает нул если список пустой
        nameCopy.push("Noah Peeters"); //толкает этот элемент в список  , лол
        nameCopy.pop(); // извлекаем лист з стека ?
        for(String name : nameCopy) { //крутим цикл столько , сколько у нас элементов в списке
            System.out.println(name); //отображаем первый список
        }
        Object[] nameArray = new Object[4]; //создаем одноимерный массив
        nameArray = names.toArray(); // короче список суем в массив
        System.out.println(Arrays.toString(nameArray)); //делаем из массива спискок и отображаем
        names.clear(); //очищаем список
    }
}
