import java.util.Scanner;

public class logical {
    public static void main(String[] args) 
    
    {

      System.out.println("LOGICAL AND");  //both operation should be true
       System.out.println((10>5) && (5>2));
       System.out.println((10<5) && (5<2));
       System.out.println((10>5) && (5<2));

       System.out.println("----------------------------");

       System.out.println("logical OR");  //only one operation can be true
       System.out.println((10>5) || (5>2));
       System.out.println((10<5) || (5<2));
       System.out.println((10>5) || (5<2));

       
      System.out.println("----------------------------");

      System.out.println("logical not");  //reverse the result
      System.out.println(!(10>5));
      System.out.println(!(10<5));
    
    
       
    }
    
}
