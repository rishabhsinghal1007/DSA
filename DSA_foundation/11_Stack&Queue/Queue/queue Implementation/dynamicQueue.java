public class dynamicQueue extends queueClass{

    public dynamicQueue(){
        super();
    }

    public dynamicQueue(int size){
        super(size);
    }
   
    public dynamicQueue(int[] arr){
        super(2 * arr.length);
        for(int ele : arr){
            super.push_(ele);
        }
    }

    @Override
    public void push(int data) throws Exception{
        if(super.capacity == super.elementCount){
            int[] temp = new int[super.capacity];
            
            for(int i = 0 ; i < super.capacity ; i++){
                int idx = (super.front + i) % super.capacity;
                temp[i] = super.arr[idx];
            }

            super.initializeVariables(2 * super.capacity);
            for (int ele : temp)
            super.push_(ele);
        }
        super.push_(data);
    }
}