import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLesson19 {
    public static void main(String[] args){
        String longString = " Vladislav Stuparenko CA 23234 RR 8(063)111 99 71";  // создаем длинную строку
        String strangeString = " 1Z aaaaa *** **** {{{ {{ { ";                // вторую строку


       regexChecker("\\s[A-Za-z]{3,20}\\s", strangeString);
       regexReplace(longString);
    }
    public static void regexChecker(String theRegex, String str2Check){     //создали метод , принимает на себя две стринги
        Pattern checkRegex = Pattern.compile(theRegex);  // создали обьект типа паттерн , вызвали метод который компилирует наше регулярное выражение с флагами

        Matcher regexmatcher = checkRegex.matcher(str2Check);   // создали обьект матчер(Анализирует строку) , подаем на него метод матчер (принимает на себя искомую строку)

        while (regexmatcher.find()){            // ПОКА  (короче находим последовательность в нашей искомой строке , исходя из RegEx)
            if(regexmatcher.group().length() !=0){  // получаем длинну значений из подгруппы , если она не равна нулу делаем
                System.out.println(regexmatcher.group().trim());  // получаем значений из подгруппы , без учета пробелов
            }
            System.out.println("Start index: " + regexmatcher.start());     // выводим начальный индекс подстроки находящийся в групе ? што што што
            System.out.println(" End Index: " + regexmatcher.end()); //тоже самое только конечный индекс

        }
    }
    public static void regexReplace(String str2Place){    // создали метод (принимает стрингу)
        Pattern replace = Pattern.compile("\\s+");      // создали обьект типа патерн , компилит строку (флагов нет так как сдесь экранирование )
        Matcher regexMatcher = replace.matcher(str2Place.trim()); //сравниваем без учета пробела

        System.out.println(regexMatcher.replaceAll(", "));      //заменяет каждую последовательность входной последовательностью
    }

}

