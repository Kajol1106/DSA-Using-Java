import java.util.*;

class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        evenArray(n, arr);
    }
    
    public static void evenArray(int n, int[] arr) {
        for(int i=0; i<n; i++) {
            if(arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
        
    }
}