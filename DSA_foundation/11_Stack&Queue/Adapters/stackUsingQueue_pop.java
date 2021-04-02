import java.util.Queue;
import java.util.LinkedList;

public class stackUsingQueue_pop {
    Queue<Integer> que = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();

    public int size() {
        return this.que.size();
    }

    public boolean isEmpty() {
        return this.que.isEmpty();
    }

    public void push(int data) {
        while (this.que.size() != 0)
            this.temp.add(this.que.remove());

        this.que.add(data);

        while (this.temp.size() != 0)
            this.que.add(this.temp.remove());
    }

    public int top() {
        return this.que.peek();
    }

    public int pop() {
        return this.que.remove();
    }
}