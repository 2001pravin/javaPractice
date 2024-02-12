package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(21);
        list.add(8);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
