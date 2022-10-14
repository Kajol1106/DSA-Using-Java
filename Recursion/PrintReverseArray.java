import java.util.*;

public class PrintReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(n-1, arr);
    }
    
    public static void printArray(int index,int[] arr){
        if(index < 0) {
            return;
        }
        System.out.println(arr[index]);
        printArray(index-1, arr);
    }
}
