package Multithreading.CodingProblems.ThreadCreationProblem.problemStatementOne;

import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        TicketCounter ticketcounter= new TicketCounter(50);
        try(Scanner sc= new Scanner(System.in))
        {
            while(!ticketcounter.isFull())
            {
                System.out.println("enter user name:");
                    String name= sc.nextLine();
                    UserThread userthread= new UserThread(name,ticketcounter);
                    userthread.start();
                
    
            }
        }
        

    } 
}