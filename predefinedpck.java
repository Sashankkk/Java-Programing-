import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class predefinedpck {
public static void main(String[] args) {
    try{
        File obj = new File("C:\\Users\\sasha\\Desktop\\text.txt");

            Scanner sc= new Scanner(obj);
            while(sc.hasNextLine()){
                
                System.out.println(sc.nextLine());
            }
    }
    catch (IOException e){
        System.out.println("Handeled");
    }
}    
}
