/*
class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
    this.data = 0;
  }
  public Node(int data,Node next){
    this.next = next;
    this.data = data;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/


public class Seprate0'sAnd1's {
    public static Node orderList(Node head){
        //write your code here
        if(head == null || head.next == null) {
            return head;
        }
        
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        
        Node zero = zeroD;
        Node one = oneD;
        
        Node curr = head;
        while(curr != null) {
            if(curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            }
            else {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            }
        }
        zero.next = (zeroD.next != null) ? zeroD.next : oneD.next;
        zero.next = oneD.next;
        one.next = null;
        
        head = zeroD.next;
        return head;
      }
}
