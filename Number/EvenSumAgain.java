import java.util.*;

class EvenSumAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenSum(n);
    }
    
    public static void evenSum(int n) {
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=1; j<=i; j++) {
                if(j%2==0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
        
    }
}