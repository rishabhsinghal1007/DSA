public class dynamicStack extends stackClass{     
    
    public dynamicStack(){
        super();
    } 

    public dynamicStack(int size){
        super(size);
    }

    public dynamicStack(int[] arr){
        super.capacity = arr.length;
        super.initializeVariables(2 * arr.length);

        for(int ele : arr)
            super.push_(ele);
    }
        // new function 
    // protected void push_(int data){
    //     if(super.capacity == super.elementCount){ // check my stack is overflow or not
    //         int[] temp = super.arr; // copy all data
    //         super.initializeVariables(2 * super.capacity); // apne sare variable ko doubke size kr diya ,, arr ko double krdiya and
    //         for(int ele : temp)  // copy old data into new space
    //             super.push_(ele);
    //     }

    //     super.push_(data);   
    // }

    // public void push(int data){
    //     push_(data);
    // }

    @Override
    public void push(int data) throws Exception{
        if (super.capacity == super.elementCount) {
            int[] temp = super.arr; // copy old data
            super.initializeVariables(2 * super.capacity); // new space allocate for new upcoming data.
            for (int ele : temp) // copy old data in new space.
                super.push_(ele);
        }

        super.push(data);
    }
}