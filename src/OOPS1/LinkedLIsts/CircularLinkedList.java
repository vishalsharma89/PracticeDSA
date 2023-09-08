package OOPS1.LinkedLIsts;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
//            while(node!=head){
//                System.out.print(node.val + " -> ");
//                                    node = node.next;
//            }
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

//        First element is to be deleted
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(7);
        list.insert(18);
        list.insert(28);
        list.display();
        list.delete(18);
        list.display();
    }
}
