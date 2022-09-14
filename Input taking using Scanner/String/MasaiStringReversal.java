import java.util.*;
import java.lang.*;
import java.io.*;

class MasaiStringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //System.out.println(str);
        masaiReversalString(str);
    }
    
    static void masaiReversalString(String str) {
        // int len = str.length();
        // String rev = "";
        // for(int i=len-1; i>=0; i--) {
        //     rev += str.charAt(i);
        // }
        // System.out.println(rev);
        
        StringBuilder res = new StringBuilder();
        res.append(str);
        res.reverse();
        System.out.println(res);
    }
}