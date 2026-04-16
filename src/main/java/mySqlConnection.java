import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mySqlConnection {
    public static void main(String[] args) throws Exception{
        String dbUrl="jdbc:mysql://127.0.0.1:3306/?user=root";
        String user="root";
        String pass="Gg#241071";
        String query="SHOW DATABASES";

        try{
            Connection conn= DriverManager.getConnection(dbUrl,user,pass);
            Statement statement= conn.createStatement();
            ResultSet result= statement.executeQuery(query);

            while (result.next()){
                System.out.println(result.getString(1));
            }
        }catch(Exception e){
            System.out.println("Getting exception "+e.getMessage());
        }
    }
}
