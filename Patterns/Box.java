package Patterns;

import java.util.Scanner;

public class Box {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N =");
       
        int n= sc.nextInt();
         System.out.print("Enter M =");
        int m = sc.nextInt();
         System.out.println("fullBpx");
        fullBpx(n,m);
        System.out.println("helloBox");
        helloBox(n,m);
        System.out.println("halfTrangle");
        halfTrangle(n);
        System.out.println("halfTrangleL");
        halfTrangleL(n);
        System.out.println("HaloohalfTrangle");
        HaloohalfTrangle(n);
        System.out.println("numberTrangel");
        numberTrangel(n);
        System.out.println("numberTrangelR");
        numberTrangelR(n);
       
        System.out.println("numberTrangelP");
        numberTrangelP(n,1);
        System.out.println("numberTrangelPJ");
        numberTrangelPJ(n,1);
        System.out.println("newPatterns");
        newPatterns(n);
        System.out.println("SolidRombauss");
        SolidRombauss(n);
        System.out.println("Praymid");
        Praymid(n);
        System.out.println("Praymid2");
        Praymid2(n);
        System.out.println("Praymid4");
        Praymid4(n);
       
        
}


  public  static void fullBpx(int n, int m){


// *****
// *****
// *****
// *****
// *****
    for(int i=1 ;i<=n;i++){
        for(int j=1; j<=m; j++){
            System.out.print("*");
        }
        System.out.println();
    }

  }

  public static void helloBox(int n , int m){
// *****
// *   *
// *   *
// *   *
// *****

    for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=m; j++){
            if(i==1||j==1||i==n||j==m){
                System.out.print("*");

            }else{
            System.out.print(" ");
            }
        }
        System.out.println();
    }

  }
   public static void halfTrangle(int n ){
// *
// **  
// ***  
// ****   
// *****
for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=i; j++){

            System.out.print("*");

        }
        System.out.println();
    }


   

  }
 public static void halfTrangleL(int n ){
// *****
// **** 
// *** 
// **  
// *5

    for(int i=n ; i>=1 ; i--){
        for(int j=1; j<=i; j++){
           
                System.out.print("*");
        }
        System.out.println();
    }

  }
    public static void HaloohalfTrangle(int n ){
// *
// **  
// ***  
// ****   
// *****
 for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=n-i; j++){
            
           
                System.out.print(" ");
        }
        for (int j = 1; j<=i; j++) {
             System.out.print("*");
            
        }
        System.out.println();
    }

    
  }
    public static void numberTrangel(int n ){
// 1
// 12  
// 123  
// 1234   
// 12345
 for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=i; j++){
            
             System.out.print(j+" ");
        }
        System.out.println();
    }

    
  }
   public static void numberTrangelR(int n ){
// 1
// 12  
// 123  
// 1234   
// 12345
 for(int i=n ; i>=1 ; i--){
        for(int j=1; j<=i; j++){
            
             System.out.print(j+" ");
        }
        System.out.println();
    }

    
  }
   public static void numberTrangelP(int n ,int number ){
// 1
// 12  
// 123  
// 1234   
// 12345
 for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=i; j++){
            
            
             System.out.print(number+" ");
             number++;
        }
        System.out.println();
    }
   }
  public static void numberTrangelPJ(int n ,int number ){
// 1
// 12  
// 123  
// 1234   
// 12345
 for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=i; j++){
            
            number=i+j;
            if(number%2==0){
             System.out.print("1");
            }else{
                System.out.print("0");
            }
             
             
        }
        System.out.println();
    }
   }


 public static void newPatterns(int n ){
// 1
// 12  
// 123  
// 1234   
// 12345
 for(int i=1 ; i<=n ; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");

          
           }
           int  spces=2*(n-i);
           for(int j=1; j<=spces; j++){
                  System.out.print(" ");
                 
          
           }
           for(int j = 1; j<=i; j++){
            System.out.print("*");

           }
             
              System.out.println();
        }
        

      
    for(int i=n ; i>=1 ; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");

          
           }
           int  spces=2*(n-i);
           for(int j=1; j<=spces; j++){
                  System.out.print(" ");
                 
          
           }
           for(int j=1; j<=i; j++){
            System.out.print("*");

           }
             
               System.out.println();
        }
       
 }


 public static void SolidRombauss(int n ){
    for (int i = 1; i <=n; i++) {
        int space=n-i; 
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }
        for (int j = 1; j <=n; j++) {
            System.out.print("*");
            
        }
         System.out.println();

    }
   
 }



 public static void Praymid( int n){
    for (int i=1; i<=n; i++){
        for (int j = 1; j<=n-i; j++) {
            System.out.print(" ");
            
        }
        for (int j = 1; j<=i; j++) {
            System.out.print(i + " ");
            
        }
        System.out.println();
    }

    

 }
 public static void Praymid2( int n){
    for (int i=1; i<=n; i++){
        for (int j = 1; j<=n-i; j++) {
            System.out.print(" ");
            
        }
        for (int j =i; j>=1; j--) {
            System.out.print(j);
            
        }
        for (int j =2; j<=i; j++) {
            System.out.print(j);
            
        }
        System.out.println();
    }

    

 }

 public static void Praymid4(int n){
    for (int i = 1; i <=n; i++) {
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for (int j = 1; j<=2*i-1; j++) {
        System.out.print("*");
        
      }
      System.out.println();
        
    }
    for (int i = n; i >=1; i--) {
        for(int j=1; j<=n-i; j++){
          System.out.print(" ");
        }
        for (int j = 1; j<=2*i-1; j++) {
          System.out.print("*");
          
        }
        System.out.println();
          
      }
 }

}

 

 