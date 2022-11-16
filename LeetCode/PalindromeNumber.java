package LeetCode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int sum = 0;
         int y = x;
         
         while(x > 0){
             sum = 10 * sum + x % 10;
             x /= 10;
         }
         
         return sum == y;
     }
    
}
