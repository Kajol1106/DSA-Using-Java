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

      //Iterative approach
      // public static Node reverseLinkedList(Node a){
      //   //curr ko head decalre karo
      //   Node curr = a;
      //   //null for reverse element
      //   Node prev = null;
      //   while(curr != null) {
      //       //curr ki link curr.next element ke sath todane se pahale curr.next ko temp variable store kar lo
      //       Node temp = curr.next;
      //       //curr.next ko prev means null denote kar do
      //       curr.next = prev;
      //       //prev pointer aage lane ke liye prev ko curr denote kar do
      //       prev = curr;
      //       //curr pointer aage lane ke liye curr ko temp denote kar do
      //       curr = temp;
      //   }
      //   return prev;
      // }
}
