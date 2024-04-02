package mulitiTharding;

 class SharedResources {
private volatile boolean flag=false;

public  synchronized void setFlag(boolean flag){this.flag=flag;}
public  synchronized boolean getFlag(){return flag;}
    
}
public class VoltileKeyWord {
    public static void main(String[] args) throws Exception {
        SharedResources shr=new SharedResources();

         new Thread(()->{
          System.out.println("Thred 1 Sterted");
          try {
            System.out.println("Thred 1 logic Sterted");
            Thread.sleep(1000);
            shr.setFlag(true);
            System.out.println("Flag set by THread 1");
            Thread.sleep(1000);
          } catch (Exception e) {
            e.printStackTrace();
          }
         }).start();


         new Thread(()->{
            System.out.println("Thred 2 started");
            while ((!shr.getFlag())) {

                
            }
            System.out.println("Thread 2 logic completed");
         }
         ).start();
   }

    
}
