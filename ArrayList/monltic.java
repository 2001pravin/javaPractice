package ArrayList;

import java.util.ArrayList;

public class monltic {
    public static boolean nums(ArrayList<Integer>list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                 if (list.get(i)==list.get(j)) {
                    return true;
                    
                 }
                
            }
            
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
       System.out.println(nums(list)); 
    }
    
}
