/*
 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 

 */



import java.util.*;

class PatternOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternOfN(n);
    }
    
    public static void patternOfN(int n) {
        int count = 1;
        for(int i=1; i<=n; i++) {
            String bag = "";
            for(int j=1; j<=n; j++) {
                bag += count+" ";
                count++;
            }
            System.out.println(bag);
        }
    }
}