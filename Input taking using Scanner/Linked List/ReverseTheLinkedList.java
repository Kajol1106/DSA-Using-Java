class Node{
    int data;
    Node next;
    
    public Node(int data,Node next){
      this.data = data;
      this.next = next;
    }
    public Node(int data){
      this.data = data;
      this.next = null;
    }
    public Node(){
      this.data = 0;
      this.next = null;
    }
  }

  /*
1) Iterative approach
step-1 : take 3 pointers
    previous = null;
    current = head; 
    next = null;
step-2 : Iterating through the LL using loop
    next = current.next;
    current.next = previous;
    previous = current;
    current = next;
*/

public class ReverseTheLinkedList {
    public static Node reverseLinkedList(Node a){
        //write your code here.
        Node prev = null;
        Node curr = a;
        Node next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        a = prev;
        return a;
      }
}
