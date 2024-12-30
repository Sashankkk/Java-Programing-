import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet <Integer> obj = new HashSet<Integer>();

 //add
        obj.add(1);
        obj.add(2);
        obj.add(3);
        System.out.println(obj);

//search

        if(obj.contains(1)){
            System.out.println("Cha");
        }
        if(!obj.contains(5)){
            System.out.println("Chaina");
        }

        //delete

        obj.remove(3);
        System.out.println(obj);

        obj.remove(1);
        System.out.println(obj);


      System.out.println("The size is " + obj.size());

      obj.add(6);
      obj.add(9);
      System.out.println(obj);

      //iterator
    Iterator set = obj.iterator();
    while(set.hasNext()){
        System.out.println(set.next());
    }

        
    }


}
