import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            String secret = sc.next();
            String guess = sc.next();
            cowsAndBulls(n, secret, guess);
        }
    }
    
    public static void cowsAndBulls(int n, String secret, String guess) {
        int cowCount = 0;
        int bullCount = 0;
        
        int[] number = new int[10];
        for(int i=0; i<n; i++) {
            int s = secret.charAt(i)-'0';       //to convert the character into numeric
            int g = guess.charAt(i)-'0';
            if(s == g) {
                bullCount++;
            }
            else {
                if(number[s]<0) {
                    cowCount++;
                }
                number[s]++;
                
                if(number[g]>0) {
                    cowCount++;
                }
                number[g]--;
            }
        }
        
        System.out.println(bullCount + "A" + cowCount + "B");
    }
}
