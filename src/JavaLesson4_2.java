import java.util.Scanner;

/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class JavaLesson4_2 {
        static Scanner userinput = new Scanner(System.in); //scanner - ������� ��������� ��������,��������� �� ���� (System.in)
        public static void main (String[] args) {
        String contYorn = "Y"; //������� ����������
        int h = 1; //������� ���������� , ���� 1
        while (contYorn.equalsIgnoreCase("y")) //���� (���������� �������� ���������� , � ������ �������� , ��� ������ )
        {
            System.out.println(h); //������� h
            System.out.println("Continue y or n ? "); //�������
            contYorn = userinput.nextLine(); //���� � ��� ��� �����
            h++; //����������� h �� 1
        }
    }
}
