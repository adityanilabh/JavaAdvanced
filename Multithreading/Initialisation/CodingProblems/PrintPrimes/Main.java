package Multithreading.Initialisation.CodingProblems.PrintPrimes;
public class Main {
     public static void main(String[] args)
     {
         PrintNumber thread1= new PrintNumber(1,6);
         PrintNumber thread2 = new PrintNumber(4,10);

         thread1.start();
         thread2.start();
     }
}
