package MergeTwoLL_Sorted;

public class Main {
    public static void main(String[] args) {
        //creating 2 list
        Node l1 = new Node(1);
        Node head1 = l1;
        l1.next = new Node(3);
        l1 = l1.next;
        l1.next = new Node(31);
        //   Node.print(head1);
        Node l2 = new Node(2);
        Node head2 = l2;
        l2.next = new Node(4);
        l2 = l2.next;
        l2.next = new Node(7);
        //     Node.print(head2);
    mergeTwoLinkedList(head1,head2);
    }

    static void mergeTwoLinkedList(Node l1, Node l2) {
        int val = 0;
        if (l1.data < l2.data) {
            val = l1.data;
            l1 = l1.next;
        } else {
            val = l2.data;
            l2 = l2.next;
        }
        Node l3 = new Node(val);
        Node head = l3;

        while (l1 != null && l2 != null) {
            //i was highly confused b/w '&&' or '||' which one to use
            if (l1.data < l2.data) {
                l3.next = new Node(l1.data);
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next = new Node(l2.data);
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        //even l1==null or l2==null or both are null
        if (l1 != null )
        {
            while (l1 != null)
            {
                l3.next = new Node(l1.data);
                l3 = l3.next;
                l1 = l1.next;
            }
        }
        else if (l2 != null )
        {
            while (l2 != null)
            {
                l3.next = new Node(l2.data);
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        Node.print(head);
    }
}
