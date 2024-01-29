package Recursion;

public class fabunachi {
    public static int  fibu(int n) {
        if(n==0||n==1){
            return n ;
        }
        
        int fnm1= fibu(n-1);
        int fnm2= fibu(n-2);
        int fn = fnm1+fnm2;
        return fn;
        
    }
 public static void main(String[] args) {
    int n=5;
    System.out.println(fibu(n));
 }   
}
