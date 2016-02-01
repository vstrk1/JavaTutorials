import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * Created by vstrk on 1/26/16.
 */

public class JavaLesson36 {

    //create two-dimensional array
    static Object[][] databaseInfo;

    //CPR - cost per run
    //create dimensional array with headers for da table
    static Object[] columns = {"Year", "PlayerID", "Name", "TTRC", "Team", "Salary", "CPR", "POS"};

    //in dis object provided object columns from getMetaDataMethod
    static ResultSet rows;

    //Result meta data contains information on da data returned og the query
    static ResultSetMetaData metaData;

    //DefaultTableModel defines the methods JTable will use
    static DefaultTableModel dTableModel = new DefaultTableModel(databaseInfo, columns) {
    //overiding da getColumn Class
        public Class getColumnClass(int column) {
            Class returnValue;

            if ((column >= 0) && (column < getColumnCount())) {
                returnValue = getValueAt(0, column).getClass();
            } else {
                returnValue = Object.class;
    //returns the class for the item in the column
            }
            return returnValue;
        }
    };

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Connection conn = null;

        try {
    //the driver allows to query the database with java
    //forName dynamically loads the class
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "1244");

            Statement sqlState = conn.createStatement();

            String selectStuff = "select b.yearID, b.playerID, CONCAT(m.nameFirst,Char(32), m.nameLast) AS Name," +
                    " ((b.H+b.BB)+(2.4*(b.AB+b.BB)))*(t.TB+(3*(b.AB+b.BB)))/(9*(b.AB+b.BB))-(.9*(b.AB+b.BB)) AS TTRC," +
                    " b.teamID AS Team, s.salary AS Salary," +
                    " CAST( s.salary/(((b.H+b.BB)+(2.4*(b.AB+b.BB)))*(t.TB+(3*(b.AB+b.BB)))/(9*(b.AB+b.BB))-(.9*(b.AB+b.BB)))" +
                    " as decimal(10,2)) AS CPR, f.POS AS POS FROM Batting b, Master m, Salaries s, TOTBYR t," +
                    " Fielding f WHERE b.playerID = m.playerID AND t.playerID = m.playerID AND t.yearID = 2010" +
                    " AND b.yearID = t.yearID AND s.playerID = b.playerID AND s.yearID = b.yearID AND b.AB > 50" +
                    " AND b.playerID = f.playerID AND b.playerID = t.playerID ORDER BY TTRC DESC LIMIT 200;";


            rows = sqlState.executeQuery(selectStuff);

            Object[] tempRow;

            while (rows.next()) {
                tempRow = new Object[]{rows.getInt(1), rows.getString(2), rows.getString(3),
                        rows.getDouble(4), rows.getString(5), rows.getInt(6), rows.getDouble(7), rows.getString(8)
                };
                dTableModel.addRow(tempRow);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        JTable table = new JTable(dTableModel);

        table.setRowHeight(table.getRowHeight() + 10);

        table.setFont(new Font("Serif", Font.PLAIN, 20));

        table.setAutoCreateRowSorter(true);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        TableColumn col1 = table.getColumnModel().getColumn(0);
        col1.setPreferredWidth(100);

        TableColumn col2 = table.getColumnModel().getColumn(1);
        col2.setPreferredWidth(190);

        TableColumn tc = table.getColumn("Team");
        CenterTableCellRenderer centerRenderer = new CenterTableCellRenderer();
        tc.setCellRenderer(centerRenderer);

        tc = table.getColumn("POS");
        centerRenderer = new CenterTableCellRenderer();
        tc.setCellRenderer(centerRenderer);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}

class CenterTableCellRenderer extends DefaultTableCellRenderer {
    public CenterTableCellRenderer() {
        setHorizontalAlignment(JLabel.CENTER);
    }
}


//        metaData = rows.getMetaData();
//
//        int numOfCol = metaData.getColumnCount;
//
//        columns = new String[numOfCol];
//
//        for(int i = 1; i <= numOfCol; i++){
//
//        columns[i] = metaData.getColumnName(i);