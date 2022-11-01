import java.util.*;

class IdentifyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        identifyPrime(n);
    }
    
    public static void identifyPrime(int n) {
        int is_prime = 1;
        for(int i=2; i<n; i++) {
            if(n%i==0) {
                is_prime=0;
                break;
            }
        }
        
        if(is_prime==0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}