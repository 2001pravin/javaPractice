package HashMap;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
     HashMap<String,Integer> hm=new java.util.HashMap<>();
     hm.put("India",100);
     hm.put("China", 150);
     hm.put("Us", 50);
    //  Size-O(1)
    System.out.println(hm.size());
     System.out.println(hm);
    
    //  GET-0(1);
     int populiton=hm.get("Us");
     System.out.println(populiton);
     System.out.println(hm.get("pravin"));

    //  ContainsKey- 0(1);
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Goa"));

    // remove - 0(1)
    System.out.println(hm.remove("China"));
    System.out.println(hm.remove("Jk"));
    System.out.println(hm);
// itrete in HashMap 0(1)
   Set<String> keys=hm.keySet();
   System.out.println(keys);
    for (String k : keys) {
        System.out.println("key="+k+",value="+hm.get(k));
        
    }
   System.out.println(hm.entrySet()); 
    }
    
    }
    

