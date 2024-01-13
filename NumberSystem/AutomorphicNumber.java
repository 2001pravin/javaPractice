import java.util.Scanner;

class  AutomorphicNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num:");
        int r= in.nextInt();

       
        int calcu,p,num;
        AutomorphicNumber(0,0,r,r);
         
    }
    public static void AutomorphicNumber(int calcu,int p,int num,int r){

        if(num>0){
           p = num%10;
           calcu=(p*p);
        }

        if(calcu==r){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Number is Not Automorphic Number");
        }

    }
}