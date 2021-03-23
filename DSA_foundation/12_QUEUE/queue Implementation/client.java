public class client{
    public static void main(String[] args) throws Exception{
        queueClass que = new queueClass(6);
        for(int i = 0 ; i < 6 ; i++)
            que.push(i * 100);
        // System.out.println(que.display());
        System.out.println(que);
    }
}