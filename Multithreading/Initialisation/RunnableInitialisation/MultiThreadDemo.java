package Multithreading.Initialisation.RunnableInitialisation;

public class MultiThreadDemo implements Runnable{
    public void run(){
        try{
          System.out.println("Thread is created"+Thread.currentThread().threadId()+" is running");
        }catch(Exception e){
          System.out.println("Error Occured!"+e.getMessage());
        }
    }
}
