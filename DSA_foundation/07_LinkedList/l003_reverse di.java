public Node getNodeAt(int idx) {
    Node curr = head;
    while (idx-- > 0) {
        curr = curr.next;
    }

    return curr;
}

public int length() {
    int len = 0;
    Node curr = head;
    while (curr != null) {
        curr = curr.next;
        len++;
    }

    return len;
}

 //  Data Iterative ..........................................

public void reverseDI() {
    int i = 0;
    int j = length() - 1;

    while (i < j) {
        Node in = getNodeAt(i);
        Node jn = getNodeAt(j);

        int temp = in.data;
        in.data = jn.data;
        jn.data = temp;

        i++;
        j--;
    } 

// ............................. DISPLAY REVERSE RECURSIVELY ...........................

    private void displayReverseHelper(Node node){
        if(node == null)
            return;
        
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
    }
}