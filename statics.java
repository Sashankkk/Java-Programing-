class Emp{
    static int salary;
    int eid;
    String ceo;

    public Emp(){
        eid=1;
        ceo="ramesh";
    }
    
    void Emps(){
        eid=2;
        ceo="suresh";
    }
    static{
        salary=25000;
        System.out.println("in static");
    }

    public void show(){
        System.out.println(eid+ " " + salary+ " "+ ceo);
    }
}
public class statics {


    public static void main(String[] args) {
        Emp Sashank = new Emp();
        Sashank.show();


   
        

    }
}
