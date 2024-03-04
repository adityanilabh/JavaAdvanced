package Multithreading.CodingProblems.StringThread;

public class Main {
    private static StringBuffer stringBuffer = new StringBuffer();
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        // Create two threads to modify the string buffers concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("A");
                stringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("B");
                stringBuilder.append("B");
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the lengths of the string buffers
        System.out.println("StringBuffer length: " + stringBuffer.length());
        System.out.println("StringBuilder length: " + stringBuilder.length());
    }
}

