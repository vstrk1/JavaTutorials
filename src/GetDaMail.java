
public class GetDaMail implements Runnable{    //������� ����� , ������� ��������� ��������� �������
    private int startTime;                  //��������� ����
    public GetDaMail(int startTime){  //������� ����������� , ��������� �� ���� �����
        this.startTime = startTime;             //����������  �� � ����� ����
    }
    public void run(){              // ������� ��� �����
        try{            //����
            Thread.sleep(startTime * 1000); //��� �������� �� ����� ������� �������� � ����� ���� * 1000
        }catch (InterruptedException e) //����
        {
            System.out.println("Checking mail");
        }
            }

}
