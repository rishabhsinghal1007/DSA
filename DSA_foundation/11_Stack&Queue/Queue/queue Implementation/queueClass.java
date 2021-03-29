public class queueClass{

    protected int[] arr = null;
    protected int elementCount = 0;
    protected int capacity = 0;
    protected int front = 0 ;
    protected int back = 0;

    protected void initializeVariables(int capacity){
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.elementCount = 0;
        this.front = 0;
        this.back = 0;
    }
    public queueClass(){
        initializeVariables(10); 
    }

    public queueClass(int size){
        initializeVariables(size);
    }

    // Basic Functions . ==================================================================

    public int size(){
        return this.elementCount;
    }

    public boolean isEmpty(){
        return this.elementCount == 0 ;
    }

    // public String display(){
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("[");
    //     for(int i = 0 ; i < this.elementCount ; i++){
    //         int idx = (this.front + i) % this.capacity;
    //         sb.append(this.arr[idx]);
    //         if (i != this.elementCount - 1)
    //         sb.append(", ");
    //     }
    //     sb.append("]");
    //     return sb.toString();
    // }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.elementCount; i++) {
            int idx = (this.front + i) % this.capacity;
            sb.append(this.arr[idx]);
            if (i != this.elementCount - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    
    //  Exceptions . =======================================================================

    private void OverflowException() throws Exception{
        if(this.capacity == this.elementCount)
            throw new Exception("QueueIsFull");
    }

    private void underFlowException() throws Exception{
        if(this.elementCount == 0)
            throw new Exception("StackIsEmpty");
    }

    // Queue functions. =======================================================================

    protected void push_(int data) {
       this.arr[this.back] = data;
       this.elementCount++;
       this.back = (this.back + 1) % this.capacity;
    }

    public void push(int data) throws Exception {
        OverflowException();
        push_(data);
    }

    public int front() throws Exception {
        underFlowException();
        return this.arr[this.front];
    }

    protected int pop_(){
        int rv = this.arr[this.front];
        this.arr[this.front] = 0;
        this.elementCount--;
        this.front = (this.front +1) %capacity;
        return rv;
    }

    public int pop() throws Exception{
        underFlowException();
        return pop_();
    }
}