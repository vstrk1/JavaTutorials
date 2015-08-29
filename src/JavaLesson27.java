import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class JavaLesson27 extends JFrame {
    JButton button1;
    String outputString = "";
    JTree theTree;              // создаем обьект типа дерево
    DefaultMutableTreeNode document, work, games, emails;       // СОЗДАЕМ ЧЕТЫРЕ ОСНОВНЫХ УЗЛА В ДЕРЕВЕ
    DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive"); // создаем и иницализируем еще один основной узел , даем ему имя
    public static void main (String[] args){
     new JavaLesson27();
    } //
    public JavaLesson27(){ // создали конструктор
        this.setSize(400, 400); //
        this.setLocationRelativeTo(null); //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        this.setTitle("My Sixth Frame"); //
        JPanel thePanel = new JPanel(); //
        button1 = new JButton("Get Answer"); //

        ListenForButton lForButton = new ListenForButton();//
        button1.addActionListener(lForButton); //
        thePanel.add(button1); //
        theTree = new JTree(fileSystem);
        theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION); // устанавливаем параметры дерева
        theTree.setVisibleRowCount(8); // количество отображаемых строк в дереве

        document = addFile("Docs", fileSystem); // добавляем в основной узел узел поменьше
        addFile("Taxes.exl", document); // в него добавляем типо "файлы :) "
        addFile("Story.tst", document); // еще один

        emails = addFile("Emails", document); // в папку документов добавдяем еще одну папку с емейлами :)
        addFile("Shedul.txt", document); // типо файлы
        addFile("CallBob.txt", emails); // еще один

        work = addFile("Work Applications", fileSystem); // основное дерево суем  папку ворк
        addFile("Spreadsheet.exe", work); // в папку  суем два файла
        addFile("Worldprocessor.exe", work);

        games = addFile("Games", fileSystem);  // добавляем в основной нод папку с лудоманией
        addFile("Spaceinvaders.exe", games); // добавили файлы
        addFile("PacMan.exe", games);

        JScrollPane scrollBox = new JScrollPane(theTree); // создали и иницализировали скрол
        Dimension d = scrollBox.getPreferredSize(); // создали переменую
        d.width = 200; // установили ширину
        scrollBox.setPreferredSize(d); // установили  ширину скрола
        thePanel.add(scrollBox);  // добавили скрол в панель



        this.add(thePanel); // добавили панель в окно
        this.setVisible(true); // установили отображение окна
    }
    private class ListenForButton implements ActionListener{            // лисенер для кнопки
        @Override
        public void actionPerformed(ActionEvent e) {                 //
            if(e.getSource() == button1){                           // если кликаем на кнопку
                Object treeObject = theTree.getLastSelectedPathComponent();     //создали обькет , засунули в него последний выбранный компонент
                DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;       // создали и иницализировали обьект
                String treeNode = (String) theFile.getUserObject();         //
                outputString += "The Selected Node : " + treeNode+ "\n"; // дали в строку
                outputString += "Nmbr of Children: " + theFile.getChildCount()+ "\n";   //кол-во детей
                outputString += "Nmbr of Siblings: " + theFile.getSiblingCount()+ "\n";// родой элемент
                outputString += "Parent  : " + theFile.getParent() + "\n";            // указываем родителей
                outputString += "Next node  : " + theFile.getNextNode() + "\n";      //выводи
                outputString += "Previous Node : " + theFile.getPreviousNode() + "\n";  // указываем
                outputString += "\nChildren of Node\n" ;                               // добавляем строку
                for (Enumeration enumValue = theFile.children(); enumValue.hasMoreElements();){     //крутим цикл столько сколько у нас детей
                    outputString += enumValue.nextElement() + "\n"; // добавляем следующий элемент
                }
                outputString += "\nPath From Root\n";         // еще строка
                TreeNode[] pathNodes = theFile.getPath();    // получаем путь , пишем его в массив
                for (TreeNode indivNodes : pathNodes){      // крутим цикл столько сколько у нас путей в массиве
                    outputString += indivNodes + "\n";     //
                }
                JOptionPane.showMessageDialog(JavaLesson27.this, outputString, "Catalog", JOptionPane.INFORMATION_MESSAGE);//создали поп ап , подали стрингу , дали тайтл , опредили тип пап-ап
                outputString = "";
            }
        }
    }

    private DefaultMutableTreeNode addFile(String fileName, DefaultMutableTreeNode parenFolder){ // создаем метод , принимает на себя имя файла , и обьек
        DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);  //  инициализируем новый файл
        parenFolder.add(newFile); // добавляем в папку новый файл

        return newFile; // возвращаем новый файл 
    }


}
