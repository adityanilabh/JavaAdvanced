package ErrorHandling.ThrowFinallyThrows.Finally;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFinally {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader= null;
        try{
             reader= new BufferedReader(new FileReader("concept.txt"));
             String line;
             while((line=reader.readLine())!=null){
                System.out.println(line);
             }
        }
        catch(FileNotFoundException e){
            System.err.println(""+e.getMessage());
        }
        catch(IOException e)
        {
            System.err.println(""+e.getMessage());
        }
        finally{
            try{
                 if(reader!=null)
                 {
                    reader.close();
                 }
            }
            catch(IOException e){
                  System.err.println("error while closing"+e.getMessage());
            }
        }
        
    }
}
