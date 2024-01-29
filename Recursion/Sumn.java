package Recursion;

public class Sumn {
    public static int sum(int n) {
       if (n==1){
        return 1;
       }
        int fn=sum(n-1);
        int fns= n+fn;
        return fns;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
        
    }
    
}
