import java.util.LinkedList;

public class queue1{

    public class Node{
        int data = 0;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int elementCount = 0;

    private void addLast(int data){
        Node node = new Node(data);
        if(this.elementCount == 0){
            this.head = this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }

        this.elementCount++;
    }

    private int removeFirst(){
        Node removeNode = this.head;
        if(this.elementCount == 1){
            this.head = this.tail = null;
        }else{
            this.head = removeNode.next;
        }
        removeNode.next = null;
        this.elementCount--;

        return removeNode.data;
    }

    public int size(){
        return elementCount;
    }

    public boolean isEmpty(){
        return elementCount == 0;
    }

    public void push(int data){
        addLast(data);
    }

    public int front(){
        return this.head.data;
    }

    public int pop(){
       return removeFirst();
    }
}