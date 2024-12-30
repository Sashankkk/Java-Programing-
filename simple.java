class student{
    int marks; int roll; String name;
    void enter(){
        System.out.println("Enter the name,roll and marks");
    }
}
public class simple extends student{
    void disp(){
        marks=78;
        roll=1;
        name="Sashank";
        System.out.println(marks + " " +roll+ " "+name);
}

public static void main(String[] args) {
    simple obj = new simple();
    obj.enter();
    obj.disp();
   
}
}