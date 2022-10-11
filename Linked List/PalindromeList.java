
/*
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
*/




public class PalindromeList {
    //main solution
  public static boolean detectPalindrome(Node a){
    //complete this function.
    if(a == null) {
        return true;
    }
    Node mid = middle(a);
    Node last = reverse(mid.next);
    Node curr = a;
    while(last != null) {
        if(last.data != curr.data) {
            return false;
        }
        last = last.next;
        curr = curr.next;
    }
    return true;
  }
  
  
  //find middle node
  public static Node middle(Node head) {
      Node slow = head;
      Node fast = head;
      while(fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow;
  }
  
  
  //to reverse the list
  public static Node reverse(Node head){
    Node curr = head;
    Node prev = null;
    while(curr != null) {
        Node temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
  }
}
