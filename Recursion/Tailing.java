package Recursion;

public class Tailing {
      public static int wayTails(int n) {
        // base case
        if (n==0||n==1) {
            return 1;
            
        }
        // kam
        // vartical
        int fnm= wayTails(n-1);
        // horizntal
        int fnmh= wayTails(n-2);
        return fnm+fnmh;
        
      }
       public static void main(String[] args) {
        
         System.out.println(wayTails(4));
       }
    
}
