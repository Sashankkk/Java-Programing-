class A{
    private int value;

    public void setValue(int x){
        value=x;
    }
    public int getValue(){
        return ++value;
    }
}

public class encpasulation {
    public static void main(String[] args) {
        A obj = new A();
        obj.setValue(101);
        System.out.println(obj.getValue());
    }
}
