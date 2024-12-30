class A implements Runnable {
    public void run(){
        
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread");
        }
 }
}

public class runnable {
    public static void main(String[] args) {
    A obj = new A();
    Thread t= new Thread(obj);
    t.start();

    for(int i=1;i<=5;i++){
        System.out.println("Main Thread");
    }

    

}
}