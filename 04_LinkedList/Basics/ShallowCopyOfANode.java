public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node temp = a; // shallow copy
        // Node temp = new Node(100); // Deep Copy
        System.out.println(a);
        System.out.println(temp);
    }
}
