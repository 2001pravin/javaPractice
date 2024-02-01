package Sorting;

public class RotatedSortedArray {
    public static int sort(int []arr,int si,int ei,int tar) {
        if (si>ei) {
            return -1;
            
        }
        int mid = si+(ei-si)/2;
        if (arr[mid]==tar) {
            return mid;
            
        }
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=tar && tar<=arr[mid]) {
                return sort(arr, si, mid-1, tar);

                
            }else{
              return sort(arr, mid+1, ei, tar);
            }
            
        }else{
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return sort(arr, mid+1, ei, tar);
                
            }else{
                return sort(arr, si, mid-1, tar);
            }
        }
        
    }
   
    public static void main(String[] args) {
        int []arr={10,20,30,40,80,0,100};
      int sor=  sort(arr, 0, arr.length-1, 0);
        System.out.println(sor);
       
        
        
    }
    
}
