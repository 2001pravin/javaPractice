package Arrays2D;
 

public class Sprial {
    public static void printSpral(int[][] matrix){
       int strtRow=0;
       int srartCol=0;
       int endRow=matrix.length-1;
       int endCol=matrix[0].length-1;
       
       while(strtRow<=endRow && srartCol<=endCol){
        //top
        for (int i = srartCol; i <= endCol; i++) {
            System.out.print(matrix[strtRow][i]+"");
              }
        //Right
        for (int i = strtRow+1; i <= endRow; i++) {
            System.out.print(matrix[i][endCol]);
            
        }
        //bottom
        for (int i = endCol-1; i >=srartCol; i--) {
            System.out.print(matrix[endRow][i]);
            
        }
        //left
        for (int i = endRow-1; i >= strtRow+1; i--) {
            System.out.print(matrix[i][srartCol]);
            
        }
        srartCol++;
        strtRow++;
        endCol--;
        endRow--;
       }
    System.out.println();
       
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        printSpral(matrix);
                           
        
    }
    
}
