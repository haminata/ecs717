package lab03;

/**
 * created by Haminata
 */
public class Counter {
    private int count;
    private int max;

    public Counter(){
        this.count = 0;
        this.max = 10;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public void setCount(int n) {
        this.count = n;
    }

    public void setMax(int n) {
        this.max = n;
    }

    public void increase(){
        count = count + 1;
        if (count >= max){
            reset();

        }
    }

    public void decrease(){

        if (count > 0) {
            count = count - 1;
        }
    }

    public void reset(){
        count = 0;
        System.out.println("Counter Reset!");
    }

    public void increase(int n){
        count = count + n;
    }

    public void decrease(int n){
        count = count - n;
    }




   public String toString(){
        return "current count: " + count + "\n current max: " + max;
    }

}
