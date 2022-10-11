import java.util.*;
import java.lang.*;

public class SumOfBoundaryAndDiagnoalElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sumOfBoundaryAndDiagonalElements(n, mat);
    }
    
    static void sumOfBoundaryAndDiagonalElements(int n,int[][] mat) {
       int sum1 = 0;
       int sum2 = 0;
       int sum3 = 0;
       for(int i=0; i<n; i++) {
           for(int j=0; j<n; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == n-1) {
                   sum1 += mat[i][j];
               }
               else if(i != 0 && i != n-1 && j != 0 && j != n-1) {
                   if(i==j) {
                       sum2 += mat[i][j];
                   }
                   else if((i+j) == (n-1)) {
                       sum3 += mat[i][j];
                   }
                   else {
                       
                   }
               }
           }
       }
       System.out.println(sum1+sum2+sum3);
        
    }

}
