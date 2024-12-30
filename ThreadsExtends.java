class A extends Thread{

public void run(){
    try{
        for(int i=1; i<=5; i++){
            System.out.println("Sashank Pandey");
            
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){

    }
    }
}
public class ThreadsExtends {
    
public static void main(String[] args) {
    A obj = new A();
    obj.start();

    for(int i=1; i<=5; i++){
        System.out.println("Kripalu Pandey");
        

    }
}



}