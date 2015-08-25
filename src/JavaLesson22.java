import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class JavaLesson22 extends JFrame{               // создали клас , унаследовались от Jrame а
    JButton button1;  // сохдали кнопку
    JLabel label1, label2, label3; // три надписи создали
    JTextField textField1, textField2; // два поля
    JCheckBox dollarSign, commaSeparator; // два чекбокса
    JRadioButton addNums, subtractNums, multNums, divideNums; // 4 радиокнопки
    JSlider howManyTimes; // один слайдер

    double number1, number2, totalCalc;  //три переменные типа дабл
    public  static void main(String[] args) { //создали запускающий метод , засунули в него конструктор класа
        new JavaLesson22();
    }

    public  JavaLesson22(){         // создали конструктор
        this.setSize(400, 400); // установили размер
        this.setLocationRelativeTo(null); // позиционируем окно на центр экрана
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // закрываем програму при выходе
        this.setTitle("My Third Frame !!"); // установили тайтл
        JPanel thePanel = new JPanel(); // создали + иницализировали новую панель

        button1 = new JButton("Calculate"); // иниализировали кнопку , дали ей имя

        ListenForButton lForButton = new ListenForButton(); // создали экшн при клике на кнопку
        button1.addActionListener(lForButton); // вызвали метод-слушалку , засунули в него екшн , который мы инициализировали выше

        thePanel.add(button1); // добавили кнопку в панель
        label1 = new JLabel("Number 1"); // инициализировали лейбу , дали название
        thePanel.add(label1); // добавили ее в панелоь
        textField1 = new JTextField("", 5); // иниализировали поле , установили содержание + длинну поля
        thePanel.add(textField1); // добавили поле в панель

        label2 = new JLabel("Number 2"); // инициализировали вторую лейбу , дали ей имя
        thePanel.add(label2); // добавили ее в панель
        textField2 = new JTextField("", 5); // инициализировали филд , установили содержание и размер
        thePanel.add(textField2); // добавили поле в панель

        dollarSign = new JCheckBox("Dollars"); // инициализировали чекбокс , дали ему имя
        commaSeparator = new JCheckBox("Commas"); // и второму тоже

        thePanel.add(dollarSign);           // добавляем в панель этот чекбокс
        thePanel.add(commaSeparator,true);  // и этот

        addNums = new JRadioButton("Add"); // инициализируем радиокнопку
        subtractNums = new JRadioButton("Subtract"); // и эту
        multNums = new JRadioButton("Multiply"); // и эту
        divideNums = new JRadioButton("Divide"); // и эту

        ButtonGroup operation = new ButtonGroup(); // создали обьект типа баттонгруп (типо обьеденяем все кнопки в одну групу)

        operation.add(addNums);         // добавляем в групу кнопку
        operation.add(subtractNums);   //+
        operation.add(multNums);      //+
        operation.add(divideNums);   //+

        JPanel operPanel = new JPanel(); //инициализируем новую  панель

        Border operBorder = BorderFactory.createTitledBorder("Operation"); // создали обьект бордер , инициализируем его , лепим на бордер тайтл , пишем тайтл
        operPanel.setBorder(operBorder); // утсанавливаем бордер в нашу новую панель
        operPanel.add(addNums); // добавляем в новую панель радиоо кнопку
        operPanel.add(subtractNums); //+
        operPanel.add(multNums);    //+
        operPanel.add(divideNums); //+

        addNums.setSelected(true); //устанавливаем данную кнопку в качестве изначального выбора

        thePanel.add(operPanel); // добавляем новую панель в нашу основую панель

        label3 = new JLabel("Perform How Many times"); //иницализировали новую лейбу

        thePanel.add(label3); // добавили ее в панель
        howManyTimes = new JSlider(0, 100, 1); // инициализировали слайдер , указали мин макс и значение одного деления
        howManyTimes.setMinorTickSpacing(1);  // короче ставим количество маленьких полосочек между основными цифрами
        howManyTimes.setMajorTickSpacing(10); // ставим количество больших черточек
        howManyTimes.setPaintTicks(true);   //устанавливаем отображание тех самых полосочек
        howManyTimes.setPaintLabels(true); //устанавливаем отображение десетков цифр
        ListenForSlider lForSlider = new ListenForSlider(); // создали и инициализировали  экшн для слайдера
        howManyTimes.addChangeListener(lForSlider); // прикрутили екшн к слайдеру (прикрутили модель к контролеру)
        this.add(howManyTimes); // добавили слайдер к окну
        this.add(thePanel); // добавили основную панель
        this.setVisible(true); // включили отображение
        this.setResizable(false); // нельзя менять масщтаб
        textField1.requestFocus(); // при открытии окна первое поле активно
        thePanel.add(howManyTimes); // добавили в панель слайдер
    }

    private class ListenForButton implements ActionListener{  // создали прайват клас , екшн для кнопки
        public void actionPerformed(ActionEvent e) { // реализуем метод интерфейса
            if (e.getSource() == button1) { // если соурс равен кнопке
                try {   //пробуем
                    number1 = Double.parseDouble(textField1.getText());     //в первую дабл переменную засовываем значение , которое мы дали на пернвое поле, но перед этим оно преобразуется в тип дабл (с точкой короче)
                    number2 = Double.parseDouble(textField2.getText()); // то же для второго числа
                } catch (NumberFormatException excep) {     // ловим ексепшн
                    JOptionPane.showMessageDialog(JavaLesson22.this, "Please Ennter the right info ", "Error", JOptionPane.ERROR_MESSAGE); //короче создаем поп-ап , вызываем метод для его отображенрия , подаем на него
                    // компонент (в данном случае родительское окно) ,текст ошибки , тайт окна с ошибкой , тип сообщения
                    System.exit(0); // выходим после сообщения
                }
            }
            if (addNums.isSelected()) {      //если выбранна данная радиокнопка
                totalCalc = addNumbers(number1, number2, howManyTimes.getValue()); // вызываем метод сложения , суем в метод первое число , второе число , и значения слайдера , результат помещаем в переменную

            } else if (subtractNums.isSelected()) {         // тогда если (выбрана радиокнопка "вычитание")
                totalCalc = subtractNumbers(number1, number2, howManyTimes.getValue()); //в totalcalc  засовываем функцию вычитания , на нее подаем первое второе число и значение слайдера
            } else if (multNums.isSelected()) { // тогда если выбрана радиокнопка умножения
                totalCalc = multiplyNumbers(number1, number2, howManyTimes.getValue()); // вызываем функцию умножения , опять  первое + второе число + значение слайдера , результат в переменную дабл
            } else {totalCalc = divideNumbers(number1, number2, howManyTimes.getValue()); // тогда , (если выбрана радиокнопка "деление") вызываем фукнкцию деления , подаем на нее первое/второе чисол + значение слайдера
            }

            if (dollarSign.isSelected()){       // если выбран данный чекбокс
                NumberFormat numFormat = NumberFormat.getCurrencyInstance(); // создаем  обьект , вызывам метод который устанавливает валюту в зависимости от текущей локали
                JOptionPane.showMessageDialog(JavaLesson22.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE); // создаем поп-ап , вызывам метод для отображения ока , на него подаем родителя окна ,
                // обьект, который возвращает нам число (результат вычислений) в определенной валюте , тайтл поп апа , тип окна информационный
            }else if(commaSeparator.isSelected()){ //тогда если  выбран чек бокс "кома-сепаратор"
                NumberFormat numFormat = NumberFormat.getNumberInstance(); // создаем обьект , вызываем метод , который возвращает  числовой формат (без точки) укапханной локали
                JOptionPane.showMessageDialog(JavaLesson22.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE); // попап, отображаем его , в него засовываем родителя , формат отображения числа , на которое подаем результат
                // тайтл окна , тип информационного окна
            }else{ JOptionPane.showMessageDialog(JavaLesson22.this,totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE); //ИНАЧЕ просто показываем инфо окно

            }
        }
    }
    private class ListenForSlider implements ChangeListener{            //создали прайват клас (экшн для слайдера)

        @Override
        public void stateChanged(ChangeEvent e) {       // реализовываем метод
            if(e.getSource() == howManyTimes){ // если метод равняется слайдеру
                label3.setText("Perform How Many Times? " + howManyTimes.getValue()); // в лейбл ставим сообщение + значение слайдера
            }

        }

    }
    public static double addNumbers(double number1, double number2, int howMany ){ // создаем метод для сложение чисел (принимает на себя первое+второе + как часто)
        double total = 0; // создали лабл , нуль
        int i = 1; //создали инту с 1
        while (i <= howMany){ // пока инта меньше или равно значениб слайдера
            total = total + (number1 + number2); // в дабл пихаем сумму двух чисел, резульат в тотал суем
            i++; // увеличиваем счетчик на 1
        }
        return total; // метод возвращает результат
    }

    public static double subtractNumbers(double number1, double number2, int howMany ){ // создали такой же метод для вычитания
        double total = 0; // создали нулевой дабл
        int i = 1; // единицу
        while (i <= howMany){   //пока..
            total = total + (number1 - number2); // выполняем операцию с вычитанием , результат прибавляем к резульату
            i++; // увеличиваем счечик на 1
        }
        return total; // метод возвращает тотал
    }
    public static double multiplyNumbers(double number1, double number2, int howMany ){  //то же самое для умножения
        double total = 0;
        int i = 1;
        while (i <= howMany){
            total = total + (number1 * number2);
            i++;
        }
        return total;
    }

    public static double divideNumbers(double number1, double number2, int howMany ){ // и для деления
        double total = 0;
        int i = 1;
        while (i <= howMany){
            total = total + (number1 / number2);
            i++;
        }
        return total;
    }

}