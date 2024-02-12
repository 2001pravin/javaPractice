package ArrayList;

import java.util.ArrayList;

public class lonely {
    public static void lonly(ArrayList<Integer>list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int number=list.get(i);
                int number2=list.get(j);
                
                    if (number+1==number2||number-1==number2) {
                        list.remove(i);
                          list.remove(j); 
                        }
                   
                }
               
               }
            
                
            }


        
    
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        
        lonly(list);
      System.out.println(list);
    }
    
}
