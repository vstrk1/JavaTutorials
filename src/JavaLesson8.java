/**
 * Created by v.stuparenko on 17.07.2015.
 */
public class JavaLesson8 {
    public static void main(String[] args){ //��� ������������� ��������
        Monster2.boildBattleBoard(); //��� �� �������� ����������� � ������ � ���� �������� �������
        char[][] tempBattleBoard = new char[10][10]; //��� �� ������� ���� ������
        //ObjectName[] Monsters = new OnbjectName[4];
        Monster2[] Monsters  = new Monster2[4]; //������� ������ �� �������� ���
      //  public Monster2(int newHealth, int newAttack, int newMovement, String name)
        Monsters[0] = new Monster2(1000, 20, 1 ,"Frank");   //� � ������ ����� ������ ������ ������ ������� , ������ ���
        Monsters[1] = new Monster2(2000, 40, 4 ,"Drak"); //��������� �������� , ����� , �������� � ��� , � ��� �� ��������� ��� ��� �������� �����������
        Monsters[2] = new Monster2(1900, 30, 2 ,"An");
        Monsters[3] = new Monster2(600, 24, 3 ,"KUSH ALIENS");

        Monster2.redrawBoard(); //���������� ���� �������� !!

    }


}
