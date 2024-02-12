package ArrayList;

import java.util.ArrayList;

public class targetSum {
    public static boolean sum(ArrayList<Integer>list,int target) {
        // int sum=0;
        // for (int i = 0; i <list.size()-1 ; i++) {
        //     for (int j = i+1; j < list.size()-1; j++) {
        //         sum=list.get(i)+list.get(j);
        //         if (target==sum) {
        //            return true;
                    
        //         }
                
                   
                
               
                
                
        //     }
            
        // }
        // return false;
       int st=0;
       int end=list.size()-1;
       while (st<end) {
        if (list.get(st)+list.get(end)==target) {
            return true;
        }
        
        if (list.get(st)+list.get(end)<target) {
            st++;
        }else{
            end--;
        }
        
       }
       return false;
       
    
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
       System.out.println( sum(list, 70));
    }
    
    
}
