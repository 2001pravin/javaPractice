import java.util.Scanner;

/**
 * BuzzNumber Que A number is said to be Buzz Number if it ends with 7 or is divisible by 7. Example: 1007 is a Buzz Number.
 */
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int r, num ,p;
       num =sc.nextInt();
       r=num;
        BuzzNumber(r, num, 0);

    }
public static void BuzzNumber(int r, int num,int p) {


     p =num%10;


    if(r%10==p&&r%p==0){
        System.out.println("Buzz Number");
    }else{
         System.out.println(" Not Buzz Number");
    }



    
}
    
}

