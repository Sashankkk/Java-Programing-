interface Ab{
    void add();
}
interface Cd extends Ab{
    void sub();
}
class ef implements Cd{
    public void add(){
        int a=10,b=5,c;
        c=a+b;
        System.out.println("add" + c);
    }

    public void sub(){
        int a=10,b=5,c;
        c=a-b;
        System.out.println("sub" +c);
    }

}
public class interfaceextending { //using inheritance in interface
    public static void main(String[] args) {
        Cd obj = new ef();
        obj.add();
        obj.sub();
    }
    
}
