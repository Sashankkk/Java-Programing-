import java.util.Scanner;
public class arithmetic{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();    
        b=sc.nextInt();
        System.out.println("Addition"+(a+b)); 
        System.out.println("Mul"+(a*b)); 
        System.out.println("Rem"+(a%b)); 
        System.out.println("Div"+(a/b)); 
        System.out.println("Sub"+(a-b)); 
    }
}