import java.io.*;

public class JavaLesson33 {
    public static void main(String[] args) {
        Customer[] customers = getCustomers();
        DataOutputStream custOutput = createFile("D:/IdeaProjects/JavaTutorials/customers2.dat");
        for (Customer person : customers) {
            createCusomers(person, custOutput);
        }
    }

    private static class Customer {
        public String custName;
        public int custAge;
        public double custDebt;
        public boolean oweMiney;
        public char custSex;

        public Customer(String custName, int custAge, double custDebt, boolean oweMiney, char custSex) {
            this.custName = custName;
            this.custAge = custAge;
            this.custDebt = custDebt;
            this.oweMiney = oweMiney;
            this.custSex = custSex;
        }
    }

    private static Customer[] getCustomers() {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("John Smith", 21, 12.25, true, 'M');
        customers[1] = new Customer("Elton John", 13, 12.25, true, 'M');
        customers[2] = new Customer("Joody Boy", 47, 12.25, true, 'M');
        customers[3] = new Customer("Mike Groovy", 63, 12.25, true, 'M');
        customers[4] = new Customer("Vitalij JS", 29, 12.25, true, 'M');
        return customers;
    }

    private static DataOutputStream createFile(String fileName){
        try{
            File listOfNames = new File(fileName);
            DataOutputStream infoToWrite = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(listOfNames)));
            return  infoToWrite;
        }catch (IOException e){
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }

    private static void createCusomers(Customer customer, DataOutputStream custOutput){
        try {
            custOutput.writeUTF(customer.custName);
            custOutput.writeInt(customer.custAge);
            custOutput.writeDouble(customer.custDebt);
            custOutput.writeBoolean(customer.oweMiney);
            custOutput.writeChar(customer.custSex);
        }catch (IOException e){
            System.out.println("I/O Error");
            System.exit(0);
        }

    }
    private  static void getFileInfo(){
        System.out.println("Info Written to file");
        File listOfNames = new File("D:/IdeaProjects/JavaTutorials/customers2.dat");
        boolean eof = false;

        try{
            DataInputStream getInfo = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(listOfNames)));
            while (!eof){
                String custName = getInfo.readUTF();
                int custAge = getInfo.readInt();
                double custDebt = getInfo.readDouble();
                boolean oweMiney = getInfo.readBoolean();
                char custSex = getInfo.readChar();
                System.out.println(custName);
                System.out.println(custAge);
                System.out.println(custDebt);
                System.out.println(oweMiney);
                System.out.println(custSex);

            }
        }catch (IOException e){
            System.out.println("I/O Error");
            System.exit(0);
        }
    }

}
