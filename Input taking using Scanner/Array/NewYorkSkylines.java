import java.util.*;

public class NewYorkSkylines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            newYorkSkylines(n, arr);
            System.out.println();
        }
    } 
    
    
    public static void newYorkSkylines(int n, int[] arr) {
        
        int[] res = new int[n];
        
        if(arr[0]>arr[1]) {
            res[0] = 1;
        }
        
        if(arr[n-1]>arr[n-2]) {
            res[n-1] = 1;
        }
        
        for(int i=1; i<n-1; i++) {
            
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                res[i]=2;
            }
            else if(arr[i]>arr[i-1] || arr[i]>arr[i+1]) {
                res[i] = 1;
            }
            else {
                res[i] = 0;
            }
            
        }
        //System.out.println(res);
        
        for(int i:res) {
            System.out.print(i+" ");
        }
    }

}
