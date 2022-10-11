/*
class Node{
  int data;
  Node next;
  
  Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  Node(){
    this.data = 0;
    this.next = null;
  }
}
*/


public class NthNodeFromTheEnd {
    public int nthNode(Node data,int n){
        //declare two pointer slow and fast
        //at the begining declare value for slow and fast head
        Node slow = data;
        Node fast = data;
        //1 step se fast ko aage rakhane ke liye hume pahale fast ko next dena hoga
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        //jab tak fast null nahi ho jata tab tak loop run karo
        while(fast != null) {
            //slow and fast ko 1 step aage le lo
            //pahale hi humane fast 1 step se aage liya hai that's why fast pointer slow pointer se 1 step aage hoga
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
