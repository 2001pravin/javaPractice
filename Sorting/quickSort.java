package Sorting;

/**
 * quickSort
 */
public class quickSort {
    public static void print(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
   public static void sort(int arr[], int si, int ei) {
    if (si>=ei) {
        return;
         }
         int prot= ports(arr, si,ei);
         sort(arr, si, prot-1);//left part
         sort(arr, prot+1, ei);//right part
    
   }
   public static int ports(int []arr, int si ,int ei) {
    int povet= arr[ei];
    int i=si-1;
    for (int j = si; j < ei; j++) {
        if (arr[j]<=povet) {
            i++;
            int temp= arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            
        }
        
    }
    i++;
    int temp= povet;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
    
   }
    public static void main(String[] args) {
        int [] arr = {6,3,9,8,2,5};
        sort(arr, 0, arr.length-1);
        print(arr);
    }
}