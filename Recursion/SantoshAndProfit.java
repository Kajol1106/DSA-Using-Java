import java.util.*;

public class SantoshAndProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            System.out.println(profit(n));
        }
    }
    
    public static int profit(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        return profit(n-4) + profit(n-8);
    }
}
