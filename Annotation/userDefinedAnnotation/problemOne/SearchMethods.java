import java.util.*;
import java.lang.*;
import java.io.*;
public class SearchMethods{

    public static void main(String[] args)
    {
        // initialise the array and take input
        
        ArrayList<Integer>arr1= new ArrayList<>();
        arr1= ArrayMethods.userInput(arr1);
        // ask user to input any number to be searched.
        Integer elementToBeSearched= ArrayMethods.userInput();
         
        //use Linear Search first 
        long startTime = System.currentTimeMillis();
        ArrayMethods.LinearSearch(arr1,elementToBeSearched);
        long endTime = System.currentTimeMillis();
        
        // checking the time taken to do the process
        ArrayMethods.outputElement(startTime,endTime);
        
        // use Binary Search with annotation (User defined)
        long startTime = System.currentTimeMillis();
        ArraysMethods.BinarySearch(arr1,elementToBeSearched);
        long endTime = System.currentTimeMillis();
        
        // checking the time taken to do the process
        ArrayMethods.outputElement(startTime,endTime);
    }
}