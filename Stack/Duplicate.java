package Stack;

import java.util.Stack;

public class Duplicate {
      public static boolean isduplcate(String str){
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            // closing
            if (ch == ')') {
                int count =0;
                while (s.pop()!='(') {
                    count++;
                }
                if(count<1){
                    return true;
                }
            }else{
                // opning
                s.push(ch);
            }
        }
            return false;
      } 
      public static void main(String[] args) {
        
        String str1="((a+b))";
        System.out.println(isduplcate(str1));
}
}
