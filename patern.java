public class patern {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
           
               int space=2*(5-i);
               if (space==0) {
                System.out.print("#");
            }
               for(int j=1; j<=space; j++){
               
                System.out.print(" ");    
           
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");

           }
           System.out.println();
    }
    
}
}

       