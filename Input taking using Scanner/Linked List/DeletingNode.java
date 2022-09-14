
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

public class DeletingNode {
    public static Node deleteNode(Node a,int pos){
        //write your code here.
        if(pos == 0) {
            a = a.next;
            return a;
        }
        else {
            Node prev = null;
            Node curr = a;
            int count = -1;
            while(count<pos-1) {
                count++;
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            return a;
        }
      }
}
