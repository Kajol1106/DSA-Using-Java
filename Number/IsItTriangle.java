// a + b > c
// -> a + c > b
// -> c + b > a

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(isItTriangle(a, b, c));
        }
    }
    
    public static String isItTriangle(int a, int b, int c) {
        if((a+b>c) && (a+c>b) && (c+b>a) ) {
            return "Yes";
        }
        return "No";
    }
}