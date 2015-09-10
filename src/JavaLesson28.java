import javax.swing.*;
import java.awt.*;

public class JavaLesson28 extends JFrame {                              // создали клас
    JButton button1, button2, button3, button4, button5;                // 5 кнопок
    public static void main(String[] args){
        new JavaLesson28();
    }           // запускающий клас в нем конструктор
    public JavaLesson28(){          // сонстуктор
        this.setSize(400, 400);     // размер
        this.setLocationRelativeTo(null); // по середине размер
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие программы при закрытии окна
        this.setTitle("My Seventh Frame"); // тайтл
        JPanel thePanel = new JPanel(); // панель
        button1 = new JButton("Button1");   //1
        button2 = new JButton("Button2");//2
        button3 = new JButton("Button3");//3
        button4 = new JButton("Button4");//4
        button5 = new JButton("Button5");//5

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
        Box theBox = Box.createHorizontalBox();  // создаем обьем типа бокс (легковесній контейнер , для него есть такой только лейаут - он менеджер )
        // в него пихаем метод  , которій создает окно с указанием єлементов слево на право
        theBox.add(button1); // в бокс суем кнопку
        theBox.add(Box.createHorizontalStrut(4)); // создаем фиксованій ширины , невидимый компонент (суем в него 4)
        theBox.add(button2); // добавили другую кнопку
        theBox.add(Box.createRigidArea(new Dimension(30, 20))); // создаем невидимый компанент указанного размера
        theBox.add(button3); //третья кнопка
        this.add(theBox); // добавляем бокс в окно





       // this.add(thePanel);
        this.setVisible(true); // отображаем окно
    }


}
