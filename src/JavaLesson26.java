import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class JavaLesson26 extends JFrame {  // создали класс
    JButton button1;        //создали кнопку
    JSpinner spinner1, spinner2, spinner3, spinner4;        // создали 4 спинера
    String outputString = " ";       // создали стрингу

    public static void main(String[] args) {            // запускающий метод
        new JavaLesson26();                 // в него конструктор класса

    }

    public JavaLesson26() {         //создаем конструктор
        this.setSize(400, 400);     // установили размер
        this.setLocationRelativeTo(null);   // по середине окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // закрыть на выходе
        this.setTitle("My Fifth Frame"); // тайтл
        JPanel thePanel = new JPanel(); // новая панель
        button1 = new JButton("Get Answer"); // иниц кнопку , дали название
        ListenForButton lForButton = new ListenForButton(); // создали и иниц кастомный екшн
        button1.addActionListener(lForButton);      //повесили на батон лисенер  , в него замунукли екшн
        thePanel.add(button1);      //добавили кнопку в панель
        spinner1 = new JSpinner(); // иниц нового спинера
        thePanel.add(spinner1); //  добавили спинер в панель
        spinner2 = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)); // иниц нового спинера
        thePanel.add(spinner2);     //добавляем второй спинер в панель
        String[] weekDays = {"Mon", "Tues", "Weds", "Thurs", "Fri"}; //создаем массив , пихаем туда стринги
        spinner3 = new JSpinner(new SpinnerListModel(weekDays)); // инициализируем третий спинер , в него пихаем массив
        Dimension d = spinner3.getPreferredSize(); //устанавливаем "предпочтительный" размер компонента , засовываем значение в Dimension
        d.width = 80; //устанавливаем ширину спинера
        spinner3.setPreferredSize(d); //применяем его к спинеру
        thePanel.add(spinner3); // добавляем спинер в панель
        Date todaysDate = new Date(); //создаем и инициализируем обьект Date
        spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH)); //  инициализируем третий спинер , устанавливаем параметры
        // засовываем в него тип спинра , в тип с пинера дату  и тип календаря
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yy"); // создаем и иницализируем едитор в него суем последний спинер и устанавливаем формат отображения даты
        spinner4.setEditor(dateEditor); // устанавливаем формат в последний спине
        thePanel.add(spinner4); //добавляем послений спинер в панель
        this.add(thePanel); // добавляем панель в окно
        this.setVisible(true); // устанавливаем видимое окно
    }


    private class ListenForButton implements ActionListener {  //инициализируем лисенер

        @Override
        public void actionPerformed(ActionEvent e) {   //
            if (e.getSource() == button1) {  //когда кликаем на кнопку
                outputString += "Spinner 1 Value " + spinner1.getValue() + "\n"; // в стрингу выводим значение первого спинера
                outputString += "Spinner 2 Value " + spinner2.getValue() + "\n"; // второго
                outputString += "Spinner 3 Value " + spinner3.getValue() + "\n"; //третьего
                outputString += "Spinner 4 Value " + spinner4.getValue() + "\n"; // четверого
                JOptionPane.showMessageDialog(JavaLesson26.this, outputString, "Informatiion", JOptionPane.INFORMATION_MESSAGE); //создаем поп ап с информацией , тайтлом
            }
            outputString = " "; //обнуляем стринг
        }

}
        }





