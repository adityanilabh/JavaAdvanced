package ErrorHandling.JavaCustomException.WithThrow;

class  CustomMadeException extends Exception{
    public CustomMadeException(String str)
    {
     super(str);
    }
}
public class Main {

   
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        try{
            throw new CustomMadeException("this is user defined");
        }
        catch(CustomMadeException e){
         System.out.println("exception caught!");
         System.out.println(e.getMessage());
        }
    }
}
