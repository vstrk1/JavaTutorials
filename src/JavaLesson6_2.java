import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by v.stuparenko on 14.07.2015.
 */
public class JavaLesson6_2 {
    public static void main (String[] args){ //������� ����� ������� ��������� �����
        try {   //�������
            getAFile("./somestuff.txt");    //����� �������������� ���� , �������� ������� ������� ���� � ��������
        }catch (IOException e){ //����� ��������
            System.out.println("An IO Error Occuped");
        }
        }

    public static void getAFile(String fileName) throws IOException, FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);
    }

}

