import java.util.*;

public class NobodyExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        nobodyExamination(n, x, arr);
    }
    
    public static void nobodyExamination(int n, int x, int[] arr) {
        int count = 0;
        int miss_count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]<=x && miss_count<=1) count++;
            else miss_count++;
        }
        System.out.println(count);
    }
}
