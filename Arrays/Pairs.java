package Arrays;

public class Pairs {
    public static void pair( int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+")");

                
            }
            System.out.println();
        }
       
        
    }
    public static void main(String[] args) {
        int arr []={10,20,30,43,15,65};

        pair(arr);

    }
}
