import java.util.*;


public class SmallerNeighbourElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0; j<n; j++) {
            arr[j] = sc.nextInt();
        }
        smallerNeighbourElement(n, arr);
    }

    //using stack approach
    public static void smallerNeighbourElement(int n, int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[n];
        stack.push(arr[0]);
        for(int i=0; i<n; i++) {
            //when stack is empty
            if(stack.size()==0) {
                res[i] = -1;
            }
            //we will check current element with top element from stack if current element is 
            // greater than top of stack we will append the element to result
            else if(stack.size()>0 && stack.peek()<arr[i]) {
                res[i] = stack.peek();
                stack.push(arr[i]);
            }
            else if(stack.size()>0 && stack.peek()>=arr[i]){
                while(stack.size()>0 && stack.peek()>=arr[i]) {
                    stack.pop();
                }
                if(stack.size()==0) {
                    res[i] = -1;
                }
                else {
                    res[i] = stack.peek();
                }
            }
            stack.push(arr[i]);
        }
        
        for(int i: res) {
            System.out.print(i+" ");
        }
    }



    
    //Brute Force Approach
    // public static void smallerNeighbourElement(int n, int[] arr) {
    //     int[] leftVal = new int[n];     //for store left side valu
    //     for(int i=0; i<n; i++) {
    //         int leftvalue = -1;
    //         for(int j=i-1; j>=0; j--) {
    //             if(arr[i]>arr[j]) {
    //                 leftvalue = arr[j];
    //                 break;
    //             }
    //         }
    //         leftVal[i] = leftvalue;
    //     }
        
    //     for(int i=0; i<n; i++) {
    //         System.out.print(leftVal[i]+" ");
    //     }
    // }
}
