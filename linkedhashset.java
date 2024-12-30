import java.util.LinkedHashSet;
public class linkedhashset {
    public static void main(String[] args) {
        
    
    LinkedHashSet <Integer> obj = new LinkedHashSet<>();
    obj.add(1);
    obj.add(11);
    obj.add(111);
    obj.add(1111);
    obj.add(11111);
    obj.add(111111);
    obj.add(1111111);
    System.out.println(obj);
    if(obj.contains(11)){
        System.out.println("Cha");
    }
    if(!obj.contains(5)){
        System.out.println("Chaina");
    }
    obj.remove(1);
    System.out.println(obj);
}
}