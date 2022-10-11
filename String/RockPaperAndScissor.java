
import java.util.*;

public class RockPaperAndScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        rockPaperScissor(n, str1, str2);
    }
    
    static void rockPaperScissor(int n, String str1, String str2) {
        
        //first way to convert string into character array
        // char[] letter = new char[n];
        // for(int i=0; i<n; i++) {
        //     letter[i] = str1.charAt(i);
        // }
        
        //second way
        //char[] letter = str1.toCharArray();
        // for(char i:letter1) {
        //     System.out.print(i+" ");
        // }
        
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        //System.out.println(s1);
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i=0; i<n; i++) {
            
            if(s1[i]=='r' && s2[i]=='p') {
                sum2 += 1;
            }
            else if(s1[i]=='p' && s2[i]=='r') {
                sum1 += 1;
            }
            else if(s1[i]=='r' && s2[i]=='s') {
                sum1 += 1;
            }
            else if(s1[i]=='s' && s2[i]=='r') {
                sum2 += 1;
            }
            else if(s1[i]=='s' && s2[i]=='p') {
                sum1 += 1;
            }
            else if(s1[i]=='p' && s2[i]=='s') {
                sum2 += 1;
            }
            else {
                sum1 += 0;
                sum2 += 0;
            }
        }
        
        //System.out.println(sum1);
        //System.out.println(sum2);
        
        if(sum1>sum2) {
            System.out.println("First");
        }
        else if(sum1<sum2) {
            System.out.println("Second");
        }
        else {
            System.out.println("Draw");
        }
        
    }
    
}
