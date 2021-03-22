private void reversePRHelper(Node node) {
    if (node.next == null) {
        Node temp = head;
        head = tail;
        tail = temp;

        return;
    }
    reversePRHelper(node.next);

    Node forw = node.next;
    forw.next = node;
}

public void reversePR() {
    reversePRHelper(head);
    tail.next = null;
}

// METHOD 2 BY RETURNING ..........................................................................

private Node reversePRHelper(Node node){
    if(node.next == null){
        Node temp = head;
        head = tail;
        tail = temp;

        return;
    }

    Node rNode = reversePRHelper(node.next);
    rNode.next = node;
    node.next = null;
    return node;
}

public void reversePR(){
    reversePRHelper(head);
}