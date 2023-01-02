import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            happyNumber(n);
        }
    }
    
    public static void happyNumber(int n) {
        while(n>9) {
            n = digitSum(n);
        }
        
        if(n == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    public static int digitSum(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n%10;
            sum += digit*digit;
            n /= 10;
        }
        return sum;
    }
}
