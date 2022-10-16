import java.util.*;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
    public static int factorial(int num)
    {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
}
