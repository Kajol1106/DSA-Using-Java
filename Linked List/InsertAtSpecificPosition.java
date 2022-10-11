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

public class InsertAtSpecificPosition {
    public static Node insertNodeAtPosition(Node a,int data,int pos){
        //write your code here.
        Node newNode = new Node(data);
        if(pos == 0) {
            newNode.next = a;
            a = newNode;
            return a;
        }
        else {
            Node curr = a;
            Node prev = null;
            int count = -1;
            while(count<pos-1) {
                count++;
                prev = curr;
                curr = curr.next;
            }
            Node temp = curr;
            newNode.next = curr;
            prev.next = newNode;
            return a;
        }
      }
}
