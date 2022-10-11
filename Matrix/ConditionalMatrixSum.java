import java.util.*;

class ConditionalMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        conditionalMatrixSum(row, col, mat);
    }
    
    public static void conditionalMatrixSum(int n, int m, int[][] mat) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(mat[i][j]%3 == 0) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}