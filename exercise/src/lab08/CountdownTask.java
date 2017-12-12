package lab08;

public class CountdownTask implements Runnable{
    private int countFrom;

    public CountdownTask(int countFrom){
        this.countFrom = countFrom;
    }
    public void run(){
        for(int i = countFrom; i > 0; --i){
            System.out.println("" + i);
        }
    }

}
