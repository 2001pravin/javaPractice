package Recursion;

public class numberToString {
    public static void convert(int number) {
        String [] str ={"zero","one","two","three","four","five","six","seven","eight","nine"};
       if(number==0){
        return;

       }
        int i=number%10;
        convert(number/10);
         System.out.print(str[i]+" ");
        
        
        
    }
    public static void main(String[] args) {
        convert(1034);
        System.out.println();
        
    }
}
