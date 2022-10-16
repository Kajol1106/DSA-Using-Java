import java.util.*;

public class EvenSumInRows {
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
        evenSumRows(0, n, m, mat);
    }
    
    public static void evenSumRows(int index, int n, int m, int[][] mat) {
        if(index == n) {
            return ;
        }
        int sum = 0;
        for(int i=0; i<m; i++) {
            if(mat[index][i]%2 == 0) {
                sum += mat[index][i];
            }
        }
        System.out.println(sum);
        evenSumRows(index+1, n, m, mat);
    }
}
