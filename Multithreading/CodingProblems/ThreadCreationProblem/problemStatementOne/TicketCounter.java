package Multithreading.CodingProblems.ThreadCreationProblem.problemStatementOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketCounter extends Thread{
    
    private Integer maxSize;
    private Integer currentSize;
    List<UserThread>ticket_counter;
      public TicketCounter(int size)
      {
          ticket_counter= new ArrayList<UserThread>(50);
          this.currentSize=0;
          this.maxSize=size;
          for(int i=0;i<size;i++)
          {
              ticket_counter.set(i,null);
          }
      }
      public Boolean isFull()
      {
        if(this.currentSize==maxSize)
        {
            return true;
        }
        return false;
      }
      /**
     * @param threaduser
     */
    public void getSeat(UserThread threaduser)
      {
          try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the seat number you want to book");
              Boolean booked= false;
              do{
                  Integer seatNumber= sc.nextInt();
                  if(ticket_counter.get(seatNumber)==null)
                  {
                        ticket_counter.set(seatNumber,threaduser);
                        booked=true;
                  }
                  else{
                      System.out.println("hey seat is already booked!, please book another book");
                  }
              }
              while(booked==false);
        }
      }
}