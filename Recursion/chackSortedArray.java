package Recursion;

/**
 * chackSortedArray
 */
public class chackSortedArray {
    public static boolean isSorted(int [] n,int a) {
        if (a== n.length-1) {
            return true;
        }
       if (n[a]<n[a+1]) {
        return false;
        
       } 

       return isSorted(n, a+1);
        
    }

    public static void main(String[] args) {
        int [] n={10,20,30,40,50,60};
        System.out.println(isSorted(n, 5));

    }
    
}