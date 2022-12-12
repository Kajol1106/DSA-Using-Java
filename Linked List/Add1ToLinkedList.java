
class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class Solution{
  public Node addOneToLinkedList(Node head){
    //write your code here.
    head = reverse(head);
    Node curr = head;
    Node prev = head;
    int sum = curr.data+1;
    curr.data = sum%10;
    int carry = sum/10;
    curr = curr.next;
    
    while(curr != null) {
        sum = curr.data+carry;
        curr.data = sum%10;
        carry = sum/10;
        prev = curr;
        curr = curr.next;
    }
    
    if(carry != 0) {
        prev.next = new Node(carry);
    }
    head = reverse(head);
    return head;
  }
  
  
  //reverse method
  public Node reverse(Node head) {
      Node prev = null;
      Node next = null;
      Node curr = head;
      
      while(curr != null) {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      return prev;
  }
}
