package Multithreading.DaemonThread.CodeDaemon;

public class DaemonMain {
    public static void main(String[] args)
    {
        DaemonThreadExample daemonExample= new DaemonThreadExample("thread1");
        DaemonThreadExample daemonExampleTwo= new DaemonThreadExample("thread2");
        DaemonThreadExample daemonExampleThree= new DaemonThreadExample("thread3");
    
         // this code will set daemon thread to true, meaning this is now daemon thread.
        daemonExample.setDaemon(true);
    
        daemonExample.start();
        daemonExampleTwo.start();
    
        // marking thread3 as a daemon thread.
        daemonExampleThree.setDaemon(true);
        daemonExampleThree.start();
    }

}
    
