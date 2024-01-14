
package String;
import  java.util.Scanner;

public class revs {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name:");
        String str=sc.nextLine();
        String rev="";

       for (int i = str.length()-1; i>=0; i--) {

        rev=rev+str.charAt(i);

          

        
       }
       if(rev.equals(str)){
         System.out.println("Pallmtron String");
       }else{
        System.out.println("Not Pallmtron String");

       }
       System.out.println(rev);

    }
    
}
