/**
 * Created by v.stuparenko on 09.07.2015.
 */
public class JavaLesson3 {
    public static  void main(String[] args){
        int randomNumber = (int) (Math.random()*50); //������� ��������� �����

        /*Relational Operators:
        Java has 6 relational operators
        * > : Greater Than
        * == : Equal To
        * != : Not Equal To
        * >= : Greater Yhan Or Equal To
        * <= : Less Than Or Equal To
         */
    if (randomNumber< 25){
        System.out.println("The random number is less than 25");      //�� ��� ��� ����
    }
        else if (randomNumber > 40) {
        System.out.println("The random number is greater than 40");
    }
    else if (randomNumber == 18) {
        System.out.println("The random number is equal to 18");         //�� ��� ��� ����
    }
    else if (randomNumber != 40) {
        System.out.println("The random number is not equal to 40");     //�� ��� ��� ����
    }
        else {
        System.out.println("Nothing Worked");                           //������ �� ��������
    }
        if (!(false)) //���� ���
        {
            System.out.println("\nI turned false into true"); //�������
        }
        if ((false) ^ (true)) //�������� �� ������ ��� //������ ��� ����� �������� ������
        {
            System.out.println("One are true");
        }
        System.out.println("The random number is " + randomNumber);
    }
}
