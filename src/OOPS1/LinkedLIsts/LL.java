package OOPS1.LinkedLIsts;

public class LL {

    private class Node{

        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    //    INSERTIONS
    public void insertFirstNode(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;
        if(tail==null){
            tail =head;
        }
        size+=1;
    }
    public void insertAtEnd(int val){
        if(tail==null){
            insertFirstNode(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail = node;
        size+=1;
    }

    public void insertionAtMiddle(int val,int index){
        if(index==0){
            insertFirstNode(val);
            return;
        }
        if(index==size){
            insertAtEnd(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

//        creating new node for new value;
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

//    DELETE FIRST NODE
    public int delete(){
        int val= head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
//
//    DELETE LAST NODE
//    public int deleteLast(){
//        int val= tail.value;
//        tail = tail.next;
//        if(head==null){
//            tail=null;
//        }
//        size--;
//        return val;
//    }

//    DELETE LAST NODE
    public int deleteLast(){
        if(size<=1){
            return delete();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    public int deleteMiddle(int index){
        if(index==0){
            return delete();
        }
        if(index ==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

//    Get secondLast Value
    public Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head; //new temp created pointing head
        while(temp!=null){
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("NULL");
        System.out.println(size);
    }


    public static void main(String[] args) {
            LL list = new LL();
            list.insertFirstNode(3);
            list.insertFirstNode(4);
            list.insertFirstNode(7);
            list.insertFirstNode(18);
            list.insertFirstNode(31);
            list.insertionAtMiddle(45,3);
            list.insertAtEnd(56);

        list.display();

        list.delete();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteMiddle(2);
        list.display();
    }
}
