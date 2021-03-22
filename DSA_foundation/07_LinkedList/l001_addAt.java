import java.io.*;
import java.util.*;

public class l001_addAt {
    public static class Node {
      int data;
      Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
            }
            System.out.println();
        }
        
        private void addFirstNode(Node node){
            if(this.head == null){
                this.head = node;
                this.tail = node;
            } else{
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }
        
        private void addLastNode(Node node){
            if(this.head == null){
                this.head = node;
                this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }
        
        private Node getNodeAt(int idx){
            Node curr = this.head;
            while(idx-->0){
                curr = curr.next;
            }
            return curr;
        }

        private void addAtNode(int idx, Node node){
                
            if(idx < 0 || idx > this.size){
            System.out.println("Invalid arguments");
            }else if(idx == 0){
                addFirstNode(node);
            }
            else if (idx == this.size){
                addLastNode(node);
            }else{
                Node prev = getNodeAt(idx-1);
                Node forw = prev.next;
                
                prev.next = node;
                node.next = forw;
                this.size++;
            }
        }
        public void addAt(int idx, int val){
            Node node = new Node();
            node.data = val;
            addAtNode(idx,node);
        }
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            LinkedList list = new LinkedList();
        
            String str = br.readLine();
            while (str.equals("quit") == false) {
                if (str.startsWith("addAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx, val);
                } 
                str = br.readLine();
            }
        }        
    }
}