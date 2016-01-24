import java.sql.*;

/**
 * Created by vstrk on 1/23/16.
 */

public class JavaLesson34 {
    //creating main method
    public static void main(String[] args) {
        //creating and init new var, take null for it
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //init connection, login
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "1244");

            Statement sqlState = conn.createStatement();

            //Creating sql operation and put in string
            String selectStuff = "Select first_name from customer";

            //put sql command-string in execute method, also put execute method
            //in resultSet
            ResultSet rows = sqlState.executeQuery(selectStuff);

            //while rows is counting, sout prowide names of customer table
            while (rows.next()) {
                System.out.println(rows.getString("first_name"));
            }

            //CATHCING if something will wrong reg sql operation

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLException: " + ex.getErrorCode());

            //CATCHING if Driver wont find
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
