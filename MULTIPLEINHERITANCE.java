interface A{
    void show(); //public and abstract
}
interface B{
    void show();//public and abstract
}
public class MULTIPLEINHERITANCE implements A,B{
    public void show(){
        System.out.println("Sashank");
    }
    public static void main(String[] args) {
        MULTIPLEINHERITANCE obj= new MULTIPLEINHERITANCE();
        obj.show();
    }
    
}
