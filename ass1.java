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
            head = newNode;           
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head; 
            head = newNode;           
        }        
        count += 1;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){ 
            head = newNode;           
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail; 
            tail = newNode;           
        }        
        count += 1;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Doubly Linked List is empty");
            return;
        }else if(head.next == null){
            //only one node in the list
            head = null;
            tail = null;
        }else{
            //more than one node in the list
            head = head.next;
            head.prev = null;
        }
        count -= 1;
    } 
    
    public void deleteLast(){
        if(head == null){
            System.out.println("Doubly Linked List is empty");
            return;
        }else if(head.next == null){
            //only one node in the list
            head = null;
            tail = null;
        }else{
            //more than one node in the list
            tail.prev.next = null; 
            tail = tail.prev;           
        }
        count -= 1;
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
        dll.addLast(10);
        dll.addLast(11);
        dll.display();
        System.out.println("Length of Doubly Linked List is " + dll.count);
        System.out.println("Head of Doubly Linked List is " + dll.head.data);
        System.out.println("Tail of Doubly Linked List is " + dll.tail.data);
        dll.deleteLast();
        dll.display();
        System.out.println("Length of Doubly Linked List is " + dll.count);
        System.out.println("Head of Doubly Linked List is " + dll.head.data);
        System.out.println("Tail of Doubly Linked List is " + dll.tail.data);
    }
}