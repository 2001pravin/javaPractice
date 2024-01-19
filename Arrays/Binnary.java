package Arrays;

public class Binnary {
  public static int BinnarySurch(int []num){
    int j= 100;
    int strt=0; int end=num.length-1;
   while (strt<=end) {
      int mid= (strt+end)/2;
      if(num[mid]==j){
        return mid;
      }
      if(num[mid]<j){
        strt=mid+1;
      }else{
        end=mid-1;
      }
    
   }
return -1;

  }

    public static void main(String[] args) {
        int [] num ={10,50,60,80,90};
      System.out.println(BinnarySurch(num));  
    
    }
}
