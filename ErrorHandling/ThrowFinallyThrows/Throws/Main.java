package ErrorHandling.ThrowFinallyThrows.Throws;

import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void readFile() throws FileNotFoundException{
        
        java.io.FileInputStream file=  new java.io.FileInputStream("non_existing.txt");
    }
    public static void main(String[] args)
    {
        try{
            readFile();
        }catch(FileNotFoundException e)
        {
            System.out.println("file not found!"+e.getMessage());
        }
    }
}
