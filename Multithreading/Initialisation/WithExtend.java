package Multithreading.Initialisation;
import Multithreading.Initialisation.MultiThreadingDemo;
/* made this program by implementing extend method for initialisation */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithExtend{
    public static void main(String[] args)
    {
        Integer number;
        try{
            System.out.println("enter the number of times you want to output:");
            BufferedReader reader= new BufferedReader( new InputStreamReader(System.in));
            number= Integer.parseInt(reader.readLine());

            for(int index=0;index<=number;index++)
            {
                MultiThreadingDemo threaddemo= new MultiThreadingDemo();
                threaddemo.start();
            }

        }catch(IOException e){
              System.out.println("Error occured! "+e.getMessage());
        }
    }
}