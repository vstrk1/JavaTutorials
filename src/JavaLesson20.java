import javax.swing.*;
import java.awt.*;
public class JavaLesson20 extends JFrame{           //Созади клас который расширяет jframe
    public static void main(String[] args){         //запускающий метод
        new JavaLesson20(); // запускаем конструктор
    }

    public JavaLesson20(){          // создали конструктор
        this.setSize(400, 400);     // устанавили размер окна (Класс Windows)
        Toolkit tk = Toolkit.getDefaultToolkit();  //Короче создали обьект класа тулкит (библиотика для работы с окнами), устанавливаем набор инстументов по умалчанию
        Dimension dim = tk.getScreenSize();     // Дименсион инкапсулирует  ширину и высоту компонента в определенный обьект. В данном случаем мы в обьект Dimension засунули
        // метод , который возвращает нам размер экрана
        int xPos = (dim.width / 2) - (this.getWidth()/2);   // создали инту , которая состоит из раности (ширины тул кита /2 - ширина Windows /2  )
        int yPos = (dim.height / 2) - (this.getHeight()/2);  // то же самое с Y интой  , только повязано все на высоте

        this.setLocation(xPos, yPos);       //Устанавливаем наше окно согласно нашему экрану используя координаты выше
        this.setResizable(false);           //вызываем метод виндовса , который нек позволяет нам изменить размер окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // метод , короче  закрываем класс при нажатии кнопки выход из окна
        this.setTitle("My First Frame"); // Установили тайтл окна
        JPanel thePanel = new JPanel(); // создали обьект типа Jpanel
        JLabel label1 = new JLabel("КИСАНЬКА МУРЛЫСАНЬКА");         //создали еще одну панель/ надпись /хз как , засунули в нее надпись

        label1.setText("New Text"); // поставили новую запись
        label1.setToolTipText("Dsnt do anything");//КОРОЧЕ СОЗДАЕМ ВЫСПЛЫВАЮЩУЮ ПОСКАЗКУ
        thePanel.add(label1);  //Добавили к первой панели вторуб панель
        JButton button1 = new JButton("Send"); //Создали кноку+ имя кнопки                                              //ВСЕ ЭЛЕМЕНТЫ ДОБАВЛЯЕМ В ПАНЕЛЬ  thePanel
        button1.setText("New Button"); // заменили текст новым
        button1.setToolTipText("Its a button"); // всплывающая подсказка
        JTextField textField1 = new JTextField("Type here", 15); // создали поле + имя поля +кол во колонок (*На деле это длинна поля)
        textField1.setColumns(10); // переназначили длинну поля
        textField1.setText("Type again"); // Поставили в него текст
        textField1.setToolTipText("It's a field");  //Всплывающая подсказка
        thePanel.add(textField1); //  добавили в панель поле
        thePanel.add(button1); // кнопку
        JTextArea textArea1 = new JTextArea(15, 20);                    // создали поле для ввода большого текста (установили размер)
        textArea1.setText("Jast a whole binvh of text that is important.\\n");   // Установили текст в поле для воода текта
        textArea1.setLineWrap(true); // тру - текст переносится на новую строку . фолс - текст тянется дальше , можно листать его вправо
        textArea1.setWrapStyleWord(true); // тру - перенос по словам , фолс - по слогам/ вообще нет переноса ?
        int numOfLines = textArea1.getLineCount(); // узнаем количество лайнов текст ареа
        textArea1.append(" number of lines : " + numOfLines); // выводим это в текстовом поле
        JScrollPane scrollbar1 = new JScrollPane(textArea1 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //короче создаем возможность скрола
        thePanel.add(scrollbar1); // добавили скролбар в панель
        this.add(thePanel); //                                                  //ДОБАВИЛИ ПАНЕЛЬ В НАШЕ ОКНО !!!!
        this.setVisible(true); //делаем так чтоб окно было видимо
        textField1.requestFocus(); // при откртытии окна устанавливаем мигание на поле
    }


}
