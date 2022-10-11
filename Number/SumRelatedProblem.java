import java.util.*;

public class SumRelatedProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=0; i<=n; i++) {
            if(i%2 != 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}


// Description

// You are given a numberN, you need to find sum of all the even numbers which are less than or equal to N.