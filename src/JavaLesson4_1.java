/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class JavaLesson4_1 {
    public static void main(String[] args)
    {
        double myPi  = 4.0; //������� ���������� ����
        double j = 3.0; //��� ����
        //4-4/3+4/5-4/7
        while (j<8001){ //���� ������ ���������� ����� ������ 8001 �����
            myPi = myPi- (4/j)+(4/(j+2)); //����������� ���������� ���� �������� ���� ���� ��
            j +=4;
            System.out.println(myPi);// ������� ���� ����� ��
        }
        System.out.println("Value of PI" + Math.PI); //������� ������������ ����� ��
    }
}
