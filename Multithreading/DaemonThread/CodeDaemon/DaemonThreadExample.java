package Multithreading.DaemonThread.CodeDaemon;

public class DaemonThreadExample extends Thread {
    public DaemonThreadExample(String name)
    {
        super(name);
    }

    // now making start method. this is a defualt method in thread class
    public void run()
    {
              if(Thread.currentThread().isDaemon()==true)
              {
                System.out.println("this process is Daemon thread: "+ getName());
              }
              else{
                System.out.println("This thread is main thread: "+ getName());
              }
    }
}
