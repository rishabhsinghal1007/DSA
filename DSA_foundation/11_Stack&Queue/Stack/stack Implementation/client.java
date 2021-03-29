public class client{

    public static void main(String[] args) throws Exception{
        // stack st = new stack(5);

        stack st = new dynamicStack(5);
        for(int i = 1 ; i < 6 ; i++)
            st.push(i * 10);

        while(st.size() != 0){    
            System.out.println(st.pop());
        }         
    }
}