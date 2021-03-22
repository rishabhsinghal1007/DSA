public class l005_kthfromLast{
    private class Node{
        int data;
        Node next = null;
    }

    private Node head;
    private Node tail;
    private int size;

    
    public int kthNodeFromEnd(int k){
            Node slow = head;
            Node fast = head;

            while(k-->0){
                fast = fast.next;
            }
            while(fast.next!=null){
                slow = fast.next;
                fast = fast.next;   
            }
            return slow.data;
        }
    }
}