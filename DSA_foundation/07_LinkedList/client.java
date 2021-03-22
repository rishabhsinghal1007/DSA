public class client {
    public static void main(String[] args) throws Exception {
        linkedlistClass ll = new linkedlistClass();

        for (int i = 1; i <= 10; i++) {
            ll.addLast(i * 10);
        }

        ll.display();
        ll.removeFirst();
        ll.display();

        // System.out.println(ll.getLast());

    }
    
}