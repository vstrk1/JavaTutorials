import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class JavaLesson31 extends JFrame{
    static String filepath, parentDirextory;
    static File randomDir, randomFile, randomFile2;

    public static void main (String[] args){
        randomDir = new File("D:/ATools/IdeaProjects/JavaTutorials");
        randomDir.mkdir();
        randomFile = new File("random.txt");
        randomFile2 = new File("D:/ATools/IdeaProjects/JavaTutorials/random2.txt");
        try{
            randomFile.createNewFile();
            randomFile2.createNewFile();
            filepath = randomFile.getCanonicalPath();

        }catch (IOException e){
            e.printStackTrace();
        }
        if(randomFile.exists()){
            System.out.println("File Exist ");
            System.out.println("File Readable " + randomFile.canRead());
            System.out.println("File Writable " + randomFile.canWrite());
            System.out.println("File Location " + filepath);
            System.out.println("File Name " + randomFile.getName());
            System.out.println("Parent Directory " + randomFile.getParent());
            parentDirextory = randomFile2.getParent();
            System.out.println("File 2 Parent " + parentDirextory);
            System.out.println("Is it a Directory" + randomDir.isDirectory());
            String[] filesInDir = randomDir.list();
            System.out.println("File in Directory\n");
            for(String fileName : filesInDir){
                System.out.println(fileName + "\n");
            }
            System.out.println("Is a File " + randomFile.isFile());
            System.out.println("Is hidden " + randomFile.isHidden());
            System.out.println("Last Modified " + randomFile.lastModified());
            System.out.println("File Size " + randomFile.length());
            randomFile2.renameTo(new File("D:/ATools/IdeaProjects/JavaTutorials/random3.txt"));
            new JavaLesson31();

        }else {
            System.out.println("File dsnt exist");
        }
            if(randomFile.delete()){
                System.out.println("File Deleted");
            }

        File[] filesInDir = randomDir.listFiles();
        for(File fileName : filesInDir){
            fileName.delete();
        }

    }
    public JavaLesson31(){
    JFileChooser FileChooser = new JFileChooser(randomDir);
        FileChooser.showOpenDialog(this);
    }
}
