package Stack;

import java.util.*;

public class reversString {
    public static String revers(String str) {
        Stack<Character> S=new Stack<>();
        int ind=0;
        while (ind<str.length()) {
            S.push(str.charAt(ind));
            ind++;
            
        }
        StringBuilder sb= new StringBuilder("");
        while (!S.isEmpty()) {
            char curr=S.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        String str1=revers(str);
        System.out.println(str1);
    }
    
}
