package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
public static void main(String[] args) {
    List ls =new ArrayList();

    ls.add(1);
    ls.add(5);
    ls.add(8);
    ls.add(12);
    ls.add(14);


System.out.println(ls);

Iterator itr =ls.iterator();

while (itr.hasNext()) {
    System.out.println(itr.next());
    
}

}    


}
