package mulitiTharding;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * SheredCounter
 */

class SheredCounter {
 private AtomicInteger count = new AtomicInteger();
// private int count;

public void increment(){count.incrementAndGet();}

public int getCount(){return count.get();}
    
}

public class Atomic {
    public static void main(String[] args) {
        
  
    SheredCounter sheredCounter=new SheredCounter();
    new Thread(() -> {
        System.out.println("Thread 1 started");
        for (int i = 0; i <50000; i++) {
            sheredCounter.increment();
        }
        System.out.println("Thread 1 completed");
    }).start();

    new Thread(() -> {
        System.out.println("Thread 2 started");
        for (int i = 0; i <50000; i++) {
            sheredCounter.increment();
        }
        System.out.println("Thread 2 completed");
        System.out.println(sheredCounter.getCount());

    }).start();
}
}
