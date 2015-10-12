import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class JavaLesson31 extends JFrame{               // создали класс
    static String filepath, parentDirextory;            // двен статические стринги
    static File randomDir, randomFile, randomFile2;             //  два обьекта типа файл

    public static void main (String[] args){               // запускающий метод
        randomDir = new File("D:/ATools/IdeaProjects/JavaTutorials");           //инициализация нового пути
        randomDir.mkdir();              // создаем катаклог
        randomFile = new File("random.txt"); //
        randomFile2 = new File("D:/ATools/IdeaProjects/JavaTutorials/random2.txt"); // инициализируем второй путь с файлом
        try{                    //трай
            randomFile.createNewFile();             // создаем файл
            randomFile2.createNewFile();            // создаем второй файл
            filepath = randomFile.getCanonicalPath();           //в стрингу пихаем каноническую форму путми  первого файла

        }catch (IOException e){ // ловим ошибку
            e.printStackTrace(); // отображаем стектрейс
        }
        if(randomFile.exists()){            // если рандомный файл с обстрактным путем существует то
            System.out.println("File Exist ");          // меседж
            System.out.println("File Readable " + randomFile.canRead());        // меседж + результат , можем ли мы его прочитать
            System.out.println("File Writable " + randomFile.canWrite()); // прописать
            System.out.println("File Location " + filepath);  //локацию
            System.out.println("File Name " + randomFile.getName());            // имя рандомного файла
            System.out.println("Parent Directory " + randomFile.getParent());  // родители
            parentDirextory = randomFile2.getParent(); // в вторую стрингу закидываем путь родителя
            System.out.println("File 2 Parent " + parentDirextory);             // отображаем пас родителя
            System.out.println("Is it a Directory" + randomDir.isDirectory()); // результат проверки на директори ли это
            String[] filesInDir = randomDir.list(); // массив с файлами в репозитории
            System.out.println("File in Directory\n"); //
            for(String fileName : filesInDir){          // крутим цикл столько сколько у нас фалов в репозитории
                System.out.println(fileName + "\n"); // перечисляем все файлы
            }
            System.out.println("Is a File " + randomFile.isFile());             // проверка на файл ли это
            System.out.println("Is hidden " + randomFile.isHidden());       //проверка на скрытость файла
            System.out.println("Last Modified " + randomFile.lastModified());       //  дата последней модификации
            System.out.println("File Size " + randomFile.length()); // длинна файла
            randomFile2.renameTo(new File("D:/ATools/IdeaProjects/JavaTutorials/random3.txt"));   // переименофание второго файла , создание нового обьекта файл
            new JavaLesson31();    //  создаем обьект класса ????

        }else {                 // ИНАЧЕ
            System.out.println("File dsnt exist");   //файл не найден
        }
            if(randomFile.delete()){                // если (удаляем файл )
                System.out.println("File Deleted");  // мсдж
            }

        File[] filesInDir = randomDir.listFiles();          //создаем массив , в него кидаем список файлов директория
        for(File fileName : filesInDir){
            fileName.delete();          // удаляем все файлы
        }

    }
    public JavaLesson31(){              // создаем констуктор
    JFileChooser FileChooser = new JFileChooser(randomDir);             // создаем и инициализируем  простой механизм для выбора файла  , в него кидаем директорию
        FileChooser.showOpenDialog(this); // создаем поп ап с выбором файла , в него кидаем компонент (КАКОЙ ??!)
    }
}
