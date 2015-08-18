import java.util.Arrays;

public class JavaLesson13 { //создали класс
    public static void main(String[] args){ //сохдали метод который запускает класс
        String randoString = "I'm just a randomstring"; //создали строку
        String gotToQuote = "He said, \"I'm here\""; //вторую строку
        System.out.println(randoString + " " + gotToQuote); // соеденили первую и вторую , отобразили ее
        int numTwo = 2; // создали цифру
        System.out.println(randoString + " " + numTwo); // вывели строкуи цифру
        String uppercaseStr = "BIG"; //строка с капсом
        String lowercaseStr = "big"; //без
        if (uppercaseStr.equalsIgnoreCase(lowercaseStr)){ //если перва€ строка содержит то же что в скобках (без учета реистра)
            System.out.println("They`re equal"); //показ≥ваем месседж
        }
        String letters = "abcde"; //создали строку
        String moreLetters = "fghijk"; //вторую
        System.out.println("2nd char : " +letters.charAt(1)); //показываем месседж + вторую букву первой переменной
        System.out.println(letters.compareTo(moreLetters)); //сравнивает первую строку с второй , при отицательном резалте показывает отицательное число
        System.out.println(letters.contains("abc")); //показываем тру , если пера€ строка стодержит данные буквы
        System.out.println(letters.endsWith("de")); //показываем тру , если перва€ строка заканчивает€ на данные символы
        System.out.println(letters.indexOf("cd")); //возвращает индекс первой бувы в данной стркое


        System.out.println("Length : " + letters.length()); // отображает длинну строки
        String[] letterArray  = letters.split(" "); // создаем массив из стрингов , раздел€ем каждый символ пробелом
        System.out.println(Arrays.toString(letterArray)); // преобразуем массив в строку , отображаем ее
        char[] charArray = letters.toCharArray();  // создаем массив дл€ чаров  , суем в него лист с первой строкой
        System.out.println(letters.substring(1, 4)); // показываем то что с первого по 4 €чейку
        String randString = "              qwerty         "; //создали строку
        System.out.println(randString.trim()); //выводим ее без проблелов


        StringBuilder randSB = new StringBuilder("A random value"); // короче модна€ строка какаето  , со своими фишками  , создаем , суем в нее значение
        System.out.println(randSB.append(" again")); // добавл€м в нашу строку данную строку
        System.out.println(randSB.delete(15, 21)); // удал€ем все что между номерами этих индексов
        randSB.ensureCapacity(60); // короче добавл€ет в строку еще 60 емкости ??
        System.out.println(randSB.capacity()); // показывает текущую ≈ћ ќ—“№
        System.out.println(randSB.length()); //показывает текущую ƒЋ»ЌЌ”
        randSB.trimToSize(); // короче пытаетс€ снизить емкость лол
        System.out.println("TRY TO TRIM -  " + randSB.capacity()); // отобразили екущую ≈ћ ќ—“№
        System.out.println(randSB.insert(1, "nother")); //  вставл€ем в строку значение в указаной последовальности
        String oldSB = randSB.toString(); //превратили крутую строку в обычную
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
