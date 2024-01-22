package Arrays;
public class subArrays {
public static void sub(int arr[]){
    int ts=0;
    int sum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
     int Start=i;
        for (int j = i; j < arr.length; j++) {
           int End= j;
           sum=0;
            for (int j2 = Start;  j2<= End; j2++) {
                
                sum+=arr[j2];
                System.out.print(arr[j]+" ");
              
                
               
            }
            if (maxSum<sum) {
                maxSum=sum;
               
                
            }
           System.out.println();
               
            System.out.print("the sum "+sum);
            
           
            ts++;
            System.out.println();
        }
       
        System.out.println();
    }
    System.out.println("total sub Array:"+ts);
    System.out.println("max Sum: "+maxSum);


}

public static void kadanes(int arr[]){
int ms= Integer.MIN_VALUE;
int cs=0;
for (int index = 0; index < arr.length; index++) {
    cs= cs+ arr[index];
    if (cs<0) {
        cs=0;
    }
    ms=Math.max(cs, ms);
    
}
System.out.println("the max value:"+ ms);
}



    public static void main(String[] args) {
        int arr[]={10,20,30,45,60};
        // sub(arr);
        kadanes(arr);
        
    }
}
