public class 1001{
    public static class Node{
        int data = 0;
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
    }

    public static Node constructTree(int[] arr , int si , int ei){
        if(si>ei)
            return null;

        int mid = (si+ei) /2;
        Node node = new Node(arr[mid]);

        node left = constructTree(arr,si,mid-1);
        node right = constructTree(arr,mid+1,ei);

        return node;
    }

    public static Node constructTree(int[] arr){
        return constructTree(arr,0,arr.length-1);
    }

    public static int size(Node node){
        if(node == null)
            return 0;

        int left = size(node.left);
        int right = size(node.right);

        return left + right + 1;
    }

    public static int height(Node node){
        if(node == null)
            return -1;

        int leftHeight = size(node.left);
        int rightHeight = size(node.right);

        return Math.max(leftHeight, rightHeight) + 1 ;
    }

    public static int maximum(Node node) {
        Node curr = node;
        while (curr.right != null) {
            curr = curr.right;
        }

        return curr.data;
    }
    
    public static int minimum(Node node) {
        Node curr = node;
        while (curr.left != null) {
            curr = curr.left;
        }

        return curr.data;
    }

    public static boolean find(Node node, int data) {
        Node curr = node;

        while (curr != null) {
            if (curr.data == data)
                return true;
            else if (curr.data < data)
                curr = curr.right;
            else
                curr = curr.left;
        }

        return false;
    }


    public static int sum(Node node) {
        if(node == null)
            return 0;
            
        int leftSum = sum(node.left);
        int rightSum = sum(node.right);
    
        return leftSum + node.data + rightSum ;
    }

    public static boolean find(Node node, int data){
        Node curr = node;
        while(curr != null){
            if(curr.data == data)
                return true;
            else if(curr.data > data)
                curr = curr.left;
            else
                curr = curr.right;
        }
        return false;
    }  

    public static Node add(Node node, int data) {
        if(node == null)
            return new Node(data);
        
        if(node.data < data)
            node.right = add(node.right,data);
        else if(node.data > data)
            node.left = add(node.left,data);
        else 
            return node;
        return node;
    }

    public static Node LCA(Node node , int d1 , int d2) {
        Node curr = node;
        while (curr != null) {
            if(d1 > curr.data && d2 > curr.data)
                curr = curr.right;
            else if(d1 < curr.data && d2 < curr.data)       
                curr = curr.left;
            else
                return (find(curr,d1) && find(curr,d2)) ? curr : null;
        }
        return null;
    }

    public static Node removeNode(Node node, int data) {
        if (node == null)
            return null;
    
        if (node.data < data)
            node.right = removeNode(node.right, data);
        else if (node.data > data)
            node.left = removeNode(node.left, data);
        else {
            if(node.left == null && node.right==null)
                return null;
            else if(node.left==null)
                return node.right;
            else if(node.right==null)
                return node.left;
            else{
                int maxData = maximum(node.left);
                node.data = maxData;
                node.left = removeNode(node.left, maxData);
            }
        }
    
        return node;
    }
}