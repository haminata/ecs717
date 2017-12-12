package lab08;

public class ThreadTest {
    public static void main(String[] args){

        PrintTask a = new PrintTask("Thread A", 12);
        Thread a1 = new Thread(a);
        a1.start();

        PrintTask b = new PrintTask("Thread B", 10);
        Thread b1 = new Thread(b);
        b1.start();

        CountdownTask c = new CountdownTask(50);
        Thread c1 = new Thread(c);
        c1.start();


    }
}
