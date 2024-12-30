import java.util.Vector;

public class vector{
    public static void main(String[] args) {
        Vector<String>obj= new Vector<>();
        obj.add("Ram");
        obj.add("Sita");
        obj.add("Krishna");
        obj.add("Radha");
        obj.add("Raman");

        System.out.println("The size of the vector is" + obj.size());

        //content

        System.out.println("Names are" + obj);
    
        //display one by one

        for(String num:obj){
            System.out.println(num);
        }

        obj.add(4,"Sashank");

        System.out.println(obj);
        System.out.println(obj.size());

    }


}