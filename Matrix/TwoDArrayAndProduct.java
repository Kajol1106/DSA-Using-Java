import java.util.*;
import java.lang.*;
import java.io.*;


public class TwoDArrayAndProduct {
     // public static void displayData(int n, int m, int[][] mat) {
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<m; j++) {
    //             System.out.print(mat[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int P = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //displayData(n, m, mat);
        twoDArrayAndProduct(n, m, P, mat);
    }

    public static void twoDArrayAndProduct(int n, int m, int p, int[][] a) {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j<a[i].length-2) //finding product along the horizontal direction
                {
                    int temp=a[i][j]*a[i][j+1]*a[i][j+2];
                    if(temp==p)
                    {
                        count++;
                    }
                }
                if(i<a.length-2)    //finding product vertical direction
                {
                    int temp=a[i][j]*a[i+1][j]*a[i+2][j];
                    if(temp==p)
                    {
                        count++;
                    }
                }
                if(i<a.length-2 && j<a[j].length-2) //finding product of diagoanls
                {
                    int temp=a[i+2][j]*a[i+1][j+1]*a[i][j+2];
                    if(temp==p)
                    {
                        count++;
                    }
                }
                if(i<a.length-2 && j<a.length-2)    //finding product of diagonals
                {
                    int temp=a[i][j]*a[i+1][j+1]*a[i+2][j+2];
                    if(temp==p)
                    {
                        count++;
                    }
                }
            
            }
        }
        System.out.println(count);
    }
    
}
