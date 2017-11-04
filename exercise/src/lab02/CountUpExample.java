package lab02;

/**
 * Created by haminata on 04/11/2017.
 *
 * This is my first properly documented piece java code.
 * When the javadoc tool is run over this code, it will create an HTML maintenance manual.
 *
 */
public class CountUpExample {

    /**
     * This method counts up from a specified number
     * to five. It will print its progress to the
     * command line.
     * @param count number to count from
     */
    public void countUp(int count) {
        for (int i = count; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("\nAll done!");
    }


    public static void main (String [] args) {
        CountUpExample u = new CountUpExample();
        u.countUp(0);
    }
}
