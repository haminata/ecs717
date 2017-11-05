package lab03;

/**
 * created by Haminata
 */
public class CounterTest {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        count1.setCount(6);
        count1.setMax(9);

        System.out.println("Current count is " + count1.getCount());
        System.out.println("Current max is " + count1.getMax());


        // Start of the counter increase test
        System.out.println();
        for (int i = 0; i <= 3; i++){
            count1.increase();
            System.out.println(count1);

        }

        // start of counter decrease test
        System.out.println();

        count1.setCount(3); // resetting count in preparation for test
        for (int i = 0; i <= 10; i++){
            count1.decrease();
            System.out.println(count1);

        }

    }
}
