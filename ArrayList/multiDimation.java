package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class multiDimation {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(12);
        mainlist.add(list);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(52);
        list2.add(14);
        list2.add(12);
        mainlist.add(list2);
        Collections.sort(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer>curr= mainlist.get(i);
            for (int j = 0; j <curr.size(); j++) {
                System.out.print(curr.get(j)+" ");
                
            }
            System.out.println();
            
        }
        System.out.println(mainlist);
    }
    
}
