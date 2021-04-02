public class client {
    public static void main(String[] args) {
        // queueUsingStack_push que = new queueUsingStack_push();
        // queueUsingStack_pop que = new queueUsingStack_pop();
        // for (int i = 1; i <= 10; i++) {
        //     que.add(i * 10);
        // }

        // while (que.size() != 0) {
        //     System.out.println(que.remove());
        // }

        // stackUsingQueue_push que = new stackUsingQueue_push();
        stackUsingQueue_pop que = new stackUsingQueue_pop();
        for (int i = 1; i <= 10; i++) {
            que.push(i * 10);
        }

        while (que.size() != 0) {
            System.out.println(que.pop());
        }
    }
}