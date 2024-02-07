package ErrorHandling.TryCatch.NestedTryCatch;

public class NestedTryCatch {
    public static void main(String[] args)
    {
        try{
            // dividing by zero
            try{
                System.out.println("dividing by zero will cause this exception below");
                int data1=43/0;
                System.out.println(data1);
            }
            catch(ArithmeticException e){
                   System.out.println(""+e.getMessage());
            }

            // index out of bound

            try{
                System.out.println("demonstration of array index out of bound!");
                int data[]= new int[4];
                data[5]=23;
            }
            catch(Exception e)
            {
                System.out.println(""+e.getMessage());
            }
        }
        catch(Exception e)
        {
            System.out.println("Message showing this will behave as catch if primary try don't work!: "+ e.getMessage());
        }
        
        System.out.println("this line is out of try catch!");

    }
}
