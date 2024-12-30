class A{
    void name()
    {
      System.out.println("Sashank Pandey");  
    }
}

class B extends A{
    @Override
    void name(){
        super.name();
        System.out.println("Developer");
    }
}
public class runtime {
public static void main(String[] args) {

    B obj = new B();
    obj.name();
}    
}
