import java.util.*;

class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(n, arr);
    }
    
    public static void printArray(int n, int[] arr) {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
