package Recursion;

public class BinneryString {
    public static void string(int n ,int lastplace, String str) {
        if(n == 0){
            System.out.println(str);
            return;
        }
       string(n-1, 0,str+"0");
       if(lastplace == 0){
        string(n-1, 1, str+"1");
       }
        
    }
    public static void main(String[] args) {
        string(4, 0 ,"");
    }
    
}
