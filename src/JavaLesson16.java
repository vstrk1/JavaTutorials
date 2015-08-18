
public class JavaLesson16 { //c������ �����
    public static void main(String[] args){ //�����
        Object superCar = new Vehicle(); // ������� ����� ������

        System.out.println(((Vehicle)superCar).getSpeed()); //������� � ������� ������� ������� super car
        Vehicle superTruck = new Vehicle(); // ������� ������ ���� ������ ???
        System.out.println(superCar.equals(superTruck)); // ���������� ������ �������� � ���������

        System.out.println(superCar.hashCode()); // ������� ��� ���������
        System.out.println(superCar.getClass()); //������� �������� ������ ���������
        System.out.println(superCar.getClass().getName()); //������� ��� ������ ?

        if(superCar.getClass() == superTruck.getClass()){ //���� ������ ���� �������� ���������
            System.out.println("The same"); //������� �������

            System.out.println(); // ������ ������
            System.out.println(superCar.getClass().getSuperclass()); // //������� ����������
            System.out.println("___________________________");
            System.out.println(superCar.toString()); //������ ����� ����� VEHICLE � �� ����������� �����
            System.out.println("___________________________");
        int randNum = 100; // ��� ����������
            System.out.println(Integer.toString(randNum)); // � ��� ������� ������������ ����� �� ������ , � �� ���� ������ ���� 100

            superTruck.setWheels(8); // ��������� 8 �����
            Vehicle superTruck2 = (Vehicle)superTruck.clone(); // ������� ����� ������ , ������� � ���� ��� ��������� � ������� �������
            System.out.println(superTruck.getWheel()); // ������� ��� �� ���� ������� ����������
            System.out.println(superTruck2.getWheel()); // ������� ����������
            System.out.println(superTruck.hashCode()); // �� � ��� ������ ��� ��� !!
            System.out.println(superTruck2.hashCode());


        }

    }
}
