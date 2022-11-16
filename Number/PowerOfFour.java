import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findPower(n, 4));
        // int res = 1;
        // int i = 0;
        // while(i<4) {
        //     res *= n;
        //     i++;
        // }
        // System.out.println(res);
    }
    
    //using recursion
    public static int findPower(int n, int power) {
        if(power==0) {
            return 1;
        }
        return n*findPower(n, power-1);
    }
}