package String;

public class SortestPath {
    public static float ShortestPathFind(String str){
        int x=0,y=0;
       
       for (int i = 0; i < str.length(); i++) {
        char Div=str.charAt(i);
        if(Div=='N'){
            y++;

        }else if(Div=='S'){
            y--;

        }else if(Div=='W'){
            x--;

        }else{
            x++;
        }
        
       }
       int x2=x*x;
       int y2=y*y;
       return  (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="EWSEWWNSNW";
        System.out.println(ShortestPathFind(str));
        
    }
    
}
