package mulitiTharding;
// class MyThred extends Thread{
//     public void run(){
//         System.out.println("Thred is runing");
//     }

// }

public class CreateThredExample {
    public static Object SharedObject=new Object();
   
    public static void main(String[] args) {
        System.out.println("hello world");
       
        // MyThred objThread =new MyThred();
        // objThread.start();
// using Thread class it is internaly implment Runnbeka interface
        // Thread objThread2=new Thread(()->{
        //     System.out.println("Thread 2 is is running");
        // });
        // objThread2.start();
// using Runnable interface

      Runnable objRunnable1= new Runnable(){
        public void run(){
            System.out.println("Thread 3 is running");
        }

            };
            Thread objThread3= new Thread(objRunnable1,"Runnble Thread");
            objThread3.start();

    Runnable objRunnable = ()->{
       System.out.println("Thread 4 strted");
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getState());
       System.out.println(SharedObject.hashCode());
       try {
        Thread.sleep(3000);

    } catch (InterruptedException e){
        
        e.printStackTrace();
    }
    System.out.println("Thred 4 is end ");
    } ;

    Runnable objRunnable2= ()->{
        System.out.println("Thread 5 strted");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        System.out.println(SharedObject.hashCode());

        try {
         Thread.sleep(3000);
 
     } catch (InterruptedException e){
         
         e.printStackTrace();
     }
     System.out.println("Thred 5 is end ");
     } ;


    Thread objThread4= new Thread(objRunnable,"Runnble Thread");
    // objThread4.setDaemon(true);         
    objThread4.start();
    Thread objThread6= new Thread(objRunnable2,"Runnble Thread");
    // objThread4.setDaemon(true);         
    objThread6.start();
       System.out.println("Java is progrem");
    }
    
}
