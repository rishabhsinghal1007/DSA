// pointer iterative ...................................

public void reversePI() {
    Node curr = head;
    Node prev = null;
    while (curr != null) {
        Node forw = curr.next; // backup

        curr.next = prev; // link

        prev = curr; // move
        curr = forw;
    }

    tail = head;
    head = prev;
}