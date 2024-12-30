class B {
    int a;
 String name;
    
    B(){
        a=1;
        name=null;
    }
    void show(){
        System.out.println(a+ ""+name);
    }
}
class constructor{
    public static void main(String[] args) {
        
    
    B obj = new B();
    obj.show();
}
}