/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class Monster {          //������� ����� �������
    public final  String TOMBSTONE = "Here Lies a Dead monster"; //���������� ����� � ��������  //�������� ��������� ������
    private int health = 500; //��������� ����������
    private int attack = 20; //���
    private int movement =2 ; //���
    private int xPosition = 0; //���
    private int yPosition = 0;//���
    private boolean alive = true; //� ���
    public String name = "Big Monster"; //��������� ���������� ��� ������� (��� ? )//default man

    public int getAttack()  //������� ����� , ������� ���������� ������� ���������� �����
    {
        return  attack; //�����������
    }

    public int getMovement()    //������� �����, ������� ���������� ������� ����������
    {
        return  movement; //�����������
    }

    public int getHealth() ////������� �����, ������� ���������� ������� ���������� �������� ����� ?
    {
        return  health; //����������� ����������
    }
    public void setHealth(int decreaseHealth) //������� ����� �� ��������� �������� , ��������� �� ���� ���������� ���
    { //���� ������ �� ���������� ���
        health = health - decreaseHealth; //���������  ������ ��������
        if (health<0) //���� ���� �������� ������ ����
        {
            alive = false;   //�� ������� (((
        }
    }
    public void setHealth(double decrease)    //����� ������� � ����������� ������ //������ ��� ����� �� ����� ��� � ����
            //������ ��������� �� ���� ������ �������� (������� � ����� ���������� ?)
    {
        int intDecreaseHealth = (int) decrease; //������� ���������� � ��
        health = health - intDecreaseHealth;
        if (health<0)       //��� ������� ��� � ����
        {
            alive = false;
        }
    }

        public  Monster(int newHealth, int newAttack, int newMovement)  //�����������
        {
            this.health = newHealth;        //�� ���� ����������� ������ ������ ��� ���������
            this.attack = newAttack;        //� �� ��� ��� �� ���������
            this.movement = newMovement;
        }

    //Default Constructor
    public Monster() //����������� �� ���������
    {

    }

    public static void main (String[]args){ //������� ������������� �����
        Monster Frank = new Monster(); //������� ����� ������ , ������� ����������� �� �������
        System.out.println(Frank.attack); //������ �������� ����� (20)
    }

    public Monster(int newHealth){ //������� ����������� ������� ��������� �� ���� ������ ��������
        health = newHealth;
    }

    public Monster(int newHealth, int newAttack) //������� ����������� , ������� ��������� �� ���� ������� � �����
    {
        this(newHealth); //������� ����� ���������� ?
        attack = newAttack; //������� �������� ������ (20)
    }
}
