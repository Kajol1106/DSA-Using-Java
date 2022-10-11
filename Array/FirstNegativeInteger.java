import java.util.*;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
           int n = sc.nextInt();
           int k = sc.nextInt();
           int[] arr = new int[n];
           for(int j=0; j<n; j++) {
               arr[j] = sc.nextInt();
           }
           firstNegative(n, k, arr);
        }
    }
    
    public static void firstNegative(int n, int k, int[] arr) {
        //List<Integer> res = new ArrayList<>();
        for(int i=0; i<n-k+1; i++) {
            boolean isNegative = false;
            for(int j=i; j<i+k; j++) {
                if(arr[j]<0) {
                    System.out.print(arr[j]+" ");
                    isNegative = true;
                    break;
                }
            }
            if(!isNegative) {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}
