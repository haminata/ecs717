package lab08;

public class PrintTask implements Runnable{
    private String printMe;
    private int times;

    public PrintTask(String printMe, int times){
        this.printMe = printMe;
        this.times = times;
    }

    public void run(){
        for(int i = 0; i < times; i++){
            System.out.print(printMe);
        }
    }
}