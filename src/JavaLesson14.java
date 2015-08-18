
public class JavaLesson14 { //������� ����
    public static void main(String[] args) { //����� ������� ��������� �����
        Animals genericAnimal = new Animals(); // ������� ���������� ���������� ����, ���������������� ��
        System.out.println(genericAnimal.getName()); // ������� ���
        System.out.println(genericAnimal.favFood); //������� ������� ���

        Cats morris = new Cats("Morris", "Tuna" , "Rubber Mouse"); //������� ���������� ����  ���� , ������������� �� (��������� �� ���� ��� ���������)
        System.out.println(morris.getName()); //���������� ���
        System.out.println(morris.favFood); //���
        System.out.println(morris.favToy); //�������


        Animals taddy = new Cats("Taddy", "Salmon", "Ball"); //������� ���������� ���� ������� , �������������� �� ����� ����
        acceptAnimal(taddy); //�������� ����� , ������� ��������� �� ���� ������

    }
    public static void acceptAnimal(Animals randAnimal){ //������� ����������� ����� (��������� �� ���� ������ ������)
        System.out.println(); //������ ������
        System.out.println(randAnimal.getName()); //������� ���� ������ �������
        System.out.println(randAnimal.favFood); // � ��� ������� ���

        randAnimal.walkAround(); // �������� ����� ���������
        Cats tempCat = (Cats) randAnimal; // ������� �������� ���� �� ���� ��������� �������� �������� ������� ������
        System.out.println(tempCat.favToy); // ���������� ��� ������� �������

        if(randAnimal instanceof  Cats) { //���������� ������ �� ������
            System.out.println(randAnimal.getName() + " is a Cat"); // ������� ��� �� ����
        }
    }
}
