import java.util.*;

public class SearchMethods{

    public static void main(String[] args)
    {
        // initialise the array and take input
        
        ArrayMethods arrayMethods = new ArrayMethods();
        ArrayList<Integer>arr1= new ArrayList<>();
        arr1= arrayMethods.userInput(arr1);
        // ask user to input any number to be searched.
        Integer elementToBeSearched= arrayMethods.userInput();
         
        //use Linear Search first 
        long startTime = System.currentTimeMillis();
        arrayMethods.LinearSearch(arr1,elementToBeSearched);
        long endTime = System.currentTimeMillis();
        
        // checking the time taken to do the process
        arrayMethods.outputElement(startTime,endTime);
        
        // use Binary Search with annotation (User defined)
        startTime = System.currentTimeMillis();
        arrayMethods.BinarySearch(arr1,elementToBeSearched);
        endTime = System.currentTimeMillis();
        
        // checking the time taken to do the process
        arrayMethods.outputElement(startTime,endTime);
    }
}