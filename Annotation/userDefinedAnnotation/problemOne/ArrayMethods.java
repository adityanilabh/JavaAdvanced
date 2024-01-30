import java.util.*;
import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
public class ArrayMethods implements ArrayMethodsInterface{
    private BufferedReader reader;

    public ArrayMethods() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    @Override
     public boolean LinearSearch(ArrayList<Integer>list,Integer target)
     {
         for(Integer element: list)
         {
            if(element== target)
            {
                System.out.println("Element is present!");
                return true;
            }
         }
         
         return false;
     }

    @Override
     public boolean BinarySearch(ArrayList<Integer>list1,Integer target)
     {
              int endPoint=list1.size();
              int startingPoint=0;
              while(startingPoint<=endPoint)
              {
                   int midIndex= endPoint-(endPoint-startingPoint)/2;
                   if(list1.get(midIndex)==target)
                   {
                       System.out.println("Element is found!");
                       return true;
                   }
                   if(list1.get(midIndex)>target)
                   {
                       endPoint=midIndex-1;
                   }
                   else if(list1.get(midIndex)<target)
                   {
                     startingPoint=midIndex+1;
                   }
              }
              System.out.println("Element is not in the array!");
              return false;
     }

      @Override
     public ArrayList<Integer> userInput(ArrayList<Integer>arr1)
     {
        ArrayList<Integer>newArray= new ArrayList<>();
          
          try{
            System.out.println("Please tell me the size of Array!");
            Integer inputSize= Integer.parseInt(reader.readLine());
            System.out.println("Enter the elements of the array!");
            for(Integer i=0;i<inputSize;i++)
            {
                int inputelement= Integer.parseInt(reader.readLine());
                newArray.add(inputelement);
            }         
          }catch(IOException | NumberFormatException e)
          {
             System.out.println("error Occurs!"+e.getMessage());
          }
          return newArray;
     }
    
     @Override
     public Integer userInput()
     {
        Integer inputElement=0;
        try{
            inputElement= Integer.parseInt(reader.readLine());
        }
        catch(IOException | NumberFormatException e)
        {
            System.out.println(""+e.getMessage());
        }
        return inputElement;
     }

    @Override
    public void outputElement(long startTime, long endTime) {
        long outputResult= startTime-endTime;
        System.out.println(outputResult);
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface EfficientSearch {
    String comments() default "";
     }
}