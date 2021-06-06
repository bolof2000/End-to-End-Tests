package concepts;

public class Main {


    public static void main(String[] args){

        ImplementThreadUsingRunnableInterface obj = new ImplementThreadUsingRunnableInterface();
        Thread t1 = new Thread(obj);
        t1.setName("First");
        t1.start();

    }
}
