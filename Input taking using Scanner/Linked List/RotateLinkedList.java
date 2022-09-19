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

class RotateLinkedList{
  
    public static Node rotateNode(Node a,int k,int n){
      //edge cases
      if(a == null || a.next == null || k == 0) return a;
      
      //compute the length
      Node curr = a;
      n = 1;
      while(curr.next != null) {
          n++;
          curr = curr.next;
      }
      
      //go till that node
      curr.next = a;
      k = n-k%n;
      while(k-- > 0) curr = curr.next;
      
      //make the node head and break connection
      a = curr.next;
      curr.next = null;
      
      return a;
    }
  }
