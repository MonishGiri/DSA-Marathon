class SLL{ // User defined data structure
    private Node head;
    private Node tail;
    private int size;

    public Node getTail(){
        return tail;
    }

    public void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void insert(int index, int val){
        if(index == 0){
            insertAtHead(val);
            return;
        } 
        if(index == size) {
            insertAtTail(val);
            return;
        }
        if(index > size || index<0) {
            System.out.println("Invalid Index!!!!");
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1; i<=index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public int get(int index) throws Exception{
        if(index == 0){
            return head.val;
        }
        if(index == size-1){
            return tail.val;
        }
        if(index >= size || index<0){
            throw new Exception("Invalid Index");
        }
        Node temp = head;
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
}


public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        list.display();
        list.insertAtHead(50);
        list.display();

        list.insert(2, 60);
        list.display();

        list.insert(4, 100);
        list.display();

        try {
            System.out.println(list.get(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Size is: "+list.getSize());
    }
}
