package Recursion;

public class removeDuplicatString {
    public static void remove(String str,StringBuilder sb,boolean map[],int idx) {

        // base case
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        // kaam
        char current=str.charAt(idx);
        if(map[current-'a']==true){
            remove(str, sb, map, idx+1);

        }else{
            map[current-'a']= true;
            remove(str, sb.append(current), map, idx+1);
        }
        
    }
    public static void main(String[] args) {
        String str= "appnnacollge";
        remove(str,new StringBuilder(""),new boolean[26], 0);
        
    }
}
