package String;

public class paldroum {
    public static boolean Pal(String str){
        int n= str.length();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str="pravin";
        System.out.println(Pal(str));
        
    }
}
