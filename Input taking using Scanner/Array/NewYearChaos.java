import java.util.*;


public class NewYearChaos {
    public static void newYearChaos(int n, int[] arr) {
        int count = 0;
        int max = 0;
        for(int i=0; i<n-1; i++) {
            if(arr[i]>arr[i+1]) {
                count++;
                int chk = arr[i]-arr[i+1];
                if(chk>2) {
                    System.out.println("Too chaotic");
                    return;
                }
                if(max == 0) {
                    max = chk;
                }
                else {
                    max = max+chk;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            newYearChaos(n, arr);
            //print(n, arr);
        }
    }
    
}
