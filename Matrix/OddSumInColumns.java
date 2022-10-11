import java.util.*;

  class OddSumInColumns {
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
        oddSumInColumns(row, col, mat);
    }

    public static void oddSumInColumns(int n,int m,int[][] arr){
        //write your code here
        
        for(int i=0; i<m; i++) {
            int sum = 0;
            for(int j=0; j<n; j++) {
                //System.out.print(arr[i][j]+" ");
                if(arr[j][i]%2 == 1) {
                    sum+=arr[j][i];
                }
            }
            System.out.println(sum);
            //System.out.println();
        }
      }
  }
