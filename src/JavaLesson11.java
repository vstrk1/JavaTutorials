import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaLesson11{ //������� �����
    public static void main(String[] args){ //������� ����� ��� �������
        ArrayList arrayListOne; // ������� ���������
        arrayListOne = new ArrayList(); //�������������� ����������

        ArrayList arrayListTwo = new ArrayList(); //������� � ������������� ����������
        ArrayList<String> names = new ArrayList<String>();//������� ���� �� ��������, �������������� ���

        names.add("John Smith"); /// ��������� � ���� ������  0
        names.add("Mohamed Alami"); //��� ��� 1
        names.add("Oliver Miller"); //��� ��� 2

        names.add(2, "Jack Ryan"); //���� �� ���������� � ������ ������ �����
        names.set(0, "John Adam"); // ����� ����� �� �����
        names.remove(3); //������� ������ �������

        for(int i=0; i< names.size(); i++){ // ������ ���� ������� ��� ������� � ��� ������ ���������� ������
            System.out.println(names.get(i)); //������ ���������� ������ ������
        }
        System.out.println("________________________"); //������
        //names.removeRange(0,1);
        System.out.println(names); //���������� ����
        System.out.println("________________________"); //������
        for(String i : names){ //������ ����
            System.out.println(i);// ���������� �� �� �����

        }
        System.out.println("________________________"); //������
        Iterator indivItems = names.iterator(); //������� �������� �������������� ��� � ���������� �����
        while(indivItems.hasNext()){ // ���� (������ ��� ���� � ����� ����  ��� ������� )
            System.out.println(indivItems.next());// ���������� �������
        }
        ArrayList nameCopy = new ArrayList(); //������� ����� ���� , �������������� ���
        ArrayList nameBackUp = new ArrayList(); // � ���� ����

        nameCopy.addAll(names); //������ ��������� ��� �������� ������� ���� � ����� �����
        String paulYung = "Paul yung"; //������� ������
        names.add(paulYung); //��������� ��� � ����� �����
        if (names.contains(paulYung)){ //����  ���� ����� �������� ������ ����
            System.out.println("Paul is here"); //������ �������
        }
        if (nameCopy.containsAll(names)) { //����  ������ ���� �������� ��� �� ��� � ����� (��� �� ��� ������ ��� �� ����� ��������)

            System.out.println("Everything in nameCopy is in names"); // �������
        }
        ///copied names to nameCopy
        //added to names
        names.clear(); //������� ������ ����
        if(names.isEmpty()){ //���� ���� ������
            System.out.println("ArrayList is Empty"); //�������
        }
        Object[] moreNames = new Object[4]; //������� ������ ��������������
        moreNames = nameCopy.toArray(); //���� ������ � ������

        System.out.println(Arrays.toString(moreNames));  // ������ �� ������� ������ , ���������� ��
    }

}
