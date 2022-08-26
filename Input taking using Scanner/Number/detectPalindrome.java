import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println(num);
        
        String res = "No";
        if(num == detectPalindrome(num))
            res = "Yes";
            
        System.out.print(res);
    }
    
    public static int detectPalindrome(int num) {
        int rev=0;
        while(num!=0){
            int remainder=num%10;
            rev=rev*10+remainder;
            num=num/10;
        }
        return rev;
    }
}