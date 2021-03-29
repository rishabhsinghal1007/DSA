import java.util.Queue;
import java.util.LinkedList;

public class stackUsingQueue_push {
    Queue<Integer> que = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();

    int peekEle = 0;

    public int size() {
        return this.que.size();
    }

    public boolean isEmpty() {
        return this.que.isEmpty();
    }

    public void push(int data) {
        this.peekEle = data;
        this.que.add(data);
    }

    public int top() {
        return this.peekEle;
    }

    public int pop() {
        while (this.que.size() != 1) {
            this.temp.add(this.que.remove());
        }

        int rData = this.que.remove();

        while (this.temp.size() != 0) {
            this.push(this.temp.remove());
        }
        return rData;
    }
}