import java.util.Scanner;

public class ArmstrongNumber{

    public static void main (String[] args){
        Scanner R = new Scanner (System.in);
        System.out.println("Enter Number:");
        int calu ,r,j,num;
      j = R.nextInt();
       num= j;
       calcuArmstrongNumber(0, num, 0, j);
        
    }

    private static void calcuArmstrongNumber(int calu, int num, int r, int j) {
         while (num>0) {
         r =  num % 10;
         calu = calu+(r * r * r);
        num = num /10;
       }
      
            

       if(j == calu){
            System.out.println("Arstrong Number");
        }else{
             System.out.println("Number is Not Arstrong Number");
        }
    }

    

}