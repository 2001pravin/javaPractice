package BItManuplcation;

public class EvenOdd {
    public static void evenOdd(int n) {
        int bitmask=1;
        if((n&bitmask)==0){
            //even number
            System.out.println("the number is even: "+n);

        }else{
        System.out.println("the number is ood: "+n);
        }
    }
    public static void main(String[] args) {
        evenOdd(2);
        
    }
    
}
