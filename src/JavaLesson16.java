
public class JavaLesson16 { //cоздали класс
    public static void main(String[] args){ //метод
        Object superCar = new Vehicle(); // создали новый обьект

        System.out.println(((Vehicle)superCar).getSpeed()); //выводим в консоль скорось обьекта super car
        Vehicle superTruck = new Vehicle(); // создаем обьект типа обьект ???
        System.out.println(superCar.equals(superTruck)); // сравниваем обьект суперкар и супертрак

        System.out.println(superCar.hashCode()); // выводим хеш суперкара
        System.out.println(superCar.getClass()); //выводим названия класса суперкара
        System.out.println(superCar.getClass().getName()); //выводим имя класса ?

        if(superCar.getClass() == superTruck.getClass()){ //если классы двух обьектов одинаковы
            System.out.println("The same"); //выводим месседж

            System.out.println(); // пустая строка
            System.out.println(superCar.getClass().getSuperclass()); // //выводим суперкласс
            System.out.println("___________________________");
            System.out.println(superCar.toString()); //вывели метод класа VEHICLE А НЕ СТАНДАРТНЫЙ МЕТОД
            System.out.println("___________________________");
        int randNum = 100; // инт переменная
            System.out.println(Integer.toString(randNum)); // а это вызвали стьандартный метод то стринг , и на него подали инту 100

            superTruck.setWheels(8); // поставили 8 колес
            Vehicle superTruck2 = (Vehicle)superTruck.clone(); // создали новый обьект , забрали у него все параметры с первого обьекта
            System.out.println(superTruck.getWheel()); // получае кол во колс первого супертрака
            System.out.println(superTruck2.getWheel()); // второго супертрака
            System.out.println(superTruck.hashCode()); // но у них разный ХЕШ КОД !!
            System.out.println(superTruck2.hashCode());


        }

    }
}
