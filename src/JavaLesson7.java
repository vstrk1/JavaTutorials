/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class JavaLesson7 { //������� ����� �����
    public static void main(String[] args) //������������� �����
    {
        Monster Frank = new Monster(); //������� ����� ������ (����������� �����������)
        Frank.name = "Frank"; //���� ��� ����� ��� (��� ���������� ��������� ������� �� �������� ��� �����)
       System.out.println(Frank.name+"has on attack of " +Frank.getAttack()); //��������� ��� ������ ������� + ��������� ����������
    }


}
