package OOPS1.LinkedLIsts;

public class DLL {
    private class Node{
        private int value;
        private Node prev;
        private Node next;

//        Constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = null;
        }
        head  = node;
    }
    public void insertAtLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if(head==null){
            head.prev = null;
            head= node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public void insert(int after,int value){
        Node p = find(after);
        if(p==null){
            System.out.println("Not Found");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.prev.next = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if(node.value ==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
       Node node = head; //new temp created pointing head
        while(node!=null){
            System.out.print(node.value+"---> ");
            node=node.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(18);
        list.insertAtLast(28);
        list.insert(7,56);

        list.display();
    }
}
