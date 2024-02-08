package BackTracking;

public class subSet {
    public static void Back(String str,int i,String ans) {
        // base case
        if (i==str.length()) {
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
            
        }

        // recursion
        Back(str, i+1, ans+str.charAt(i));


        // backtraking
        Back(str, i+1, ans);
        
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans="";
        Back(str, 0,ans);
        
        
    }
    
}
