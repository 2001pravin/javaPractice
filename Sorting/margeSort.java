package Sorting;

public class margeSort {
    public static void print(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void margeS(int []arr,int si,int ei) {
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        margeS(arr, si, mid);
        margeS(arr, mid+1, ei);
        marge(arr, si,mid, ei);

        
    }
    public static void marge(int []arr,int si,int mid,int ei) {
        int [] temp= new int[ei-si+1];
      int i= si;  //itereter left
        int j= mid+1;//iteretr right part
        int k=0;//iterter of array
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; 
            }else{
                temp[k]=arr[j];
                j++; 
            }
            k++;
            
        }
        while (i<=mid) {
            temp[k++]= arr[i++];

            
        }
        while (j<=ei) {
            temp[k++]= arr[j++];
            
        }
    // copy of temp arrary
     for ( k=0, i=si; k<temp.length; k++,i++) {
        arr[i]=temp[k];
        
     }
        
    }
    public static void main(String[] args) {
        int [] arr={6,3,9,5,2,8};
        int n= arr.length-1;
       margeS(arr, 0, n);
        print(arr);
    }
    
}
