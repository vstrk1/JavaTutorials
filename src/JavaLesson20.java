import javax.swing.*;
import java.awt.*;
public class JavaLesson20 extends JFrame{           //аботаем с фреймом малята
    public static void main(String[] args){
        new JavaLesson20();
    }

    public JavaLesson20(){
        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth()/2);
        int yPos = (dim.height / 2) - (this.getHeight()/2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My First Frame");
        JPanel thePanel = new JPanel();
        JLabel label1 = new JLabel("КИСАНЬКА МУРЛЫСАНЬКА");

        label1.setText("New Text");
        label1.setToolTipText("Dsnt do anything");
        thePanel.add(label1);
            JButton button1 = new JButton("Send");
            button1.setText("New Button");
            button1.setToolTipText("Its a button");
        JTextField textField1 = new JTextField("Type here", 15);
        textField1.setColumns(10);
        textField1.setText("Type again");
        textField1.setToolTipText("It's a field");
        thePanel.add(textField1);
        thePanel.add(button1);
        JTextArea textArea1 = new JTextArea(15, 20);
        textArea1.setText("Jast a whole binvh of text that is important");
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        int numOfLines = textArea1.getLineCount();
        textArea1.append(" number of lines : " + numOfLines);
        JScrollPane scrollbar1 = new JScrollPane(textArea1 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(scrollbar1);
        this.add(thePanel);

        this.setVisible(true);
        textField1.requestFocus();
    }


}
