import java.util.*;
import java.lang.String;

class SubstringUnderCondition {
    
    public static int countSubstringUnderCondition(String str) {
        int count = 0;
        int n = str.length();
        
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //System.out.print(str.length());
        
        System.out.println(countSubstringUnderCondition(str));
    }
}