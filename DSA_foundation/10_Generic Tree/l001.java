import java.util.ArrayList;

public class l001{
    public static class Node{
        int size = 0;
        ArrayList<Node> childs = new ArrayList<>();

        Node(int data){
            this.data = data;
        }
    }

    public static int size(Node node){
        int sz = 0;
        for(Node child : node.childs){
            sz += size(child);
        }
        return sz + 1;
    }

    public static int height(Node node){
        int h = -1;
        for(Node child : node.childs){
            h = Math.max(h,height(child));
        }
        return h + 1;
    }

    public static int maximum(Node node) {
        int maxEle = -(int) 1e8;
        for(Node child : node.childs){
            maxEle = Math.max(maxEle,maximum(child));
        }
        return Math.max(maxEle,node.data);
      }

    public static int minimum(Node node) {
    int minEle = (int) 1e8;
    for(Node child : node.childs){
        minEle = Math.min(minEle,minimum(child));
    }
    return Math.max(minEle,node.data);
    }

    public static boolean findData(Node node , int data){
        boolean res = node.data == data;
        for(Node child : node.childs){
            res = res || findData(child,data)
        }
        return res;
    }

    public static boolean nodeToRootPath(Node node , int data , ArrayList<Node> ans){
        boolean res = node.data == data ;
        for(Node child : node.childs){
            res = res || findData(child , data)
        }
        if(res)
            ans.add(node);

        return res;
    }

    //  2nd method to find nodeToRootPath ....................................................

    public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        if(node.data == data){
            ArrayList path = new ArrayList<>();
            path.add(node.data);
            return path;
        }
        for(Node child : node.children){
            ArrayList ptc = nodeToRootPath(child,data);
            if(ptc.size() > 0){
                ptc.add(node.data);
                return ptc;
            }
        }
        return new ArrayList<>();
     }
..................................................................................................

    public static Node getTail(Node node){
        Node curr = node;
        while(curr.childs.size() != 0){
            curr = curr.childs.get(0);
        }
        return curr;
    }
   
    public static void linearize(Node node){
      for(Node child : node.childs){
          linearize(child);
      }
      for(int i = node.childs.size()-2 ; i>=0 ; i--){
          Node tail = getTail(node.childs.get(i));
          tail.childs.add(node.childs.get(i+1));
          node.childs.remove(i+1);        
      }
    }
}