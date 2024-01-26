package String;



public class LargestNumber {
    public static void Compar(String []str){
        String largest = str[0];
        for(int i=0;i<=str.length-1;i++){
           
            if(largest.compareTo(str[i])<0){
              System.out.println(largest=str[i]);  

            }
        }
    }
    public static void main(String[] args) {
        String [] arr={"apple","mango","bannana"};
       Compar(arr);
        
    }
    
}
