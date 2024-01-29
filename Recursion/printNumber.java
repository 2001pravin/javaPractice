package Recursion;

import String.revs;

public class printNumber {
    public static void number(int n){
        if(n==1){
           System.out.print(n);
           return;
        }
        System.out.print(n+" ");
        number(n-1);
    }
    public static void inPrint(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }

        inPrint(n-1);
        System.out.println(n+" ");
        
    }
   public static void main(String[] args) {
    int n=10;
    // number(n);
    inPrint(n);
   } 
}
