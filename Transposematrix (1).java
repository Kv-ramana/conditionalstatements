import java.util.Scanner;
public class Transposematrix {
    public static void main(String args[]) {
        int rows,cols;
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the rows");
        rows=scanner.nextInt();
        System.out.println("enter the cols");
        cols=scanner.nextInt();
        int matrix[][]=new int [rows][cols];
        System.out.println("enter the matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
    }
}
int transpose[][]=new int [cols][rows];
for(int i=0;i<rows;i++) {
    for(int j=0;j<cols;j++) {
        transpose[j][i] = matrix[i][j];
    }
}
  System.out.println("Original Matrix:");
        displayMatrix(matrix);
        System.out.println("Transpose Matrix:");
        displayMatrix(transpose);
}
 public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
}
}
}