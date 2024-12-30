import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap <String, Integer> obj = new HashMap<>();
        obj.put("Nepal",25000);
        obj.put("India",15000);
        System.out.println(obj);

        if(obj.containsKey("Nepal")){
            System.out.println("Jay Nepal");

        }
        else{
            System.out.println("Null");
        }

        System.out.println(obj.get("India"));
        System.out.println(obj.get("Usa"));

        //print using iterator

        for(Map.Entry<String, Integer> e:obj.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = obj.keySet();
        for(String key:keys){
            System.out.println(key+ " " +obj.get(key));
        }

        obj.remove("India");
        System.out.println(obj);
    }
}
