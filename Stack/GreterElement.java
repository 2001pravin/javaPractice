package Stack;

import java.util.Stack;

public class GreterElement {
    public static void main(String[] args) {
        int arr[]={7,6,8,5,1,2};
        Stack<Integer> S=new Stack<>();
        int greter[]=new int[arr.length];
        for (int i = arr.length-1;  i>=0; i--) {
            while (!S.isEmpty()&& arr[S.peek()]<=arr[i]) {
                 S.pop();
            }
            if (S.isEmpty()) {
                greter[i]=-1;
                
            }else{
                greter[i]=arr[S.peek()];

            }
            S.push(i);
            
        }
        for (int i = 0; i < greter.length; i++) {
            System.out.print(greter[i]+" ");
        }
        System.out.println();
    }
    // geterlelment in right
    // geterlelment in left
    // small Lelemt in right
    // small lement in right
     
}
