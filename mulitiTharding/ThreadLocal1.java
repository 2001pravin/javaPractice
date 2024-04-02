package mulitiTharding;

import ArrayList.targetSum;

public class ThreadLocal1 {
public static void main(String[] args) {
    ThreadLocal<Long> myThread=new ThreadLocal();

    Long userid=1523L;
    Long userid2=24265L;

    Thread myThread1= new Thread(()->{
        System.out.println("started thread for "+ userid);
        myThread.set(userid);
        System.out.println("complete logic for "+ myThread.get());
       myThread.remove();
       System.out.println("Removed "+ myThread.get());


    });

    Thread myThread2=new Thread(()->{
        System.out.println("Started thread for"+userid2);
        myThread.set(userid2);
        System.out.println("complete logic for"+myThread.get());
        myThread.remove();
        System.out.println("Removed "+myThread.get());
    });

    myThread1.start();
    myThread2.start();

    InheritableThreadLocal<String> InheritableThreadLocal=new InheritableThreadLocal<>();
  InheritableThreadLocal.set("Instagram");
  Thread obThread= new Thread(()->{
    System.out.println(InheritableThreadLocal.get());
  });
     obThread.start();
}
    
}
