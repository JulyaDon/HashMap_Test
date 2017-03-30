/**
 * Created by July on 28.03.2017.
 */
import javax.xml.crypto.Data;
import java.sql.*;
public class DataBase {
    public static String DB_NAME = "jdbc:mysql://localhost:3306/TestForCamera";
    public  static String DB_USER = "mysql";
    public  static String DB_PASSWORD = "mysql";
    private static PreparedStatement statement = null;
    private static Connection connection = null;
    public static void DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DB_NAME, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void DB_INSERT(int ID, int preID, int generation, String info){
        String query = "INSERT INTO ObjectParameters (ID,PreviousID,Generation,Info) VALUES (?,?,?,?)";
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, ID);
            statement.setInt(2, preID);
            statement.setInt(3, generation);
            statement.setString(4, info);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(statement!=null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
