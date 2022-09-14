class Node{
	int data;
	Node next;

	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(Node next,int data){
		this.data = data;
		this.next = next; 
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class MiddleNode {
    //two pointer approach
    public int middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            //it will take two steps ata a time
            fast = fast.next.next;
            
            //it will take one step at a time
            slow = slow.next;
        }
        return slow.data;
      }
}
