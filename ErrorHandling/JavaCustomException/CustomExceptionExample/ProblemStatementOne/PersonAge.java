package ErrorHandling.JavaCustomException.CustomExceptionExample.ProblemStatementOne;

public class PersonAge {
    int age;
    public PersonAge(int age)throws InvalidAgeException{
            if(age<0 || age>120)
            {
                throw new InvalidAgeException("Invalid Age: "+age+" age is not between 0 and 120");
            }
            this.age=age;
    }
}
