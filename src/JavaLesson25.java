import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaLesson25 extends JFrame{           //создали клас , унаследовались от jframe -а
    JButton button1;        //создали кнопку
    String infoOnComponent = ""; // создали пустую стрингу
    JList favoriteMoves , favoriteColors; //создали два обьекта типа jlist (отображает лист с обьектами в качестве айтемов , которые мы можем выбрать )
    DefaultListModel deflistModel = new DefaultListModel(); // создаем и инициализиурем обьект типа  DefaultListModel (дефолтовая реализация модели списка )
    JScrollPane scroller;       // создаем обьект типа jScrollPane (позволяет скролить верт+гор "легкие" компоненты )

    public static void main (String[]  args) { //создали запускающий метод
        new JavaLesson25(); //конструктор класа засунули
    }
    public JavaLesson25(){      //создали конструктор
        this.setSize(400, 400);         //поставили размер
        this.setLocationRelativeTo(null); // позиционирование на середину экрана
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрываем программу при закрытии окна
        this.setTitle("My Fifth Frame"); // тайтл прописали
        JPanel thePanel = new JPanel(); //панель
        button1 = new JButton("GetAnswer"); // инициализировали кнопку , дали ей имя
        ListenForButton lForButton = new ListenForButton(); // создаем и инициализируем модель
        button1.addActionListener(lForButton); // вешаем на кнопку контролер , в него засовываем модель выше
        thePanel.add(button1); // добавляем кнопку в панель
        String[] movies = {"Matrix", "Minority Report", "Big"};   // создали стрингу массив , засунули в нее три значения
        favoriteMoves = new JList(movies);  //инициализируем   один лист
        favoriteMoves.setFixedCellHeight(30); //
        favoriteMoves.setFixedCellHeight(50); //устанавливаем высоту отображение списка
        favoriteMoves.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //устанавливаем режим выбора для списка (выбираем вариант когда можно выбрать более одного варианта)
        String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray"}; // создаем масив стрингу с 6 значениями
        for(String color:colors){ //крутим цикл столько сколько значений в втором масиве
            deflistModel.addElement(color); //добавляем каждый эелемент масива в модель списка
        }
        deflistModel.add(2, "Purple"); // в вторую ячекйку засовываем новое значение , все остальные "двигаются"
        favoriteColors = new JList(deflistModel);       //инициализируем второу jлист , суем в него ту модель с списком массива
        favoriteColors.setVisibleRowCount(1); //вызываем метод который устанавливает количество отображаемых значений в окне
        scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, //создаем скрол (принимает на себя окно которое отображается , добавляем вертикальный скрол , если он нужен)
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);  // и горизонтальный скрол если он нужен
        favoriteColors.setFixedCellHeight(30); //
        favoriteColors.setFixedCellWidth(150); // установили высоту одного отображемого значения
        thePanel.add(favoriteMoves); // добавили список в панель
        thePanel.add(scroller); // добавили скролер
        this.add(thePanel); // добавили панель в окно
        this.setVisible(true);} // установили отображение окна

    private class ListenForButton implements ActionListener { //создаем модель , которая реализует контролер ?
        public void actionPerformed(ActionEvent e){  //реализуем метод
            if(e.getSource()==button1){  //если данное событие это кнопка то
                if(deflistModel.contains("Black")) infoOnComponent += "Black is Here\n";     //если в нашем листе содержиться значение "Black" в переменную добавляем сообщение
                if(!deflistModel.isEmpty()) infoOnComponent += "Isn`t empty\n"; // если лист не пустой добавляем сообщение
                infoOnComponent+= "Elements in the List" + deflistModel.size() + "\n"; // + в месседж дописываем месседж + размер
                infoOnComponent+= "Last Element " + deflistModel.lastElement() + "\n";  // + месседж + инфо о последнем элементе
                infoOnComponent+= "First Element " + deflistModel.firstElement() + "\n"; //  + месседж о первом элементе
                infoOnComponent+= "Element in the list " + deflistModel.get(1) + "\n"; // месседж + значение массива в 1 индексе
                deflistModel.remove(0); //  удаляем 0 значение
                deflistModel.removeElement("Big"); // удаляем из списка элемент с данным словом
                Object[] arrayOfList = deflistModel.toArray(); // переделываем наш список в обьект ааррай
                for(Object color: arrayOfList){ // крутим цикл столько сколько осталось значений
                    infoOnComponent += color + "\n"; //  засовываем в стрингу значения обьекта
                }
                JOptionPane.showMessageDialog(JavaLesson25.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE); // создали поп ап
                infoOnComponent = ""; //обнулили стрингу
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

