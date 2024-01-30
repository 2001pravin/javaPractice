package Recursion;

public class indais {
    public static void ind(int n, int [] arr, int key) {
        if(arr[n]==arr.length-1){
            return ;
        }
        
        if(arr[n]==key){
           System.out.print(n+" ");

        }
          ind(n+1, arr, key);
        
    }
    public static void main(String[] args) {
        int[] arr ={10,20,2,12,2,4,2,2,8};
        int key=2;
       ind(0, arr, key);
       System.out.println();
        
    }
    
}
