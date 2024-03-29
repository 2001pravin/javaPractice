package ArrayList;

import java.util.ArrayList;

public class maxWater {
    public static int max(ArrayList<Integer> list) {
        int maxWater=0;
        // for (int i = 0; i < list.size(); i++) {
        //     for (int j = i+1; j< list.size(); j++) {
        //         int hight=Math.min(list.get(i), list.get(j));
        //         int widht=j-i;
        //         int currWater=hight*widht;
        //         maxWater=Math.max(maxWater, currWater);
                
        //     }
        // }
        // return maxWater;
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int hight=Math.min(list.get(lp), list.get(rp));
            int widht=rp-lp;
            int currWater=hight*widht;
            maxWater=Math.max(maxWater, currWater);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{ rp--;}
           
        }
        return maxWater;
    }
 public static void main(String[] args) {
    ArrayList<Integer>list= new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    System.out.println(max(list));
 }
    
}
