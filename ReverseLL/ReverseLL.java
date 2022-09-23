package ReverseLL;

public class ReverseLL {
    public static void main(String[] args) {
        Node ll = new Node(1);
        Node head = ll;
        ll.next = new Node(2);
        ll = ll.next;
        ll.next = new Node(3);
        //calling
        reverseLL(head);
    }
    public static void reverseLL(Node ll){
        Node head = ll;
        Node prev = null;
        Node curr = ll;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        Node.print(prev);
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    public static void print(Node ll){
        while(ll != null){
            System.out.print(ll.data+" ");
            ll = ll.next;
        }
    }
}
