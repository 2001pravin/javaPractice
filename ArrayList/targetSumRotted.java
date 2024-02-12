package ArrayList;

import java.util.ArrayList;

public class targetSumRotted {
    public static boolean sum(ArrayList<Integer>list , int target) {
        int bp=-1;
        int n= list.size();
        for (int index = 0; index < list.size(); index++) {
             if (list.get(index)>list.get(index+1)) {
                bp=index;
                break;
                
             }
            
        }
        int st=bp+1;
        int en=bp;
        while (st!=bp) {
            if (list.get(en)+list.get(st)==target) {
                return true;
            }
            if (list.get(en)+list.get(st)<target) {
                st=(st+1)%n;
            }else{
                st=(n+st-1)%n;
            }
            
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
       System.out.println( sum(list, 25));
        
    }
    
}
