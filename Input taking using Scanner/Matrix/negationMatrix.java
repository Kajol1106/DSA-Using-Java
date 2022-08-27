import java.util.*;

class NegationMatrix {
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
        negationMatrix(row, col, mat);
    }
    
    static void negationMatrix(int n, int m, int[][] mat) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                //System.out.print(mat[i][j]+" ");
                sum += mat[i][j];
            }
            //System.out.println();
        }
        //System.out.println(sum);
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(sum-mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}