import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaLesson21 extends JFrame {          //создали класс , наследуемся от JFrame
    JButton button1;                            //создали кнопку
    JTextArea textArea1;                        //создали текст для ввода
    JTextField textField1;                      //создали поле
    int buttonClicked;                          //создали инту
    public static void main (String[] args){    //создали метод который запускаект конструктор класса
        new JavaLesson21();
    }
    public JavaLesson21(){                      //создали конструктор
        this.setSize(400, 400);                 //установили размер
        Toolkit tk = Toolkit.getDefaultToolkit();  //Короче создали обьект класа тулкит (библиотика для работы с окнами), устанавливаем набор инстументов по умалчанию
        Dimension dim = tk.getScreenSize();     // Дименсион инкапсулирует  ширину и высоту компонента в определенный обьект. В данном случаем мы в обьект Dimension засунули
        // метод , который возвращает нам размер экрана

        int xPos = (dim.width / 2) - (this.getWidth() / 2 );    // создали инту , которая состоит из раности (ширины тул кита /2 - ширина Windows /2  )
        int yPos = (dim.height / 2)-(this.getHeight() / 2 );    // то же самое с Y интой  , только повязано все на высоте

        this.setLocation(xPos, yPos);   // установали местоположение окна согласно двум вышеустановленым интам
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрываем программу при закрытии окна
        this.setTitle("My second frame"); // установили тайтл
        JPanel thePanel = new JPanel(); // создали новую Jпанель
        ListenForButton lForButton = new ListenForButton();    // создлали обьект типа лисенер (описан внизу) , иниализировали его
        button1 = new JButton();        // инициализировали кнопку
        button1.setText("Click Here"); //создали надпись на кнопке
        button1.addActionListener(lForButton); // вызываем метод слушатель кнопки (выполняет екшен при нажатии) , подаем на него обьект lForButton , что находится выше
        thePanel.add(button1);      // добавляем кнопку в thePanel
        textField1 = new JTextField("", 15); // инициализируем новое поле , устанавливаем его содержание и длинну
        textField1.setText("Type here"); // установили текст в поле
        ListenForKeys lForKeys = new ListenForKeys(); // создали + инициализировали обьект (произвордит действие при нажатии клавиши)
        textField1.addKeyListener(lForKeys); // добавили слушатель для поля ,засунули в ниго наш обьект , который выше на одну строчку
        thePanel.add(textField1); // добавили это поле в thePanel
        textArea1 = new JTextArea(15,20);  // создали поле для воода текста , установили размер
        textArea1.setText("Tracking Events\n"); // установили текст в широкое поле
        textArea1.setLineWrap(true);  // тру - текст переносится на новую строку . фолс - текст тянется дальше , можно листать его вправо
        textArea1.setWrapStyleWord(true);   // тру - перенос по словам , фолс - по слогам/ вообще нет переноса ?
        JScrollPane scrollbar1 = new JScrollPane(textArea1 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//создали скрол
        thePanel.add(scrollbar1); // "инициализировали скрол"
        this.add(thePanel); // добавили панель в окно !!
        ListenForWindow  lForWindow = new ListenForWindow();  // создали экшн при взаимодействии с окном
        this.addWindowListener(lForWindow); // создали для окна лисенер , засунули в него обьект екшн , который выше
        this.setVisible(true); // отображаем наше окно на мониторе

        ListenForMouse lForMouse = new ListenForMouse(); // инициализировали новый обьект кторый чтото делает с мышкой
        thePanel.addMouseListener(lForMouse); // добавили в панель лисенер , который принимает на себя екшн выше

    }

    private class ListenForButton implements ActionListener{        // создали класс (действие при нажатии на кнопку) , реализует интерфейс
            public void actionPerformed(ActionEvent e){         //реализация метода интерфейса . принимает на себе ивент (клик ? )
                if (e.getSource() == button1){                  //ЕСЛИ (при ивенте равен кнопке ? )
                    buttonClicked++;                    //увеличеваем инту на 1
                    textArea1.append("Button clicked " + buttonClicked + " times\n");   // в большом текстовом поле пишем  сообщение + инта с кол-вом раз клика по кнопке
                }
            }

    }

    private class ListenForKeys implements KeyListener{     // создали прайват клас , реализует интерфейс слушателя кнопки
        @Override // аннотация мметода
        public void keyTyped(KeyEvent e) {      //метод от интерфейса , принимает на себя событие нажатия любой кнопки
            textArea1.append("Key hit : " + e.getKeyChar() + "\n");  //выводи сообщение в поле + название нажатой кнопки

        }

        @Override   // оверайд метод
        public void keyPressed(KeyEvent e) {

        }

        @Override //
        public void keyReleased(KeyEvent e) {
        } // закрыли клас
    }

    private class ListenForWindow implements WindowListener{ // создали клас прайват для отображения екшена во время отображения окна // реализуем интерфейс

        @Override// аннштация
        public void windowOpened(WindowEvent e) { // метод от интерфейса , принимает на себя  ивент виндовса
            textArea1.append("Window is Created"+ "\n"); // выдаем месседж о созданом окне

        }

        @Override       // метод
        public void windowClosing(WindowEvent e) {

        }

        @Override       //метод
        public void windowClosed(WindowEvent e) {


        }

        @Override    //
        public void windowIconified(WindowEvent e) {
            textArea1.append("Window is minimized"+ "\n"); // выдаем меседж при уменьшении окна (у нас не работает потому что я запретил менять размер окна)
        }

        @Override
        public void windowDeiconified(WindowEvent e) { //метод "Де-минимизировано"
            textArea1.append("Window in Normal State" + "\n"); // тоже не работает т.к. выключен ресайз

        }

        @Override
        public void windowActivated(WindowEvent e) {  // при активации окна показываем меседж
            textArea1.append("Window is active " + "\n");

        }

        @Override
        public void windowDeactivated(WindowEvent e) { // при деактицации окна тоже месседж
            textArea1.append("Window is not active"+ "\n");
        }
    }           //покончили с методом

    private class ListenForMouse implements MouseListener{      // создаем клас действия с мышкой , наследуемся от интерфейса

        @Override               // реализуем метод интерфенйса
        public void mouseClicked(MouseEvent e) { // метод , котрый принимает на себя клик мыши
            textArea1.append("Mouse Panel pos : " + e.getX() + e.getY() + "\n");  // выводим в поле сообщение + координаты мыши
            textArea1.append("Mouse Screen pos : " + e.getXOnScreen() + e.getYOnScreen() + "\n"); // координаты относительно экрана
            textArea1.append("Mouse Button pos : " + e.getButton() + "\n"); //позиция кноки ?
            textArea1.append("Mouse Clicks pos : " + e.getClickCount() + "\n"); // количество кликов

        }

        @Override
        public void mousePressed(MouseEvent e) { // ПРОЧИЕ МЕТОДЫ КОТОРЫЕ НЕ РЕАЛИЗОВАНЫ В ДАННОМ КЛАССЕ

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


}
