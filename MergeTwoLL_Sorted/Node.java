package MergeTwoLL_Sorted;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
    static void print(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

}
