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
