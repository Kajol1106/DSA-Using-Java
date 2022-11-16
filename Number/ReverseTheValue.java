import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int rev = 0;
        int rem;
        while(N != 0) {
            rem = N%10;
            rev = rev*10+rem;
            N = N/10;
        }
        System.out.println(rev);
    }
}