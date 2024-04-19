public class ass1{

    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int count = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){            
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;            
        }
        head = newNode;
        count += 1;
    }

    public void display(){
        Node current = head;
        System.out.print("Doubly Linked List:");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ass1 dll = new ass1();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.display();
        System.out.println("Length of Doubly Linked List is " + dll.count);
        System.out.println("Head of Doubly Linked List is " + dll.head.data);
        System.out.println("Tail of Doubly Linked List is " + dll.tail.data);
    }
}