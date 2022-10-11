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

public class InsertNodeAtTheHead {
    public static Node addAtHead(Node a,int data){
        //write your code here.
        if(a == null) {
            a = new Node(data);
            return a;
        }
        else {
            Node node = new Node(data);
            node.next = a;
            a = node;
            return node;
        }
      }
}
