import java.util.*;
import java.util.Arrays;

public class SquareRootOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int x = sc.nextInt();
            System.out.println(squareRoot(x));
        }
    }
    
    public static int squareRoot(int x) {
        if(x==0 || x==1) return x;
        
        long start = 1;
        long end = x/2;
        long ans = 0;
        while(start<=end) {
            long mid = (start+end)/2;
            if(mid*mid == x) return (int)mid;
            if(mid*mid<x) {
                start = mid+1;
                ans = mid;
            }
            else {
                end = mid-1;
            }
        }
        return (int)ans;
    }
}
