package Recursion;

public class paringProblem {
    public static int pair(int n) {
   if(n==1||n==2){
      return n;
   }
    int fnm=pair(n-1);
    int fnm2 = (n-1)*pair(n-2);
    return fnm+fnm2;
        
    }
    public static void main(String[] args) {
        int n=4;
         System.out.println(pair(n));
        
    }
    
}
