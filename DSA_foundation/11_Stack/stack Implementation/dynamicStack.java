public class dynamicStack extends stackClass{     
    
    public dynamicStack(){
        super();
        // this.capacity = 10;
        // initializeVariables();
    } 

    public dynamicStack(int size){
        super(size);
        // this.capacity = size;
        // super.initializeVariables();
    }
    // array provide kray aur array convert into stack ...
    public dynamicStack(int[] arr){
        super.capacity = arr.length;
        super.initializeVariables(arr.length);

        for(int ele : arr)
            super.push_(ele);
    }

    // protected void push_(int data){
    //     if(super.capacity == super.elementCount){ // check my stack is overflow or not
    //         int[] temp = super.arr; // copy all data
    //         super.initializeVariables(2 * super.capacity); // apne sare variable ko doubke size kr diya ,, arr ko double krdiya and
    //         for(int ele : temp)  // copy old data into new space
    //             super.push_(ele);
    //     }

    //     super.push_(data);   // add data jiski vjah se size overflow hua tha
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