package BackTracking;

public class NQueens {
    public static boolean itsafe(char chessBord[][],int row,int col) {
        // upeer
        for (int i = row-1; i >=0; i--) {
            if(chessBord[i][col]=='Q'){
                return false;
            }
            
        }
        // left digonal
        for (int i = row-1,j=col-1; i>=0 && j>=0; i--,j--) {
            if (chessBord[i][j]=='Q') {
                return false;
                
            }
            
        }
        // right digonal
        for (int i = row-1,j=col+1; i >=0 &&j<chessBord.length; i--,j++) {
            if (chessBord[i][j]=='Q') {
                return false;
                
            }
            
        }
        return true;

        
    }
    static int  count =0;
    public static boolean set(char chessBord[][],int row) {
        // base case
        if(row==chessBord.length){
            // print(chessBord);
            System.out.println("------------");
            count++;
            return true;
        }
        
            for (int j = 0; j < chessBord.length; j++) {
                
                if(itsafe(chessBord,row,j)){
                
                    chessBord[row][j]='Q';
                    if (set(chessBord, row+1)) {
                        return true;
                    }
                    
                    chessBord[row][j]='.';
                }
               
                
            }
            return false;
       
        
    }
    public static void print(char chessBord[][]) {
        for (int i = 0; i < chessBord.length; i++) {
            for (int j = 0; j < chessBord.length; j++) {
                System.out.print(chessBord[i][j]+" ");
                
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        int N=8;
        char chessBord [][]=new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                chessBord[i][j]='.';
                
            }
            
        }
        // set(chessBord, 0);
       if (set(chessBord, 0)) {
        System.out.println("soution is possible");
        print(chessBord);
        
       } else{
        System.out.println("soution is Not possible");
       }
        System.out.println("total number of way :"+count);

        
    }
    
}
