import java.util.*;

class MinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        maximumInArray(n, arr);
    }
    
    public static void maximumInArray(int n, int[] arr) {
        int min = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i]<=min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
