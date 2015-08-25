import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaLesson24  extends JFrame{      //создали класс
    JComboBox favoriteShows;                //создали обьект типа комбобокс
    JButton button1;                        //создали кнопку
    String infoOnComponent = "";            //стрингу
    public static void main(String[] args){ //создали запуускающий метод
        new JavaLesson24();                 // в него суем конструктор
    }

    public  JavaLesson24(){             // создали кноструктор
        this.setSize(400, 400);         //поставили размер
        this.setLocationRelativeTo(null);   // позиционируем окно на центр экрана
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //закрываем программу при кнопке "закрыть"
        this.setTitle("My Fourth Frame");   // установили тайтл
        JPanel thePanel = new JPanel(); //создали панель
        String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"}; //создали одномерный массив , засунули туда три значения
        favoriteShows = new JComboBox(shows);   // инициализируем комбобокс , в него засовуем массив который выше
        favoriteShows.addItem("Pushing Daisies"); //добавляем в конец листа новое значение
        thePanel.add(favoriteShows); // добавляем наш комбобокс в панель

        button1 = new JButton("Get Answer"); //инициализируем кнопку , даем ей имя
        ListenForButtons lForButton = new ListenForButtons(); // создаем и инициализируем екшн для кнопки
        button1.addActionListener(lForButton); // подключаем к кнопке слушалку , в нее суем екшн выше
        thePanel.add(button1); // добавляем в панель кнопку
        this.add(thePanel); // добавляем панель в окно
        this.setVisible(true); // отображаем окно
        favoriteShows.insertItemAt("Dexter", 1); // вставляем данное значение в 1 ячейку
        favoriteShows.setMaximumRowCount(3); // устанавливаем макимальное значение ячеек в нашем комбобоксе
        favoriteShows.removeItem("Dexter"); // удаляем наше засунутуе значение
        favoriteShows.removeItemAt(1);  //удаляем значение по первой ячейке
    }

    private  class  ListenForButtons implements ActionListener{     //  создали прайват класс екшена для кнопки , реализуем интерфейс ActionListener

        @Override                                                   //аннотация
        public void actionPerformed(ActionEvent e) {    //реализуем метод от интерфейса
            if(e.getSource() == button1){       //если источником екшена была кнопка то
                favoriteShows.setEditable(true);  // короче устанавливаем доступным для редактирования комбобокс ()
                infoOnComponent += "Item at 0 : " + favoriteShows.getItemAt(0)+ "\n"; //добавляем в нашу стрингу месседж + инфо о значении в нулевой ячейке+перенос строки
                infoOnComponent += "Num of Shows : " + favoriteShows.getItemCount()+ "\n"; // еще добавляем месседж+ кол-во айтемов в данном масиве
                infoOnComponent += "Selected ID : " + favoriteShows.getSelectedItem()+ "\n"; // еще месседж + выбранные в комбобоксе айтем
                infoOnComponent += "Selected Value : " + favoriteShows.getSelectedIndex()+ "\n"; // месседж + индекс выбранного айтема в комбобоксе
                infoOnComponent += "Are Editable : " + favoriteShows.isEditable()+ "\n"; //месседж + булевое значение , которпое мы установили в строке 41
                JOptionPane.showMessageDialog(JavaLesson24.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE); //создаем поп-ап , устанавливаем папашу в качества основного окна ,
                //показываем стрингу с ее значениями , ставим шапку , тип окна - информационный
                infoOnComponent = ""; // "обнуляем накшу стрингу"
            }

        }
    }

}
