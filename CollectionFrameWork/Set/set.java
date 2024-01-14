package CollectionFrameWork.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {

    public static void main(String[] args) {
        Set l= new HashSet<>();

        l.add(l);
        l.add(15);
        l.add(null);
        l.add(45);
        l.add(45);

        System.out.println(l);

        Iterator itr=l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
    
}
