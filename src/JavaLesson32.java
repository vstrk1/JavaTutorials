import java.io.*;

public class JavaLesson32 {
    public static void main(String[] args){
        Customer[] customers = getCustomers();
        PrintWriter custOutput = createFile("D:/ATools/IdeaProjects/JavaTutorials/customers.txt");
        for(Customer person : customers){
            createCustomers(person, custOutput);
        }
        custOutput.close();
        getFileInfo();
    }
    private static class Customer{
        public String firstName, lastName;
        public int custAge;
        public Customer(String firstName, String lastName, int custAsge){
            this.firstName = firstName;
            this.lastName = lastName;
            this.custAge = custAsge;

        }
    }
    private static Customer[] getCustomers() {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("John", "Smith", 21);
        customers[1] = new Customer("Sally", "Smith", 21);
        customers[2] = new Customer("paul", "Smith", 21);
        customers[3] = new Customer("Tom", "Smith", 21);
        customers[4] = new Customer("Mark", "Smith", 21);
        return customers;
    }

    private static PrintWriter createFile(String fileName){
        try{
            File listOfNames = new File(fileName);
            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfNames)));
        }catch (IOException e){
            System.out.println("An i/o error occured");
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
