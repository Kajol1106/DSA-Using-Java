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
}

public class DeleteNodeWithoutHead {
    public void removeNode(Node node){
        //write your code here.
        if(node == null) {
            return;
        }
        if(node.next == null) {
            System.out.println();
        }
        else {
            //change data value to next node
            node.data = node.next.data;
            //change link
            node.next = node.next.next;
        }
    }
}
