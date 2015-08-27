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
    JTree theTree;
    DefaultMutableTreeNode document, work, games, emails;
    DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");
    public static void main (String[] args){
     new JavaLesson27();
    }
    public JavaLesson27(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Sixth Frame");
        JPanel thePanel = new JPanel();
        button1 = new JButton("Get Answer");

        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);
        theTree = new JTree(fileSystem);
        theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        theTree.setVisibleRowCount(8);

        document = addFile("Docs", fileSystem);
        addFile("Taxes.exl", document);
        addFile("Story.tst", document);

        emails = addFile("Emails", document);
        addFile("Shedul.txt", document);
        addFile("CallBob.txt", emails);

        work = addFile("Work Applications", fileSystem);
        addFile("Spreadsheet.exe", work);
        addFile("Worldprocessor.exe", work);

        games = addFile("Games", fileSystem);
        addFile("Spaceinvaders.exe", games);
        addFile("PacMan.exe", games);

        JScrollPane scrollBox = new JScrollPane(theTree);
        Dimension d = scrollBox.getPreferredSize();
        d.width = 200;
        scrollBox.setPreferredSize(d);
        thePanel.add(scrollBox);



        this.add(thePanel);
        this.setVisible(true);
    }
    private class ListenForButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button1){
                Object treeObject = theTree.getLastSelectedPathComponent();
                DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;
                String treeNode = (String) theFile.getUserObject();
                outputString += "The Selected Node : " + treeNode+ "\n";
                outputString += "Nmbr of Children: " + theFile.getChildCount()+ "\n";
                outputString += "Nmbr of Siblings: " + theFile.getSiblingCount()+ "\n";
                outputString += "Parent  : " + theFile.getParent() + "\n";
                outputString += "Next node  : " + theFile.getNextNode() + "\n";
                outputString += "Previous Node : " + theFile.getPreviousNode() + "\n";
                outputString += "\nChildren of Node\n" ;
                for (Enumeration enumValue = theFile.children(); enumValue.hasMoreElements();){
                    outputString += enumValue.nextElement() + "\n";
                }
                outputString += "\nPath From Root\n";
                TreeNode[] pathNodes = theFile.getPath();
                for (TreeNode indivNodes : pathNodes){
                    outputString += indivNodes + "\n";
                }


                JOptionPane.showMessageDialog(JavaLesson27.this, outputString, "Catalog", JOptionPane.INFORMATION_MESSAGE);
                outputString = "";
            }
        }
    }

    private DefaultMutableTreeNode addFile(String fileName, DefaultMutableTreeNode parenFolder){
        DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
        parenFolder.add(newFile);

        return newFile;
    }


}
