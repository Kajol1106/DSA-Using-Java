import java.util.*;

class YourFirstPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        yourFirstPattern(n);
    }
    
    public static void yourFirstPattern(int n) {
        for(int i=0; i<n; i++) {
            String bag = "";
            for(int j=0; j<n; j++) {
                bag += "*"+" ";
            }
            System.out.println(bag);
        }
    }
}
