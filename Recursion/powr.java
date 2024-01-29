package Recursion;

public class powr {
    public static int powers(int n,int x) {
        // O(n)
        if(x==0){    
            return 1;
         }
        // return n*powers(n,x-1);
        // optmise solution O(logn)
        int haf= powers(n, x/2);
        int hafpower=haf*haf;
        // ood 
        if(x%2 !=0){
            return n*hafpower;
        }
        return hafpower;
        
    }
    public static void main(String[] args) {
      
        System.out.println(powers(5, 2));
        
    }
    
}
