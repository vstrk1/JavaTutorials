import java.io.*;

    public class JavaLesson32 {                             // создали класс
    public static void main(String[] args){                 // запускающий метод
        Customer[] customers = getCustomers();          // создали масив , и запихнули в него массив
        PrintWriter custOutput = createFile("E:/IntelliJ IDEA Community Edition 14.1.5/IdeaProjects/JavaTutorials/jl32/customers.txt");      // создаем обьект типа "output-stream" и засовываем туда самописный метод ,в который засовываем строку
        for(Customer person : customers){                  // крутим цикл ,столько сколько у нас кастомеров
            createCustomers(person, custOutput);          // каждый раз создаем персону и файл (используем самописный метод)
        }                                                //
        custOutput.close();                             //  закрываем stream - output
        getFileInfo();                                 //  вызываем воид метод
    }
    private static class Customer{      // создаем статический класс
        public String firstName, lastName;     // две стринги
        public int custAge;             // инта
        public Customer(String firstName, String lastName, int custAsge){   // создаем контруктор
            this.firstName = firstName; // инициализируем входные параметры констуктора к тем , что в начале класса
            this.lastName = lastName;
            this.custAge = custAsge;

        }
    }
    private static Customer[] getCustomers() {      // создали метод (гетер ? ) от класса кастомер
        Customer[] customers = new Customer[5];  // создали и нициализировали массив
        customers[0] = new Customer("John", "Smith", 21); // в него засовываем первую стрингу  , вторую и инту
        customers[1] = new Customer("Sally", "Osborn", 22);
        customers[2] = new Customer("Paul", "Ozzy", 23);
        customers[3] = new Customer("Tom", "Duck", 24);
        customers[4] = new Customer("Mark", "Twen", 25);
        return customers; // возвращаем кастомеров
    }
    private static PrintWriter createFile(String fileName){         //создали метод  для создания файла , принимает на себя стринг
        try{                                        //трай
            File listOfNames = new File(fileName);          //
            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfNames)));
        }catch (IOException e){
            System.out.println("An i/o error occured");
            e.printStackTrace();
            System.exit(0);
        }
        return  null;
    }
    private static void createCustomers(Customer customer, PrintWriter  custOutput){
        String custInfo = customer.firstName + " " + customer.lastName + " ";
        custInfo += Integer.toString(customer.custAge);
        custOutput.println(custInfo);
    }
    private static void getFileInfo(){
        System.out.println("Info Written to File\n ");
        File listOfNames = new File("D:/ATools/IdeaProjects/JavaTutorials/customers.txt");
        try {
            BufferedReader getInfo = new BufferedReader(
                                    new FileReader(listOfNames));
            String custInfo = getInfo.readLine();
            while(custInfo != null){
                String[] indivCustData = custInfo.split(" ");
                int custAge = Integer.parseInt(indivCustData[2]);
                System.out.println("Customer " + indivCustData[0] + " is "+ custAge + "\n" );
                System.out.println(custInfo);
                custInfo = getInfo.readLine();
            }
        }
        catch (FileNotFoundException e ){
            System.out.println("Couldn`t Find File");
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("An i/o error occured");
            System.exit(0);

        }
    }

}
