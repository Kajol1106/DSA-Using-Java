import java.util.*;

public class DigitSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            digitSumArray(n, arr);
        }
    }
    
    static void digitSumArray(int n, int[] arr) {
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            res[i] = sumOfDigits(arr[i]);
        }
        //System.out.println(res);
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    
    static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
