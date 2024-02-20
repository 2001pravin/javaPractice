package String;

public class hh {
    public static String hhii(String str ) {
        if ((str==null)||(str.length()<= 1)) {
            System.out.println(str);
        }else{

        //     System.out.print((str.charAt(str.length()-1)));
        //   hhii(str.substring(0, str.length()-1));
        return hhii(str.substring(1)+str.charAt(0));
        }
        
        
    
        
    }
    public static void main(String[] args) {
        String str="pravin patil";
       String str1=hh
    }
    
}
