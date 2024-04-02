package HashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
    LinkedHashMap<String,Integer> ls=new LinkedHashMap<>();
    ls.put("Pravin",1);
    ls.put("Jay", 3);
    ls.put("Rohit", 18);
    ls.put("sanket", 5);
    ls.putIfAbsent("pop", 45);
    ls.putIfAbsent("sanket", 4255);
    System.out.println(ls);
    System.out.println("=== Iterating over a LinkedHashMap using Java 8 forEach and lambda ===");

    ls.forEach((Name,phone)->{
        System.out.println(Name+" "+phone);
    });

    System.out.println("\n=== Iterating over the LinkedHashMap's entrySet using Java 8 forEach and lambda ===");

    ls.entrySet().forEach(entry->{
        System.out.println(entry.getKey()+"=>"+entry.getValue());
    });

    System.out.println("\n=== Iterating over the entrySet of a LinkedHashMap using iterator() ===");

     
     Iterator<Map.Entry<String, Integer>> lsi = ls.entrySet().iterator();
     while (lsi.hasNext()) {
      Map.Entry<String,Integer> entry=lsi.next();
      System.out.println(entry.getKey()+"=>"+entry.getValue());
        
     }
     System.out.println("\n=== Iterating over the entrySet of a LinkedHashMap using iterator() and forEachRemaining ===");
        lsi=ls.entrySet().iterator();
        lsi.forEachRemaining(entry->{
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        });
    
    }
    
}
