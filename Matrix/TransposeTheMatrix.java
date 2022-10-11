import java.util.*;

public class TransposeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        transposeTheMatrix(n, m, mat);
    }
    
    public static void transposeTheMatrix(int n, int m, int[][] mat) {
        
        int[][] transpose = new int[m][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                transpose[j][i] = mat[i][j];
            }
            //System.out.println();
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
