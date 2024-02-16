import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageSave {
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
            String q = "insert into images(pic) values(?)";
            PreparedStatement pstmt= con.prepareStatement(q);

            // pstmt.setString(1,"values");
            FileInputStream fis= new FileInputStream("jdbc_Architecture.png");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done..");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
