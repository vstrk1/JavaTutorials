import java.util.Scanner;

/**
 * Created by v.stuparenko on 13.07.2015.
 */
public class JavaLesson5 {  //������� �����
    static int randomNumber; //������� ����������� �����
    static Scanner userInput = new Scanner(System.in); //������� ��������� ��������
    public static void main(String[]args){ //����������� �����

        System.out.println(getRandomNum()); //���������� �� ������ ������� getRandomNum
        int guessResult = 1; //������� �����
        int randomGuess = 0; //������� ����� ���������  = 0
        while (guessResult != -1) //���� ��������� �� ����� -1 ������ {
        {
            System.out.println("Guess a number between 0 and 50"); //���������� ������� ��� ��������� ����� ����� 0 � 50
            randomGuess  = userInput.nextInt();     //������ ����� � ��������� ���� , ��������� ���������� � ���������� ������ ����
            guessResult = checkGuess(randomGuess); //� ���� ���������� ��������� ���������� ��������� �������, ������� ��������� �� ���� ���������, �� ��� �� ����� � ���� ������
        }
        System.out.println("Yes the random number is " + randomGuess); //���������� ������� � ����� ������� �� ����� , ���� ��� ���������
    }

   public static int getRandomNum(){             // ������� ������� ������� , ������ �� ���� �� ���������
  randomNumber = (int) (Math.random() * 51); //������� ���������� , (�� ���� ��� ����������), � ���������� ���� ��������� �����
       return randomNumber; //������� ���������� ��� ����������
}
    public static int checkGuess(int guess)     //������� �������  �������� ���������� �����, ������� �� �����
    {
        if (guess== randomNumber){      //���� ��������� ����� = ������ ����������
            return  -1;     //���������� -1 , ������� �������� ��� ����� �� ������ while ,  � ������� � ��������
        }else //�����
        {
            return guess; //���������� guess2
        }
    }
}
