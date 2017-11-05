package lab03;

/**
 * created by Haminata
 */
public class CounterTest {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        count1.setCount(6);

        System.out.println("Current count is " + count1.getCount());
        System.out.println("Current max is " + count1.getMax());

        count1.increase();
        System.out.println(count1);

        count1.decrease();
        System.out.println(count1);

        count1.reset();
        System.out.println(count1);

        // Start of the

    }
}
