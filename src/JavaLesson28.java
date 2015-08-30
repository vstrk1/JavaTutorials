import javax.swing.*;
import java.awt.*;

public class JavaLesson28 extends JFrame {
    JButton button1, button2, button3, button4, button5;
    public static void main(String[] args){
        new JavaLesson28();
    }
    public JavaLesson28(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Seventh Frame");
        JPanel thePanel = new JPanel();
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
        button4 = new JButton("Button4");
        button5 = new JButton("Button5");

       /*
        thePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 20));
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        thePanel.add(button1);
        thePanel.add(button2);*/

        /**Border layout*/
       /* thePanel.setLayout(new BorderLayout());
        thePanel.add(button1, BorderLayout.NORTH);
        thePanel.add(button2, BorderLayout.EAST);
        thePanel.add(button3, BorderLayout.WEST);
        thePanel.add(button4, BorderLayout.SOUTH);
        thePanel.add(button5, BorderLayout.CENTER);
        JPanel thePanel2 = new JPanel();
        thePanel2.add(button1);
        thePanel2.add(button2);
        thePanel.add(thePanel2, BorderLayout.NORTH);*/

        /**Box layout*/
        Box theBox = Box.createHorizontalBox();
        theBox.add(button1);
        theBox.add(Box.createHorizontalStrut(4));
        theBox.add(button2);
        theBox.add(Box.createRigidArea(new Dimension(30, 20)));
        theBox.add(button3);
        this.add(theBox);




       // this.add(thePanel);
        this.setVisible(true);

    }


}
