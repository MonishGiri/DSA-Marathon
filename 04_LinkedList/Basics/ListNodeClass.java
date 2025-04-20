class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b; // Linking => a -> b
        Node c = new Node(30);
        b.next = c;
        Node d = new Node(40);
        c.next = d;
        Node e = new Node(50);
        d.next = e;
    }
}