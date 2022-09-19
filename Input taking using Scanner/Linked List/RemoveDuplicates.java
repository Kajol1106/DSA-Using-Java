/*
class Node{
  int data;
  Node next;
  public Node(int data){
    this.next = null;
    this.data = data;
  }
  public Node(int data, Node next){
    this.next = next;
    this.data = data;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/



public class RemoveDuplicates {
    public Node removeDuplicates(Node a){
        Node curr = a;
        while(curr != null && curr.next != null) {
            if(curr.next.data == curr.data) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return a;
      }
}
