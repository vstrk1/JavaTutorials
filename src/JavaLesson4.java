/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class JavaLesson4 {
    public static void main(String[] args)
    {
        int i =1; //��������� ����������
        while(i <= 20) //���� i ������ 20 ������
        {
            if(i ==3) {  //���� i = 3
                i+=2 //i ���������� 2
                ;continue;} //����������
            System.out.println(i); //������� ���������� i � �������
            i++; // ����������� �� 1
            if ((i%2)==0) //���� ����� ������
            {
                i++;    //����������� �� 1
            }
            if(i>10) //���� ����� ������ 10
            {
                break; //�������� � �������� ������
            }
        }
    }
}
