import java.util.HashMap;

public class basic{

     public static void name() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Nepal",23);
        map.put("UK",45);
        map.put("GERMANY",35);
        map.put("USA",20);
        map.put("RUSSIA",10);
        map.put("USA" , 5);

        // System.out.println(map); 
        
        for(String keys : map.keySet()){ 
            System.out.println(keys + " -> " + map.get(keys));
        }

        String key = "USa";
        if (map.containsKey(key))
            System.out.println(map.get(key));
        else
            System.out.println("not Found");

    }

    public static void main(String[] args){
        name();
    }
}
