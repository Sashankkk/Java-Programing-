import java.util.Iterator;
import java.util.TreeSet;
public class treeset {
public static void main(String[] args) {
    TreeSet<Integer> obj = new TreeSet<>();
    obj.add(1); 
    obj.add(2); 
    obj.add(3); 
    obj.add(4); 
    obj.add(5); 
    System.out.println(obj);
    obj.remove(1);
    
    Iterator <Integer> it= obj.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+",");
    } 
   System.out.println("First is" + obj.first());
   System.out.println("last is" + obj.last());
   System.out.println("deleted is " + obj.pollFirst());

   System.out.println("deleted is " + obj.pollLast());
   System.out.println(obj);
}    
}
