import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++) {
            String str = sc.next();
            //System.out.println(str);
            reverseString(str);
        }
    }
    
    static void reverseString(String str) {
        
        // int length = str.length();
        // String rev = "";
        // for(int i=length-1; i>=0; i--) {
        //     rev += str.charAt(i);
        // }
        // System.out.println(rev);
        
        StringBuilder res = new StringBuilder();
        res.append(str);
        res.reverse();
        System.out.println(res);
    }
}