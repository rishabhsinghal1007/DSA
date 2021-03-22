public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
    Node c1 = l1.head;
    Node c2 = l2.head;
    
    LinkedList ans = new LinkedList();
    while(c1 != null && c2 != null){
       if(c1.data < c2.data){
           ans.addLast(c1.data);
           c1 = c1.next;
       }else{
           ans.addLast(c2.data);
           c2 = c2.next;
       }
    } 
    while(c1 != null){
           ans.addLast(c1.data);
           c1 = c1.next;
    }  
     while(c2 != null){
           ans.addLast(c2.data);
           c2 = c2.next;
    }
    return ans;
}