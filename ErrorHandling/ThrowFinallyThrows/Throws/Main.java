package ErrorHandling.ThrowFinallyThrows.Throws;


import java.io.FileNotFoundException;
public class Main {
    public static void readFile() throws FileNotFoundException{
        
        @SuppressWarnings({ "unused", "resource" })
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
