import java.util.LinkedList;
import java.util.jar.Attributes.Name;

public class linkedlist {
    public static void main(String[] args) {
        

        LinkedList<String> Name= new LinkedList<String>();
        Name.add("A");
        Name.add("B");
        
        Name.addFirst("SHYAM");
        Name.addLast("SHYAMA");
        Name.add(3,"c");
        Name.removeFirst();
        Name.removeLast();
        for(String str:Name){
            System.out.println(str);
        }
    }
    
}
