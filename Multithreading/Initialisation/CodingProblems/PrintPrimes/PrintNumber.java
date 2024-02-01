package Multithreading.Initialisation.CodingProblems.PrintPrimes;

public class PrintNumber extends Thread{
    private int start;
    private int end;

    public PrintNumber(int start, int end)
    {
        this.start= start;
        this.end= end;
    }

    @Override
    public void run(){
        for(int index=start;index<=end;index++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+index);

            try{
                // introduce some delay:
                Thread.sleep(1000);
            }
            catch(InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }
    
}
