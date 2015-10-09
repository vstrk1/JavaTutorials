import javax.swing.*;
import java.awt.*;

public class JavaLesson29 extends JFrame{                                               //создали класс
    JButton but1, but2,but3,but4,but5,but6,but7,but8,but9,but0,butPlus,butMinus, clearAll;       // кнопки
    JTextField textResult;          // поле

public static void main(String[] args){         //запускающий метод
    new JavaLesson29(); //запихнули конструктор класса
}
    public JavaLesson29(){          //создали конструктор класса
        this.setSize(400, 400);         // установили размер
        this.setLocationRelativeTo(null);       //установили дефолтную позицию
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход при закрытии окна
        this.setTitle("Calculator"); // поставили тайтл
        JPanel thePanel = new JPanel();         // создали и иниц панель

        thePanel.setLayout(new GridBagLayout());     // установили лейаут
        GridBagConstraints gridConstraints = new GridBagConstraints();  // инициализируем обьект для установки расстояний между єлементами
        gridConstraints.gridx = 1;                                   // установили отступ от єлемента по оси х
        gridConstraints.gridy = 1;      //по оси у
        gridConstraints.gridwidth = 1; //ширина
        gridConstraints.gridheight = 1; //высота
        gridConstraints.weightx = 50; // тоже параметрі
        gridConstraints.weighty= 100; // и тут
        gridConstraints.insets = new Insets(5,5,5,5); // инсет
        gridConstraints.anchor = GridBagConstraints.CENTER; // по центру
        gridConstraints.fill  =GridBagConstraints.BOTH; // заполнение для обоих

        textResult = new JTextField("0", 20); // инициалихзация нового филда
        Font font = new Font ("Helvetica", Font.PLAIN, 18); // устанавливаем шрифт
        textResult.setFont(font); // применяем его для поля

        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");        //инициализировали кнопки
        but5 = new JButton("5");
        but6 = new JButton("6");
        but7 = new JButton("7");
        but8 = new JButton("8");
        but9 = new JButton("9");
        but0 = new JButton("0");
        butPlus = new JButton("+");
        butMinus = new JButton("-");
        clearAll = new JButton("C");

        thePanel.add(clearAll,gridConstraints);     // в панель запихиваем каждую кнопку и устанавливаем ей значения , которые прописали в gridConstraints,
        gridConstraints.gridwidth = 20;         // устанавливаем новіе значения
        gridConstraints.gridx = 5;              //проставляем остальніе значения для кнопок
        thePanel.add(textResult,gridConstraints);
        gridConstraints.gridwidth = 1;
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        thePanel.add(but1,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but2,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(but3,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        thePanel.add(but4,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but5,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(but6,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 4;
        thePanel.add(but7,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but8,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(but9,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 5;
        thePanel.add(butPlus,gridConstraints);
        gridConstraints.gridx = 5;
        thePanel.add(but0,gridConstraints);
        gridConstraints.gridx = 9;
        thePanel.add(butMinus,gridConstraints);

        this.add(thePanel);         // добавляем панель в окно
        this.setVisible(true); // отображаем ее на мониторе

    }

}
