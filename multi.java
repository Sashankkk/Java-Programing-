class A{
    int a,b,c;
    void add(){
        a=10; b=20; 
        c=a+b;
        System.out.println("Sum is:"+ c);
    }
void sub(){
    a=25;
    b=20;
    c=a-b;
    System.out.println("Subtraction is:"+ c);
}}

class B extends A{
    void mul(){
        a=89;
        b=10;
        c=a*b;
        System.out.println("Multiplication is"+c);
    }
}

class C extends B{
    void div(){
        a=6;
        b=3;
        c=a/b;
        System.out.println("Division is"+ c);
    }
}
public class multi {
public static void main(String[] args) {
    C obj= new C();
    obj.add();
    obj.div();
    obj.mul();
    obj.sub();
}    
}
