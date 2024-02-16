import java.sql.*;
public class TableCreation {
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String var1 = "jdbc:mysql://localhost:3306/myblog";
            String var2 = "root";
            String var3 = "#Facebook9";
            Connection var4 = DriverManager.getConnection(var1, var2, var3);

            if (var4.isClosed()) {
                System.out.println("connection is closed!");
            } else {
                System.out.println("connection is made!");
            }
            String q= "create table table1(tId int(20) primary key auto_increment," +
                    "tName varchar(200) not null, tCity varchar(400))";

            Statement stmt= var4.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in database....");
            var4.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
