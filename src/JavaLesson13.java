import java.util.Arrays;

public class JavaLesson13 { //������� �����
    public static void main(String[] args){ //������� ����� ������� ��������� �����
        String randoString = "I'm just a randomstring"; //������� ������
        String gotToQuote = "He said, \"I'm here\""; //������ ������
        System.out.println(randoString + " " + gotToQuote); // ��������� ������ � ������ , ���������� ��
        int numTwo = 2; // ������� �����
        System.out.println(randoString + " " + numTwo); // ������ ������� �����
        String uppercaseStr = "BIG"; //������ � ������
        String lowercaseStr = "big"; //���
        if (uppercaseStr.equalsIgnoreCase(lowercaseStr)){ //���� ������ ������ �������� �� �� ��� � ������� (��� ����� �������)
            System.out.println("They`re equal"); //��������� �������
        }
        String letters = "abcde"; //������� ������
        String moreLetters = "fghijk"; //������
        System.out.println("2nd char : " +letters.charAt(1)); //���������� ������� + ������ ����� ������ ����������
        System.out.println(letters.compareTo(moreLetters)); //���������� ������ ������ � ������ , ��� ������������ ������� ���������� ������������ �����
        System.out.println(letters.contains("abc")); //���������� ��� , ���� ����� ������ ��������� ������ �����
        System.out.println(letters.endsWith("de")); //���������� ��� , ���� ������ ������ ������������ �� ������ �������
        System.out.println(letters.indexOf("cd")); //���������� ������ ������ ���� � ������ ������


        System.out.println("Length : " + letters.length()); // ���������� ������ ������
        String[] letterArray  = letters.split(" "); // ������� ������ �� �������� , ��������� ������ ������ ��������
        System.out.println(Arrays.toString(letterArray)); // ����������� ������ � ������ , ���������� ��
        char[] charArray = letters.toCharArray();  // ������� ������ ��� �����  , ���� � ���� ���� � ������ �������
        System.out.println(letters.substring(1, 4)); // ���������� �� ��� � ������� �� 4 ������
        String randString = "              qwerty         "; //������� ������
        System.out.println(randString.trim()); //������� �� ��� ���������


        StringBuilder randSB = new StringBuilder("A random value"); // ������ ������ ������ �������  , �� ������ �������  , ������� , ���� � ��� ��������
        System.out.println(randSB.append(" again")); // �������� � ���� ������ ������ ������
        System.out.println(randSB.delete(15, 21)); // ������� ��� ��� ����� �������� ���� ��������
        randSB.ensureCapacity(60); // ������ ��������� � ������ ��� 60 ������� ??
        System.out.println(randSB.capacity()); // ���������� ������� �������
        System.out.println(randSB.length()); //���������� ������� ������
        randSB.trimToSize(); // ������ �������� ������� ������� ���
        System.out.println("TRY TO TRIM -  " + randSB.capacity()); // ���������� ������ �������
        System.out.println(randSB.insert(1, "nother")); //  ��������� � ������ �������� � �������� ����������������
        String oldSB = randSB.toString(); //���������� ������ ������ � �������
        //You can also specify da index to start searching from
        //indexOf(StringToLookFor, IndexStartPosition)

        //lastIndexOf()works like indexOf except it starts from da






        /* You convert primitive types to a string with toString
         * String byteString = Byte.toString(bigByte);
         * String shortString = Short.tiString(bigByte);
         * String intString = Integer.toString(bigInt);
         * String longString = Long.toString(bigByte);
         * String floatString = Float.toString(bigByte);
         * String doubleString - Double.toString(bigByte);
         * String booleanString = Boolean.toString(bigByte);
         *
         * You convert from String to primitives with parse
         * int stringToInt = Integer.parseInt(intString);
         * parseSort, parseLong, parseByte,
         * parseBoolean, parseFloat
         */
    }
}
