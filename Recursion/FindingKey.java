package Recursion;

public class FindingKey {
    public static int findKey(int []arr,int key,int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return findKey(arr, key, i+1);

        
    }
    public static int findKey2(int []arr,int key,int i) {
        if (i== arr.length) {
            return-1;
            
        }
        int isfound= findKey(arr, key, i+1);
        if(isfound!= -1){
            return isfound;
        }
        if(arr[i]== key){
            return i;
        }
        return isfound;

    }
    public static void main(String[] args) {
        int [] arr ={1,5,10,10};
        int key=10;
        int i=2;
        System.out.println(findKey(arr, key, i));
        System.out.println(findKey2(arr, key, i));
        
    }
    
}
