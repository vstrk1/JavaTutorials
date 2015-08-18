import java.util.Arrays;

/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class Monster2 {          //������� ����� �������2
    static char[][] battleBoard = new char[10][10];   //c������ ��������� ������ battleBoard /char -���������� ���/ ������ (�������� ��� ������ � ����� ����� , �� �������� ������)
    public static void boildBattleBoard(){  //����� �����������  ����� (������ �� ����������)
        for (char[] row: battleBoard)   //��� (�������  ���������� ������ row)/(row:������) //������� - ������������� ROW ������ ������������� ����� ������� ���������� ������� BattleBoard (100 ��� ����� ���� � ������ ������)
        {
            Arrays.fill(row,'*');       //��������� ������ (������ ��� ������, ��������� ��� ������������� )
        }
    }
    public static void redrawBoard()    //������� �����
    {
        int k = 1;          //������� ��������� � = 1
        while (k <= 30) {       //���� �<=30
            System.out.print("-");  //�������� ������
            k++;    //����������� �� 1
        }
        System.out.println(); //���� ������ �����

        for (int i = 0; i< battleBoard.length;i++)      //���  ������ ���� ������� ��� , ������� ����� !!!! (������� ������� � ������ ������) - 10
        {
            for (int j = 0; j<battleBoard[i].length; j++) // ������ ��� ���������� ����� ���� , ����������� ������� ��� ,������� �������� � ��������� ������ i - ��� ����� ������
            {
                System.out.print("|"+battleBoard[i][j]+"|" ); //������ ��� ������� ������ � ������ ������ ������������ ������� ����� � ������
            }

            System.out.println(); //������ ������
        }
        k = 1;
        while (k <= 30) {
            System.out.print("-");      //����� ������ ��������
            k++;
        }
        System.out.println();
    }
    public final  String TOMBSTONE = "Here Lies a Dead monster"; //���������� ����� � ��������  //�������� ��������� ������
    private int health = 500; //��������� ����������
    private int attack = 20; //���
    private int movement =2 ; //���
    private boolean alive = true; //� ���
    public String name = "Big Monster"; //��������� ���������� ��� ������� (��� ? )//default man
    public char NameChar1 = 'B';
    public int xPosition = 0; //���
    public int yPosition = 0;//���
    public static int numOfMonsters = 0;

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
    public boolean getAlive() ////������� �����, ������� ���������� ������� ���������� �������� ����� ?
    {
        return  alive; //����������� ����������
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
            alive = false; //������� ������
        }
    }

    public void moveMonster(Monster2[] monster, int arrayItemIndex ) { //������� ����� , ������ �� ���� ������������ ������� 2  , � ������� , � ������� ������� ���������� �������
        boolean isSpaceOpen = true; //������� ������� ��������� - ����������� �� ���
        int maxXBoardSpace = battleBoard.length - 1; // ������� ���� , ������� ���������� ��� �������� ����� ������� ����� ������� � ��������
        int maxYBoardSpace = battleBoard[0].length - 1; // ������� ���� , ������� ���������� ��� �������� ����� ������� ������� � ��������

        while (isSpaceOpen) { //���� ���������� ���� ������� ��� ������ :
            int randomMoveDirection = (int) (Math.random() * 4); //������� ��������� ���� (����� - ��� �������� , ��� �� 0 �� 3)
            int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1)); //������� ��������� ����, ���������� �� �������� , ������� ������� �� �������� �������� , ������� �� ���� ������ ���� �� ����������� + 1
            System.out.println(randMoveDistance + " " + randomMoveDirection); //������� ���� ��� �������������� ����������
            battleBoard[this.yPosition][this.xPosition] = '*'; //��������� ������ ������ �������� ��������� ����� ������� ����������
            if (randomMoveDirection == 0) { //���� ���� ������ ��������� ����� ����� 0 �� ������
                if ((this.yPosition - randMoveDistance) < 0) { //���� y-������� ������ ������� ����� ������������ ���������� ����� �� ������� ������� �������� ������ 0 ��
                    this.yPosition = 0; //����������� �-������ ������� ����
                } else { //����� , ���� �� ������ ����
                    this.yPosition = this.yPosition - randMoveDistance; //����������� ����� �-������� �������� ����� ����� ������� ���������� � ��������� ��������� randMoveDistance
                }
            } else if (randomMoveDirection == 1) { // ����� ���� ��� ������ ������ ����� 1 ������ :

                if ((this.yPosition + randMoveDistance) > maxXBoardSpace) { //���� ����� ����� ������ �-������� � ���������� ������� ����� ������ ����� ������������ ������ ����� ?  ��
                    this.xPosition = maxXBoardSpace; //���������� ����� �������� ��������� �� �-�����������
                } else { //�����
                    this.xPosition = xPosition - randMoveDistance; //�������� ����� �-�������� ������� ����� �������� ����� ������� �-�������� � ��������� ������ ������
                }

            } else if (randomMoveDirection == 2) { //����� ���� ��� ������ ������ ����� 2 ������ :

                if ((this.yPosition + randMoveDistance) > maxYBoardSpace) {  //���� ����� ����� ������ �-������� � ���������� ������� ����� ������ ����� ������������ ������ �������� ?  ��
                    this.yPosition = maxYBoardSpace; //����������� ������ �-������� ����������� ���������� ������ ��������-1
                } else { //�����
                    this.yPosition = yPosition - randMoveDistance; //�������� �-������� �������� ����� ����� ����������� �-�������� � ������� ��������������
                }
            } else {   //����� ����� ��� ������ ������ :
                if ((this.xPosition - randMoveDistance) < 0) { //���� ������� ���-������� ������ �����
                    this.xPosition = 0; //����������� �� ����
                } else { //�����
                    this.xPosition = xPosition - randMoveDistance;//����������� ����� ���������� �������� ����� ������� �������� � ���������� �����
                }
            }

            for (int i = 0; i < monster.length; i++) { //������ ���� ������� ������� ������ ����� ������� ? ���
                //monster frank x=1 y=3
                if (i == arrayItemIndex) { //���� ������� ����� ������� (�� ������� �� ������ ��������)
                    continue; ///���������� ? ���
                }
                if (onMySpace(monster, i, arrayItemIndex)) { //���� (�������� ����� , �������� � , ��������  �������� , ������� ������ �� �����)
                    isSpaceOpen = true;  // ���� ����������� ������� ����������� ���
                    break; //������������
                } else { //�����
                    isSpaceOpen = false; //������ �� ����
                }
            }
        } //end of while loop
        battleBoard[this.yPosition][this.xPosition] = this.NameChar1; //��������� � ���� ����� ���������� ����� ������ �������

    }


    public boolean onMySpace(Monster2[] monster, int indexToChk1, int indexToChk2) { //������� ����� ,��������� �� ���� ��� ������� , ����� �������� ���� (��� ������ �������) � �������� ������� , ������ int arrayItemIntex = ArrayUtils.indexOf(Monsters, m);
        if ((monster[indexToChk1].xPosition) == (monster[indexToChk2].xPosition) && (monster[indexToChk1].yPosition) == (monster[indexToChk2].yPosition)) //���� �������� ���������
        {
            return true; //���������� ���
        } else {
            return false;//��� ����
        }


    }


        public Monster2(int newHealth, int newAttack, int newMovement, String name)  //�����������
        {
            this.health = newHealth;        //�� ���� ����������� ������ ������ ������ ���������
            this.attack = newAttack;        //� �� ��� ��� �� ���������
            this.movement = newMovement;
            this.name = name;   //���� ����� ������ ������ ��� �� ������
            int maxXBoardSpace = battleBoard.length - 1; //������� ���������� ������� , ��� ����� 9 ������ (������ ��� ���������� ����� - 1)
            int maxYBoardSpace = battleBoard[0].length - 1; //������� ���������� ������� , ��� ���� ����� 9 (��� ���������� ������� � ������ ������ - 1)
            int randNumX, randNumY; //������� ������ ������� ��� ����������
            do {            //������

                randNumX = (int) (Math.random()*maxXBoardSpace); //������ ����� ��������� ����� � �������� �� 9
                randNumY = (int) (Math.random()*maxYBoardSpace); //�� �� ����� � ��� ����� ������

            }while (battleBoard[randNumX][randNumY] != '*'); // ���� (��� ������ ������) , �������� ��� ���� �������� (������� ��������� ��������� ������) �� ����� *
            this.xPosition = randNumX;  //��������� ����� �������� � � ���������� ����
            this.yPosition = randNumY; //��������� ����� �������� � � ���������� ����
            this.NameChar1 = this.name.charAt(0); //� ��� ���������� ���� ������ ����� ����� �������

            battleBoard[this.yPosition][this.xPosition] = this.NameChar1; //������  � ��� ��������� ���������� ���� �������� ����� �������
            numOfMonsters++;     //����� ������������ �� 1

        }


    //Default Constructor
    public Monster2() //����������� �� ���������
    {
        numOfMonsters++;
    }

    public static void main (String[]args){ //������� ������������� �����
        Monster2 Frank = new Monster2(); //������� ����� ������ , ������� ����������� �� �������
        System.out.println(Frank.attack); //������ �������� ����� (20)
    }

    public Monster2(int newHealth){ //������� ����������� ������� ��������� �� ���� ������ ��������
        health = newHealth;
    }

    public Monster2(int newHealth, int newAttack) //������� ����������� , ������� ��������� �� ���� ������� � �����
    {
        this(newHealth); //������� ����� ���������� ?
        attack = newAttack; //������� �������� ������ (20)
    }
}
