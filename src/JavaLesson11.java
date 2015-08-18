import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaLesson11{ //создаем класс
    public static void main(String[] args){ //создаем метод для запуска
        ArrayList arrayListOne; // создаем аррайлист
        arrayListOne = new ArrayList(); //инициализируем переменную

        ArrayList arrayListTwo = new ArrayList(); //создаем и инициализирум переменную
        ArrayList<String> names = new ArrayList<String>();//создаем лист из стрингов, инициализируем его

        names.add("John Smith"); /// добавляем в лист строку  0
        names.add("Mohamed Alami"); //еще раз 1
        names.add("Oliver Miller"); //еще раз 2

        names.add(2, "Jack Ryan"); //суем по приоретету в вторую строку райна
        names.set(0, "John Adam"); // меням смита на адама
        names.remove(3); //удаляем третье знаение

        for(int i=0; i< names.size(); i++){ // крутим цикл столько раз сколько у нас длинна аррайлиста неймес
            System.out.println(names.get(i)); //выводи содержимое каждой записи
        }
        System.out.println("________________________"); //строка
        //names.removeRange(0,1);
        System.out.println(names); //показываем лист
        System.out.println("________________________"); //строка
        for(String i : names){ //крутой цикл
            System.out.println(i);// показываем то же самое

        }
        System.out.println("________________________"); //строка
        Iterator indivItems = names.iterator(); //создаем итератор инициализируем еге к аррайлисту неймс
        while(indivItems.hasNext()){ // ПОКА (выдает тру пока в листе есть  еще елемент )
            System.out.println(indivItems.next());// показываем елемент
        }
        ArrayList nameCopy = new ArrayList(); //создаем новый лист , инициализируем его
        ArrayList nameBackUp = new ArrayList(); // с этим тоже

        nameCopy.addAll(names); //короче добавляем все єлементы которые были в листе неймс
        String paulYung = "Paul yung"; //создаем стринг
        names.add(paulYung); //добавляем его в аррей неймс
        if (names.contains(paulYung)){ //если  лист неймс содержит нашего янга
            System.out.println("Paul is here"); //выдаем месседж
        }
        if (nameCopy.containsAll(names)) { //если  второй лист содержит все то что в неймс (что не так потому что мы пауля добавили)

            System.out.println("Everything in nameCopy is in names"); // месседж
        }
        ///copied names to nameCopy
        //added to names
        names.clear(); //очищаем первый лист
        if(names.isEmpty()){ //если лист пустой
            System.out.println("ArrayList is Empty"); //месседж
        }
        Object[] moreNames = new Object[4]; //создаем массив инициализируем
        moreNames = nameCopy.toArray(); //суем список в массив

        System.out.println(Arrays.toString(moreNames));  // делаем из массива строку , отображаем ее
    }

}
