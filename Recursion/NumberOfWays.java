import java.util.*;

public class NumberOfWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ways(n, 0));
    }
    
    public static int ways(int n, int steps) {
        if(steps > n) {
            return 0;
        }
        if(steps == n) {
            return 1;
        }
        return ways(n, steps+1) + ways(n, steps+2) + ways(n, steps+3);
    }
}
