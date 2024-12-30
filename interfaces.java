import java.util.Scanner;
interface client{
    void input();
    void output();
}
class interfaces implements client {
   String name;
   double salary;
   
   public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username");
  
    name=sc.nextLine();
    System.out.println("Enter Salary");
    
    salary=sc.nextDouble();
}
public void output(){
    System.out.println(name+" "+salary);
    }

    public static void main(String[] args) {
        client obj = new interfaces();
        obj.input();
        obj.output();
    }
}
