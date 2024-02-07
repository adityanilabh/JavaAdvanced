package ErrorHandling.ThrowFinallyThrows.Throw;

public class UncheckedException {
    public static void validate(int age)
    {
        if(age<19)
        {
            throw new ArithmeticException("Age is less than 19");
        }
        else{
            System.out.println("Person is eligible to vote!");
        }
    }
    public static void main(String[] args)
    {
        validate(13);
        
    }
}
