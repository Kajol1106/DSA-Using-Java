import java.util.*;

class MatrixCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] mat1 = new int[n1][m1];
        for(int i=0; i<n1; i++) {
            for(int j=0; j<m1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] mat2 = new int[n2][m2];
        for(int i=0; i<n2; i++) {
            for(int j=0; j<m2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        matrixCompetiton(n1, m1, mat1, n2, m2, mat2);
    }
    
    public static void matrixCompetiton(int n1, int m1, int[][] mat1, int n2, int m2, int[][] mat2) {
        int sum1 = 0;
        for(int i=0; i<n1; i++) {
            for(int j=0; j<m1; j++) {
                sum1 += mat1[i][j];
            }
        }
        //System.out.println(sum1);
        
        int sum2 = 0;
        for(int i=0; i<n2; i++) {
            for(int j=0; j<m2; j++) {
                sum2 += mat2[i][j];
            }
        }
        //System.out.println(sum2);
        
        if(sum1>sum2) {
            System.out.println(sum1);
        }
        else {
            System.out.println(sum2);
        }
    }
}
