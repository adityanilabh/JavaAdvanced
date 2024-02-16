import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTable {
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating connection.
            String url="jdbc:mysql://localhost:3306/myblog";


            // giving username  and password:
            String username= "root";
            String password= "#Facebook9";
            Connection con= DriverManager.getConnection(url,username,password);

            if(con.isClosed())
            {
                System.out.println("connection is closed!");
            }
            else{
                System.out.println("connection is made!");
            }
            String q = "insert into table1(tName,tCity) values (?,?)";
            PreparedStatement pstmt= con.prepareStatement(q);

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name: ");
            String name= br.readLine();
            System.out.println("enter the city name:");
            String city= br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("inserted...");

            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
