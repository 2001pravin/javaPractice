package BackTracking;

public class arr {
    public static void Track(int arr[],int i,int v) {
        // base case
        if (i==arr.length) {
            print(arr);
            return;
            
        }
        // recursion
        arr[i]=v;
        Track(arr, i+1, v+1);
        // backtracking
        arr[i]=arr[i]-2;
        
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();

        
    }
    public static void main(String[] args) {
        int arr [] =new int [5];
        Track(arr, 0, 1);
        print(arr);
        
    }
    
}
