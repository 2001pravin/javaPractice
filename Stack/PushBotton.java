package Stack;

import java.util.Stack;

public class PushBotton {
     public static void bottom(Stack<Integer> s,int n) {
        if (s.isEmpty()) {
            s.push(n);
            return;
            
        }
       int top= s.pop();
       bottom(s, n);
       s.push(top);
     }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       bottom(s, 0);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
