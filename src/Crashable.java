/**
 * Created by v.stuparenko on 31.07.2015.
 */
public abstract class Crashable { //������� ����������� ����
    boolean carDrivable = true; // ������� ����������

    public void youCrashed(){ // ������ ����� , ������ ������ ���������� � ��������� ����
        this.carDrivable = false;
    }
    public abstract  void setCarStrength(int carStrength); // ����������� �����

    public abstract int getCarStrength();
}
