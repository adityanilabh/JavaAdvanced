import java.util.*;
import java.io.*;
public class ArrayMethods{

     public boolean LinearSearch(ArrayList<Integer>list,Integer target)
     {
         for(Integer element: list)
         {
            if(element: target)
            {
                System.out.printout("Element is present!");
                return true;
            }
         }
         if(status==0)
         {
            System.out.println("Element is not present in the array!");
         }
         return true;
     }

     public boolean BinarySearch(ArrayList<Integer>list1,Integer target)
     {
              int endPoint=list1.length;
              int startingPoint=0;
              while(startPoint<=endPoint)
              {
                   int midIndex= endPoint-(endPoint-startPoint)/2;
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
                     startPoint=midIndex+1;
                   }
              }
              System.out.println("Element is not in the array!");
              return false;
     }

     public ArrayList<Integer> userInput(ArrayList<Integer>arr1)
     {
          System.out.println("Please tell me the size of Array!");
          try{
                  BufferStream
          }catch(Exception e)
          {
             System.out.println("error Occurs!"+e.Message());
          }
     }
}