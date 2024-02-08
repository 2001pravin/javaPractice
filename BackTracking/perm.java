package BackTracking;

public class perm {
    public static void Back(String str,String ans ) {
        if (str.length()==0) {
            System.out.println(ans);
            return;
            
        }
        
        for (int j = 0; j < str.length(); j++) {
            char cr= str.charAt(j);
            String newStr=str.substring(0, j)+str.substring(j+1);
            Back(newStr, cr+ans);
            
        }
        
    }
    public static void main(String[] args) {
        Back("abc", "");
        
        
    }
    
}
