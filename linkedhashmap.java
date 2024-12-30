import java.util.*;;
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap <Integer,String> obj = new LinkedHashMap<>();
        obj.put(1, "Ram");
        obj.put(2, "Rajat");
        obj.put(3, "Sita");
        obj.put(4, "Devi");
        obj.put(5, "Krishna");
        obj.put(4, "Durga");
        System.out.println(obj);

 
        System.out.println(obj.get(100));

        for(Integer itrv: obj.keySet()){
            System.out.println(obj.get(itrv));
        }

        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj.values());
        System.out.println(obj.containsKey(1));
        System.out.println(obj.containsValue("Ram"));

    }
}
