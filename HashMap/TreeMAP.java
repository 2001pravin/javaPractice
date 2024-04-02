package HashMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;


public class TreeMAP {
    public static void main(String[] args) {
      
       SortedMap<String, String> T  = new TreeMap<>(new Comparator<String>() {
        public int compare(String s1, String s2){
            return s2.compareTo(s1);
            
        }
       });
       T.put("Pravin", "Patil");
       T.put("Sanket", "Patil");
       T.put("Rohit", "Patil");
       System.out.println(T);
      
  }
       

    }

    

