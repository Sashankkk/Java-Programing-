class A{
    int a;
    String b;


    A(){
        a=10;
        b="Sashank";
        System.out.println(a+ " " +b);
    }


    A(A obj){
        a=obj.a;
        b=obj.b;
        System.out.println(a+ " " +b);
    }
}


class copyconst{
    public static void main(String[] args) {
        A obj = new A();
        A obj2 = new A();
    }
}
