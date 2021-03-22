public class linkedlistClass{

    private class Node{
        int data = 0;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int sizeofLL = 0;

    public boolean isEmpty(){
        return this.sizeofLL == 0;
    }

    public int size(){
        return this.sizeofLL;
    }

    public void display(){
        Node curr = this.head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    // EXCEPTIONS=========================================================

    private void EmptyException() throws Exception{
        if(this.sizeofLL == 0){
            throw new Exception("Linked List is Empty : -1 ");
        }
    }

    private void IndexOutOfBoundSizeExclusiveException(int idx) throws Exception{
        if(idx < 0 || idx >= this.sizeofLL)
            throw new Exception("Index out of bound : -1");
    }

    private void IndexOutOfBoundSizeInclusiveException(int idx) throws Exception{
        if(idx < 0 || idx > this.sizeofLL)
            throw new Exception("Index out of bound : -1");
    }

    // GET================================================================

    public int getFirst() throws Exception{
        EmptyException();
        return this.head.data;
    }

    public int getLast() throws Exception{
        EmptyException();
        return this.tail.data;
    }

    private Node getNodeAt(int idx){
        Node curr = this.head;
        while(idx--> 0){
            curr = curr.next;
        }
        return curr;
    }

    public int getAt(int idx) throws Exception{
        IndexOutOfBoundSizeExclusiveException(idx);
        Node node = getNodeAt(idx);
        return node.data;
    }

    // ADD ================================================================

    private void addFirstNode(Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
        this.sizeofLL++;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        addFirstNode(node);
    }

    private void addLastNode(Node node) {
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        this.sizeofLL++;
    }

    public void addLast(int data){
        Node node = new Node(data);
        addLastNode(node);
    }

    private void addAtNode(int idx , Node node){
        if(idx == 0)
            addFirstNode(node);
        else if(idx == this.sizeofLL)
            addLastNode(node);
        else{
            Node prev = getNodeAt(idx-1);
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;

            this.sizeofLL++;
        }
    }

    public void addAt(int idx , int data) throws Exception{
        IndexOutOfBoundSizeInclusiveException(idx);
        Node node = new Node(data);
        addAtNode(idx,node);
    }

    //   REMOVE ========================================================

    private Node removeFirstNode(){
        Node removeNode = this.head;
        if(this.sizeofLL == 1){
            this.head = null;
            this.tail = null;
        }else{
            Node forw = this.head.next;
            this.head.next = null;
            this.head = forw;
            
        }
        this.sizeofLL--;
        return removeNode;
    }

    public int removeFirst() throws Exception{
        EmptyException();
        Node node = removeFirstNode();
        return node.data;
    }

    private Node removeLastNode(){
        Node removeNode = this.tail;
        if(this.sizeofLL == 1){
            this.head = null;
            this.tail = null;
        }else{
            Node secondLastNode = getNodeAt(this.sizeofLL-2);
            this.tail = secondLastNode;
            this.tail.next = null;
        }
        this.sizeofLL--;
        return removeNode;
    }

    public int removeLast() throws Exception{
        EmptyException();
        Node node = removeLastNode();
        return node.data;
    }

    private Node removeNodeAt(int idx){
        if(idx == 0) 
            return removeFirstNode();
        else if(idx == sizeofLL-1) 
            return removeLastNode();
        else{
            Node prev = getNodeAt(idx-1);
            Node curr = prev.next;
            Node forw = curr.next;

            prev.next = forw;
            curr.next = null;
            
            this.sizeofLL--;
            return curr;
        }
    }

    public int removeAt(int idx) throws Exception{
        EmptyException();
        IndexOutOfBoundSizeExclusiveException(idx);
        Node node = removeNodeAt(idx);
        return node.data;
    }
}