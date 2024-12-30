public class compiletime {
int add(){
    int a=10;
    int b=20;
    int c;
    c=a+b;
    return c;
}
void add(int x, int y){
    int c;
    c=x+y;
    System.out.println(c);
}

void add(int x,double y){
    double c;
    c=x+y;
    System.out.println(c);
}
public static void main(String[] args) {
    compiletime obj = new compiletime();
    obj.add(100,200);
    obj.add(10,2.5);

    
    int add=obj.add();
    System.out.println(add);
}
}
