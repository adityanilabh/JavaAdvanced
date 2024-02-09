package ErrorHandling.JavaCustomException.CustomExceptionExample.ProblemStatementOne;

public class Main {
    public static void main(String[] args)
    {
        try {
            // Valid age
            @SuppressWarnings("unused")
            PersonAge person1 = new PersonAge(25);
            System.out.println("Person 1 created successfully.");
            
            // Invalid age
            @SuppressWarnings("unused")
            PersonAge person2 = new PersonAge(-5); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Error creating person: " + e.getMessage());
        }
    }
    
}
