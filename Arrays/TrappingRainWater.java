package Arrays;

public class TrappingRainWater {

    public static int TrappWater(int []arr){
        int n= arr.length;
        //left max bondary
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]= Math.max(arr[i], leftMax[i-1]);
        }
         //right max bondary
          int RightMax[]=new int[n];
          RightMax[n-1]=arr[n-1];
          for(int i=n-2; i>=0;i--){
            RightMax[i]=Math.max(arr[i], RightMax[i+1]); 
          }
         int TrapWater=0;
          for (int i = 0; i < n; i++) {
           int waterLevel= Math.min(leftMax[i], RightMax[i]);
            TrapWater=TrapWater+waterLevel-arr[i];
            
          }
          return TrapWater;
    }
    public static void main(String[] args) {
        int [] arr={4,2,0,6,3,2,5};
     System.out.println(TrappWater(arr));

    }
    
}
