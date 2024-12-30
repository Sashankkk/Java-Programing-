import java.util.Scanner;
public class relational {
public static void main(String[] args) {
    int a , b;
    System.out.println("Input the Value");
    Scanner sc = new Scanner(System.in);
    a= sc.nextInt();
    b= sc.nextInt();
    System.out.println("TRUE/FALSE"+(a<b));
    System.out.println("TRUE/FALSE"+(a>b));
    System.out.println("TRUE/FALSE"+(a<=b));
    System.out.println("TRUE/FALSE"+(a>=b));
    System.out.println("TRUE/FALSE"+(a!=b));
    System.out.println("TRUE/FALSE"+(a==b));
}
    
}
