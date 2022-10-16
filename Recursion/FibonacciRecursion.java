import java.util.*;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciRecursion(n));
    }
    
    public static int fibonacciRecursion(int n) {
        if ((n == 0) || (n == 1))
         return n;
        else
         return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
