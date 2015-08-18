/**
 * Created by v.stuparenko on 31.07.2015.
 */
public abstract class Crashable { //создали абстрактный клас
    boolean carDrivable = true; // булевая переменная

    public void youCrashed(){ // пустой метод , ставит первую переменную в положение фолс
        this.carDrivable = false;
    }
    public abstract  void setCarStrength(int carStrength); // обстрактный метод

    public abstract int getCarStrength();
}
