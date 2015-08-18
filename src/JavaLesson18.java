import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaLesson18 {                                                                                             //������� �����
    public static void main(String[] args){            //����� ��� �������
        addThreadsToPool();                         //��� ��������� ����� , ������� ������ ����

    }
    public static void addThreadsToPool(){          // ������� �����
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);  //������� ������,�� ���� ������ ������ ���� ?
        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);//�������� ����� , ������� ������� ������������� ��������
        // � ���� ���������� ������ , ������� ����� ��������� , ����� �������� ������� ����������, ����� ����� ������ ����������� �
        //��� �������
        eventPool.scheduleAtFixedRate(new PerformSystemCheck(" Mail"), 5, 5, TimeUnit.SECONDS);
        //�������� ����� ������������ , �� ��� ������ ������� ������ � ������������ ����������
        eventPool.scheduleAtFixedRate(new PerformSystemCheck(" Calendar"), 10, 10, TimeUnit.SECONDS);
        // �� �� ����� �� � ������ ����������
        System.out.println("Number of threads " + Thread.activeCount()); //���� ���������� �������� �������
        Thread[] listOfThreads = new Thread[Thread.activeCount()]; // ������� ������ �� ���������� �������
        Thread.enumerate(listOfThreads); //������ �� �� �����
        for(Thread i : listOfThreads){ // � ������ ������ ���� ������� ������� �������� �������
            System.out.println(i.getName());  //������ ��� ������� �������� ������ ?  (��� ���� ����� ����������)
        }
        System.out.println("______________________________");
        for(Thread i : listOfThreads){     // ����� ���� ������� ������� ��������� �������
            System.out.println(i.getPriority());   // ���������� ��������� ������
        }
        System.out.println("_______________________________");
        eventPool.shutdown();                       //��������� ��� � ��������
        try{
            Thread.sleep(20000);   //���� �� 20 ���
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

