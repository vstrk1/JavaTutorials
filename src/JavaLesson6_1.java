import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by v.stuparenko on 14.07.2015.
 */
public class JavaLesson6_1 {
    public static void main(String[] args){
        getAFile("./someshit.txt");

    }

    public static void getAFile(String fileName){
        try {
            FileInputStream file = new FileInputStream(fileName);
        }catch (FileNotFoundException e){
            System.out.println("Sorry , i cant find dat file");
        }

        catch (IOException e){
    System.out.println("Unknown IO Error");
}
        catch (Exception e){
            System.out.println("Some error occured");
        }
        finally {
            System.out.println("");
        }
    }
}
