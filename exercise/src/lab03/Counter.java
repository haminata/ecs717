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
        this.count = this.count +1;

    }

    public void decrease(){
        this.count = this.count -1;
    }

    public void reset(){
       this.count = 0;
        System.out.println("Counter Reset!");
    }
   public String toString(){
        return ("Max value: " + this.max + ", " + "Count:" + count);
    }
     }
