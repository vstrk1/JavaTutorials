
public class GetDaMail implements Runnable{    //создали класс , который реализует интерфейс ранейбл
    private int startTime;                  //приватная инта
    public GetDaMail(int startTime){  //создали конструктор , принимает на себя цифру
        this.startTime = startTime;             //засовывает  ее в старт тайм
    }
    public void run(){              // создали ран метод
        try{            //трай
            Thread.sleep(startTime * 1000); //тут засыпаем на время которое засунули в старт тайм * 1000
        }catch (InterruptedException e) //кетч
        {
            System.out.println("Checking mail");
        }
            }

}
