import java.util.Scanner;

/**
 * Created by v.stuparenko on 08.07.2015.
 */
public class JavaLesson2 {
static Scanner userInput = new Scanner(System.in);  //scanner - ������� ��������� ��������,��������� �� ���� (System.in)
    public static void main(String[] args){
        System.out.print("Your favorite number:"); //������� ������
        if (userInput.hasNextInt()){ //���� (� ������ ����� userInput ����� ������� �����)
            int numberEntered = userInput.nextInt(); //������� ���������� , ���� � ��� ������ ��������� � ����
            System.out.println("You entered " + numberEntered); //�� ����� + ����� ���������� ����

            int numEnteredTimes2 = numberEntered + numberEntered;//��������� ��� ���� ���������� - ��� ����� ����� ��� ��� �� �����
            System.out.println(numberEntered + "+" + numberEntered + "=" + numEnteredTimes2);//������� ���� , ���� ����� �����

            int numEnteredTimesSelf = numberEntered * numberEntered; //������������
            System.out.println(numberEntered + "*" + numberEntered + "=" + numEnteredTimesSelf); //�������

            int numEnteredMinus2 = numberEntered - 2; //����� - 2
            System.out.println(numberEntered + " - 2 ="  + numEnteredMinus2); //�������

            int numEnteredDivide2 = numberEntered / 2; //������� �� ���
            System.out.println(numberEntered + " / 2 ="  + numEnteredDivide2);//�������

            int numEnteredRemainder= numberEntered % 2; //������� ���
            System.out.println(numberEntered + " % 2 ="  + numEnteredDivide2); //�������
            numberEntered +=2; //+2
            numberEntered -=2; //-2
            numberEntered--; //-1
            numberEntered++; //+1
            int numberABS = Math.abs(numberEntered); //7
            int whichIsBigger = Math.max(5, 7);//5
            double numSQRT = Math.sqrt(5.23);
            int numCeiling = (int) Math.ceil(5.23);
            int numFloor = (int) Math.floor(5.23);//5
            int numRound = (int) Math.round(5.63);//6
            int randomNumber = (int) (Math.random()*11); //������� ��������� �����
            System.out.println("Random Number " + randomNumber); //������� ������ �������

            /*
            *               //��� ����� ������ ��������
             */
        }else {
            System.out.println("Enter an integer next time"); //� ���� ����� �� ����� ���������� ���������

        }
    }
}
