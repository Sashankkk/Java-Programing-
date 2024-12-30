class A{
    int a;
    String b;
    boolean c;
    A(){
        a=100;
        b="sashank";
        c=true;
    }
    void disp(){
        System.out.println(a+"" +b+""+c);
    }
}


    public class defaultconst{
        public static void main(String[] args) {
            A obj=new A(); //default
            obj.disp();
        }
    }
