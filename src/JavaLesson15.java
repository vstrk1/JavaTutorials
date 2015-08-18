
public class JavaLesson15 { // класс
    public static void main(String[] args){ //метод

        Vehicle car = new Vehicle(4,100.00); // создали переменную, инициализировали , ввели кол-во колес и скорость
        System.out.println("Cars max speed " + car.getSpeed()); // саут + скорость
        System.out.println("Num of wheels " + car.getWheel()); //саут  + кол-во колес
        car.setCarStrength(10); // установили длинну
        System.out.println("Strenght " + car.getCarStrength()); //вывели длинну



    }
}
