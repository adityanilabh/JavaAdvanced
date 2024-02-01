package Multithreading.Initialisation.ExtendInitialisation;

public class MultiThreadingDemo extends Thread{
    public void run(){
        try{
               System.out.println("Thread"+Thread.currentThread().threadId()+"is running");
        }catch(Exception e){
            System.out.println("error occured in running threads.");
        }
    }
}
