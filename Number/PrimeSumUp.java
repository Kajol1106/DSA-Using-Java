import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeSum(n);
    }
    
    public static void primeSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i == 1 || i == 0) {
                continue;
            }
            int flag = 1;
            for(int j=2; j<=i/2; ++j) {
                if(i%j == 0) {
                    flag = 0;
                    break;
                }
            }
            
            if(flag == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}