package ErrorHandling.ThrowFinallyThrows.Throw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void method() throws IOException {  
  
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        @SuppressWarnings("resource")
        BufferedReader fileInput = new BufferedReader(file);  
        String line;
        while((line=fileInput.readLine())==null)
        {
            System.out.println(line);
        }
        throw new FileNotFoundException();  
      
    }  
    public static void main(String args[]) throws IOException{  
        try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}
