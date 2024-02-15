import java.sql.*;
public class FirstJDBC {
    public static void main(String[] args)
    {
         try{
              // load the driver
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
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }
}
