public class stack{
    protected int[] arr = null;
    protected int capacity = 0;  
    protected int elementCount = 0;
    protected int tos = -1 ;

    // Constructor. ==============================================================================
    
    protected void initializeVariables(int capacity){
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.elementCount = 0;
        this.tos = -1;
    }
    public stack(){
        initializeVariables(10); 
    }

    public stack(int size){
        initializeVariables(size);
    }

    // Basic Functions . ==================================================================

    public int size(){
        return this.elementCount;
    }

    public boolean isEmpty(){
        return this.elementCount == 0 ;
    }


    //  Exceptions . =======================================================================

    private void OverflowException() throws Exception{
        if(this.capacity == this.elementCount)
            throw new Exception("StackIsFull");
    }

    private void underFlowException() throws Exception{
        if(this.elementCount == 0)
            throw new Exception("StackIsEmpty");
    }

    // Stack functions. =======================================================================

    protected void push_(int data) {
        this.arr[++this.tos] = data;
        this.elementCount++;
    }

    public void push(int data) throws Exception {
        OverflowException();
        push_(data);
    }

    public int top() throws Exception {
        underFlowException();
        return this.arr[this.tos];
    }

    protected int pop_(){
        int rv = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.elementCount--;
        return rv;
    }

    public int pop() throws Exception{
        underFlowException();
        return pop_();
    }

}