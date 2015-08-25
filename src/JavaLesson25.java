import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaLesson25 extends JFrame{
    JButton button1;
    String infoOnComponent = "";
    JList favoriteMoves , favoriteColors;
    DefaultListModel deflistModel = new DefaultListModel();
    JScrollPane scroller;



    public static void main (String[]  args) {
        new JavaLesson25();
    }
    public JavaLesson25(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Fifth Frame");
        JPanel thePanel = new JPanel();
        button1 = new JButton("GetAnswer");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);
        String[] movies = {"Matrix", "Minority Report", "Big"};
        favoriteMoves = new JList(movies);
        favoriteMoves.setFixedCellHeight(30);
        favoriteMoves.setFixedCellHeight(150);
        favoriteMoves.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray"};
        for(String color:colors){
            deflistModel.addElement(color);
        }
        deflistModel.add(2, "Purple");
        favoriteColors = new JList(deflistModel);
        favoriteColors.setVisibleRowCount(4);
        scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        favoriteColors.setFixedCellHeight(30);
        favoriteColors.setFixedCellWidth(150);
        thePanel.add(favoriteMoves);
        thePanel.add(scroller);
        this.add(thePanel);
        this.setVisible(true);}

    private class ListenForButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button1){
                if(deflistModel.contains("Black")) infoOnComponent += "Black is Here\n";
                if(!deflistModel.isEmpty()) infoOnComponent += "Isn`t empty\n";
                infoOnComponent+= "Elements in the List" + deflistModel.size() + "\n";
                infoOnComponent+= "Last Element " + deflistModel.lastElement() + "\n";
                infoOnComponent+= "First Element " + deflistModel.firstElement() + "\n";
                infoOnComponent+= "Element in the list " + deflistModel.get(1) + "\n";
                deflistModel.remove(0);
                deflistModel.removeElement("Big");
                Object[] arrayOfList = deflistModel.toArray();
                for(Object color: arrayOfList){
                    infoOnComponent += color + "\n";
                }
                JOptionPane.showMessageDialog(JavaLesson25.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
                infoOnComponent = "";
            }
        }
    }








        /*
064	         * getSelectedIndex(): returns the index for the first selected item
065	         * getSelectedIndexes(): returns every selection in a list
066	         * getSelectedValue(): returns the value of the first selected
067	         * getSelectedValues(): returns an array of all values
068	         * isSelectedIndex(): returns true if index is selected
069	         */


}

