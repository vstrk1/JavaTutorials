import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ��������� on 15.08.2015.
 */
public class PerformSystemCheck implements Runnable {    // ������� ����� , ����������� ������
    private  String checkWhat;    // ������� �������
    ReentrantLock lock = new ReentrantLock();    //������� ������ ���� (����� ����� ������� ����������� �� ����� ��������� ����������, ����� ���������� ����������� ������ ����� � reentrantLock, ��� � synchronized)

    public PerformSystemCheck(String checkWhat){   // ������� ����� , ��������� �� ������
        this.checkWhat = checkWhat;   // ���������� ���� ���� �������


    }

     public void run(){    //������� ����� ���
         lock.lock();    // ������� ����� , ������� ��������� ����� ����
         System.out.println("Checking" + this.checkWhat);  //���������� ���������
         lock.unlock(); // ������������ (�����������)

    }
}
