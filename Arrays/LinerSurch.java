package Arrays;

public class LinerSurch {
    // public static int LinerS(int arr[], int j) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == j) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
   
    public static int L(int arr[]){
        int k =Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(k<arr[i]){
            k=arr[i];
            }
        }
        return k;
}



    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 80, 90, 100 };
        // int j = 500;
       
        // int index = LinerS(arr, j);
        // if (index == -1) {
        //     System.out.println("Number is not prsent");
        // }
        // System.out.println("the number is present");
      int y=L(arr);
        System.out.println(y);

    }

}