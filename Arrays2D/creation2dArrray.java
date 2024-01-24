package Arrays2D;
import java.util.Scanner;
public class creation2dArrray {

     public static void Surch(int [][] arr,int num,int m,int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==num){
                    System.out.println("The number is presnt:"+num);
        
                   }
                    
                 }
            }

           
        }
       

    public static void main(String[] args) {
      

        int [][] arr=new int[3][4] ;
        int m=arr.length, n=arr[0].length;
        int num=7;
        
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
                
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        Surch(arr,num,m,n);
    }

   
    
}
