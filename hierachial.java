class A{
void input(){
    System.out.println("enter your name");
}
}
class B extends A{ 

    void show(){
        System.out.println("My name is Ram");
    }

}
class C extends A{
    void disp(){
        System.out.println("my name is shyam");
    }
}




public class hierachial {
public static void main(String[] args) {
    B obj = new B();
    C objs = new C();
    obj.input();
    obj.show();
    objs.input();
    objs.disp();

}    
}
