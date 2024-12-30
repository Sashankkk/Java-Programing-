import java.util.ArrayList;;
class arraylist{

    public static void main(String[] args) {
        
    

    ArrayList<String> Name = new ArrayList<String>();
    Name.add("Sashank");
    Name.add("Sasha");
    Name.add("Sash");

    System.out.println(Name);
    Name.add("Pandey");
    System.out.println(Name);
    Name.add(1,"Pandey");
    System.out.println(Name);
    Name.add(0,"Ram");
    System.out.println(Name);

    Name.remove(1);
    System.out.println(Name);

    Name.set(1, "Shyam"); //replace
    System.out.println(Name.get(1));
    Name.clear();
    System.out.println(Name);
    }
}