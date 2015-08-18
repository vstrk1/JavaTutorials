/**
 * Created by v.stuparenko on 31.07.2015.
 */
public class Vehicle  extends  Crashable implements  Drivable, Cloneable { // создали класс который реализует интерфейс драйвейбл
    int numOfWheels = 2; // интовая переменная
    double theSpeed = 0; // скорость
    int carStrength = 0; // длинна

    public int getWheel() {
        return  this.numOfWheels;
    } // метод возвращает количество колес

    public void setWheels(int numWheels){  //создаем пустой метод (принимает кол во колес)
        this.numOfWheels = numWheels; // берем кол во колес сверху
    } // устанавливавет кол во колес
    public double getSpeed(){
        return this.theSpeed;
    } // отображает скорость
    public double setSpeed(double speed){ // устанавливает скорость
     this.theSpeed = speed; // берем скорость сверху

        return speed; // возвращаем скорость
    }

    public Vehicle(){ //конструктор стандартный

    }
    public Vehicle(int wheels, double speed){ // создали конструктор , принимает колво колес и скорость
        this.numOfWheels = wheels; // ставит их в значения
        this.theSpeed = speed; // и это
    }

    public  void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    } //устанавливает длинну машины

    public  int getCarStrength(){
        return this.carStrength;
    } // отображает длинну машины

    public String toString(){ // метод создали
        return "Num of wheels : " + this.numOfWheels; //возвращает кол во колес
    }

    public Object clone(){ // метод клон
        Vehicle car; // создали переменную типа Vehicle
        try { //пробуем
            car = (Vehicle) super.clone(); //
        }catch (CloneNotSupportedException e){ //кетч ошибка
            return  null; // нуль возвращаем
        }
        return car; // машину вощвращает метод
    }
}
