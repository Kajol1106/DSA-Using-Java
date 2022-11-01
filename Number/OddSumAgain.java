import java.util.*;

class OddSumAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddSum(n);
    }
    
    public static void oddSum(int n) {
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=1; j<=i; j++) {
                if(j%2 != 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
        
    }
}
