public class client{
    public static void main(String[] args) throws Exception{
        // queueClass que = new queueClass(6);
        dynamicQueue que = new dynamicQueue(6);
        for(int i = 0 ; i < 12 ; i++)
            que.push(i * 100);
        // System.out.println(que.display());

        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que);
    }
}