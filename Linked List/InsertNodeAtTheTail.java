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

public class InsertNodeAtTheTail {
    public static Node insertAtTail(Node a, int data){
        //write your code here.
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(a == null) {
            a = node;
            return a;
        }
        else {
            Node curr = a;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
            return a;
        }
      }
}
