import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    // public static int[][] displayData(int n, int[][] mat) {
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<n; j++) {
    //             return (mat[i][j]+" ");
    //         }
    //         return System.out.println();
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat= new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //displayData(n, mat);
        rotateBy90(n, mat);
    }
    
    public static void rotateBy90(int n, int[][] mat) {
        for(int i=n-1; i>=0; i--) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++) {
                sb.append(mat[j][i]+" ");
            }
            System.out.println(sb);
        }
    }
}