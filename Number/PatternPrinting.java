/*
 
*
**
***
****

 */

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternPrinting(n);
    }
    
    public static void patternPrinting(int n) {
        for(int i=1; i<=n; i++) {
            String bag = "";
            for(int j=1; j<=i; j++) {
                bag += "*";
            }
            System.out.println(bag);
        }
    }
}