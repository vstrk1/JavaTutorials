import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.Calendar;
import java.util.Date;


public class JavaLesson30 extends JFrame {                                  //создали класс
    JLabel nameLabel, streetLabel, stateLabel, dateLabel,ageLabel, sexLabel, optionsLabel, aboutLabel;   // лейблы
    JTextField nameText, streetText;        // филды
    JComboBox stateList;        // комбобокс
    JSpinner dateSpin;      // спинер
    JSlider ageSlider;      // слайдер
    JRadioButton maleRadio, femaleRadio; // две радиокнопки
    ButtonGroup sexGroup; // группа кнопок
    JCheckBox morningCheck, afterNCheck, eveningCheck; // чикбоксы
    JTextArea aboutYou; // площадь для ввода текста
    public static void main(String[] args) { // запускающий метод
        new JavaLesson30(); // запихнули класс
    }
    public JavaLesson30() {             // создали класс

        this.setLocationRelativeTo(null); //установили спозицию
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие программы при закрытии окна
        this.setTitle("Random Layout"); // установили тайтл

        JPanel thePanel = new JPanel();         // панель
        thePanel.setLayout(new GridBagLayout()); // установили в панель лейаут
        nameLabel = new JLabel("  Name:"); //инициализировали лейбл
        addComp(thePanel, nameLabel, 0, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); // вызываем кастомный метод для добавления компонентов в окно
        nameText = new JTextField(30); // инициализировали новре текстовое поле , введи длинну
        addComp(thePanel, nameText, 1, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); // вызвали кастом метод
        streetLabel = new JLabel("  Street:");      //иницализировали новую лейбу
        addComp(thePanel, streetLabel, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); //добавили
        streetText = new JTextField(30); // текст филд
        addComp(thePanel, streetText, 1, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); // добавили
        Box sexBox = Box.createVerticalBox(); // создали бокс
        maleRadio = new JRadioButton("Male"); // инициализировали радиокнопку
        femaleRadio = new JRadioButton("Female"); // вторую кнопку
        ButtonGroup sexGroup = new ButtonGroup(); // создали группу кнопок
        sexGroup.add(maleRadio); // добавили кнопки в группу
        sexGroup.add(femaleRadio);
        sexBox.add(maleRadio);
        sexBox.add(femaleRadio);
        sexBox.setBorder(BorderFactory.createTitledBorder("Sex")); // нарисовали бордер вокруг бокса , добавили тайтл
        addComp(thePanel, sexBox, 3, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); //  добавили к компоненты
        JPanel statePanel = new JPanel(); // создали и инициализировали панель
        statePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0)); // установили лейаут
        stateLabel = new JLabel("State"); // добавили лейбу
        statePanel.add(stateLabel); // установили лейбу в панель
        String[] states = {"PA", "NY", "OH", "WV", "NJ"}; // создали массив с штатами
        stateList = new JComboBox(states); //  инициализировали комбобокс
        statePanel.add(stateList); // добавили в панель
        dateLabel = new JLabel("Appointment Date"); // инициализировали лейбу для даты
        Date todaysDate = new Date(); // создали и иницализировали дату
        dateSpin = new JSpinner(new SpinnerDateModel(todaysDate, null, null,
        Calendar.DAY_OF_MONTH));   // инициализировали спинер
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpin, "dd/MM/yy"); // установили формат даты
        dateSpin.setEditor(dateEditor); // засетили его
        statePanel.add(dateSpin); // добавили в панель
        ageLabel = new JLabel("Age: 50"); // установили панель для отображения
        statePanel.add(ageLabel); // доабивили в панель
        ageSlider = new JSlider(1, 99, 50); // инициализировали слайдер , установили значения
        ListenForSlider lForSlider = new ListenForSlider(); //
        ageSlider.addChangeListener(lForSlider); // добавили в слайдер лисенер
        statePanel.add(ageSlider); // добавили слайдер в панель
        addComp(thePanel, statePanel, 1, 2, 5, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); // вызвали метод добавления компонента

        Box optionBox = Box.createVerticalBox(); // создали и иницализировали вертикальный бокс
        morningCheck = new JCheckBox("Morning"); //инициализировали новый чекбокс
        afterNCheck = new JCheckBox("Afternoon"); // еще
        eveningCheck = new JCheckBox("Evening");

        optionBox.add(morningCheck); // добавили чеки в бокс
        optionBox.add(afterNCheck);
        optionBox.add(eveningCheck);
        optionBox.setBorder(BorderFactory.createTitledBorder("Time of Day")); // создали бордер + тайтл
        addComp(thePanel, optionBox, 1, 3, 2, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE); // добавили в метод

        aboutYou = new JTextArea(6, 40); // инициализировали площадь для ввода

        aboutYou.setText("Tell us something about you"); // написали дефолтный текст

        aboutYou.setLineWrap(true); //

        aboutYou.setWrapStyleWord(true);  // конфиги

        JScrollPane scrollbar1 = new JScrollPane(aboutYou, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); // создали и инициализировали скрол

        addComp(thePanel, scrollbar1, 2, 3, 3, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); //добавили в скролбар

        this.add(thePanel); // добавили готвую панель в окно

        this.pack(); // пак

        this.setVisible(true); //устанавлоиваем что он видимый

        this.setResizable(false); //нельзя менять размер окна
    }
    private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch) {         //создаем прайват метод
        //принимает на себя панель , компонент , интовые позиции  , ширину/высоту компонента , место , заполенние

        GridBagConstraints gridConstraints = new GridBagConstraints(); // грид

        gridConstraints.gridx = xPos; //ставим входяшее значения
        gridConstraints.gridy = yPos;
        gridConstraints.gridwidth = compWidth;
        gridConstraints.gridheight = compHeight;
        gridConstraints.weightx = 100;
        gridConstraints.weighty = 100;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        gridConstraints.anchor = place;
        gridConstraints.fill = stretch;

        thePanel.add(comp, gridConstraints); //добавляем параметры в панель

    }

    private class ListenForSlider implements ChangeListener {           // создаем приватный лисенер

        public void stateChanged(ChangeEvent e) {           // создаем метод , принимает на себя выбранный ивент

            if (e.getSource() == ageSlider) { //если источник - это значение слайдера

            ageLabel.setText("Age: " + ageSlider.getValue()); // ставим значение в лейбл
            }
        }
    }
}
