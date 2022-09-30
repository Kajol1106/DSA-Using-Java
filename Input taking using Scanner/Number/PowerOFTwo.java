import java.util.*;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            powerOfTwo(n);
        }
    }
    
    public static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
 
    public static void powerOfTwo(int n)
    {
        if (isPowerOfTwo(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}