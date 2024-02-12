package ArrayList;

import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        int temp = list.get(2);
        list.set(2, list.get(4));
        list.set(4,temp);
        System.out.println(list);
    }
   
 
    
}
