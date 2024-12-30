import java.util.Scanner;
public class switchs {
    public static void main(String[] args) {
    
    int a=10,b=56,ch;
    System.out.println("Enter the value");
    Scanner sc= new Scanner(System.in);
    ch=sc.nextInt();
        
        switch (ch) {
            case 1:System.out.println("Sum " + ( a + b ));
                
            break;

            case 2:System.out.println("Sub " + (a-b));
            break;

            case 3:System.out.println("mul" + (a*b));
            break;

            case 4:System.out.println("div" + (a/b));
            break;

            default:System.out.println("rem" + (a%b));
      }







    }
    
}
