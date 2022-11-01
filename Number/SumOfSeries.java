import java.util.*;

class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sumOfSeries(n, x);
    }
    
    public static void sumOfSeries(int n, int x) {
        if(n<=0 || x<=0) {
            System.out.println("-1");
        }
        else {
            long sum = 0;
            for(int i=0; i<n; i++) {
                double sq = Math.pow(x, i);
                sum += sq;
            }
            System.out.println(sum);
        }
    }
}
