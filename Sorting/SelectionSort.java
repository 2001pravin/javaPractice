package Sorting;

public class SelectionSort {
    public static void sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int smallste=i;
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[smallste]>arr[j]){
                    smallste=j;
                }
            }
              int temp=arr[smallste];
              arr[smallste]=arr[i];
              arr[i]=temp;
        }
    }
    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr={5,6,1,2,3};
        sort(arr);
        print(arr);

    }
}
