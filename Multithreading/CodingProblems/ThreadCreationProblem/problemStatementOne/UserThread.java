package Multithreading.CodingProblems.ThreadCreationProblem.problemStatementOne;



public class UserThread extends Thread{
    
    TicketCounter ticketcounter;
    public UserThread(String name,TicketCounter ticketcounter)
    {
        super(name);
        this.ticketcounter=ticketcounter;
    }
    public void run(){
         
         ticketcounter.getSeat(this);
         
    }
}