package Arrays;

import String.revs;

public class Revarse {
    public static void num(int []number){
        int strt=0, end=number.length-1;
        while (strt<end) {
            int temp=number[end];
            number[end]=number[strt];
            number[strt]=temp;
              strt++;
             end--;
            
        }
        


    }
    public static void main(String[] args) {
        int[] number={12,15,21,68,84};
      num(number);
      for (int i = 0; i < number.length; i++) {
        System.out.println(number[i]);
      }

        
    }
    
}
