class Node{
    int data;
    Node next;
    
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }


public class AddTwoLinkedList {
    public Node addTwoLinkedList(Node head1,Node head2){
        //write your code here.
        Node dummy = new Node(0);
        Node temp = dummy;
        int sum = 0;
        int carry = 0;
        while(head1 != null || head2 != null) {
            if(head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = Math.abs(sum/10);
            sum = sum%10;
            temp.next = new Node(sum);
            temp = temp.next;
            sum = carry;
            carry = 0;
        }
        return dummy.next;
      }
}
