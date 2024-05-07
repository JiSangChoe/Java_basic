import java.sql.*;

public class TestDrive{
    public static void main(String args[]){
        Connection con = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/estate?serverTimezone=UTC&characterEncoding=UTF-8", // DB URL
                    "developer", "P!ssw0rd");  // USER_NAME과 PASSWORD
            System.out.println("Success");
        }
        catch(SQLException ex){ 
            System.out.println("SQLException" + ex);
            ex.printStackTrace();
        }
        catch(Exception ex){ 
            System.out.println("Exception:" + ex);
            ex.printStackTrace();
        }
    }
}
