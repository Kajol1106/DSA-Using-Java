/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class MergeTwoLinkedList{
    public Node mergeTwoLinkedList(Node a,Node b){
        if(a == null) return b;
        if(b == null) return a;
        if(a.data > b.data) {
            Node temp = a;
            a = b;
            b = temp;
        }
        Node res = a;
        while(a != null && b != null) {
            Node tmp = null;
            while(a != null && a.data <= b.data) {
                tmp = a;
                a = a.next;
            }
            tmp.next = b;
            
            //swap
            Node temp = a;
            a = b;
            b =temp;
        }
        return res;
    }
  }