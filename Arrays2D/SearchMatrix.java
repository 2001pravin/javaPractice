package Arrays2D;

public class SearchMatrix {
    public static boolean StaircaseSearch(int matrix[][], int key) {
        // int row = 0, col = matrix[0].length-1;
        // while (row < matrix.length && col >= 0) {
        //     if (matrix[row][col] == key) {
        //         System.out.println("key is fount (" + row + "," + col + ")");
        //         return true;
        //     } else if (key < matrix[row][col]) {
        //         col--;

        //     } else {
        //         row++;
        //     }

        // }
        // System.out.println("key is not found");
        // return false;
        int row = matrix.length-1, col = 0;
        while (row >=0  && col <matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("key is fount (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;

            } else {
                row++;
            }

        }
        System.out.println("key is not found");
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }, };
        int key = 29;
        StaircaseSearch(matrix, key);
    }

}
