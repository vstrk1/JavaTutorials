import java.text.DateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владислав on 15.08.2015.
 */
public class JavaLesson19 {
    public static void main(String[] args){
        String longString = " Vladislav Stuparenko CA 23234 RR 8(063)111 99 71";
        String strangeString = " 1Z aaa *** **** {{{ {{ { ";


       //regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3}( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7}}", strangeString);
regexReplace(longString);
    }
    public static void regexChecker(String theRegex, String str2Check){
        Pattern checkRegex = Pattern.compile(theRegex);

        Matcher regexmatcher = checkRegex.matcher(str2Check);

        while (regexmatcher.find()){
            if(regexmatcher.group().length() !=0){
                System.out.println(regexmatcher.group().trim());
            }
            System.out.println("Start index: " + regexmatcher.start());
            System.out.println(" End Index: " + regexmatcher.end());

        }
    }

    public static void regexReplace(String str2Place){
        Pattern replace = Pattern.compile("\\s+");
        Matcher regexMatcher = replace.matcher(str2Place.trim());

        System.out.println(regexMatcher.replaceAll(", "));
    }

}

