import java.util.Arrays;
import java.util.LinkedList;

public class JavaLesson12 { //������� �����
    public static void main(String[] args){ //������� ����� ������� ��������� �����
        LinkedList linkedListOne = new LinkedList();//������� ������ ������
        LinkedList<String> names = new LinkedList<String>(); //������� ������ ������� �������� �������� ������
        names.add("Ahmed Bennani"); //���� �������� ���
        names.add("Ali Syed"); //���

        names.addLast("Nathan Martin"); //� ����� ������ ��������� �������
        names.addFirst("Joshua Smith"); //����� ������� ������
        names.add(0, "Noah Peeters"); //� ������ ����� (0) ���� ������
        names.set(2, "Paul Newman"); // �� ������ �����
        names.remove(4); //������� ���������� ������
        names.remove("Joshua Smith"); //������� ��������� ������

        for(String name : names) {  //������ ������ ������� ������� � ��� ��������� � �����
            System.out.println(name); //���������� �����
        }
        System.out.println("\nFirst Index : " + names.get(0)); //���������� ������ ���
        System.out.println("\nLast Index : " + names.getLast()); //���������
        LinkedList<String> nameCopy = new LinkedList<String>(names); // ������� ����  , � ������� ���� ������ �� ������
        System.out.println("\nnameCopy: " + nameCopy); // ���������� ���� ������

        if (names.contains("Noah Peeters")){ //���� ������ �������� ��� ������
            System.out.println("\nNoahs Here"); //������� ������ � �������
        }
        if(names.containsAll(nameCopy)){ //���� � ������ ����� ��� ���� ��� � ������ �����
            System.out.println("\nCollections the Same"); //���������� �������
        }
        System.out.println("\nAli index at: " + names.indexOf("Ali Syed")); // ���������� ������ ������
        System.out.println("\nList Empty: " + names.isEmpty()); //������� ������� �������� �� �������� ������� �����
        System.out.println("\nHow Many: " + names.size()); // ������� ��������� ������� � �����
        System.out.println("\nLook without Error: " + names.peek()); //�������� ������ ������� �� ����� ������
        System.out.println("\nremove first element: " + nameCopy.poll()); ////�������� � �������� ������ ������� �� ������
        System.out.println("\nremove last element: " + nameCopy.pollLast()); //�������� � ������� ��������� ������� �� ������ + ������ ��� ���� ������ ������
        nameCopy.push("Noah Peeters"); //������� ���� ������� � ������  , ���
        nameCopy.pop(); // ��������� ���� � ����� ?
        for(String name : nameCopy) { //������ ���� ������� , ������� � ��� ��������� � ������
            System.out.println(name); //���������� ������ ������
        }
        Object[] nameArray = new Object[4]; //������� ����������� ������
        nameArray = names.toArray(); // ������ ������ ���� � ������
        System.out.println(Arrays.toString(nameArray)); //������ �� ������� ������� � ����������
        names.clear(); //������� ������
    }
}
