package lab06;

public class JellyTest{

    public static void main(String args[]){

        RedJelly je1 = new RedJelly();
        je1.isAlive();
        System.out.println(je1);
        System.out.println("Is the jelly alive? " + je1.isAlive());

        BlueJelly je2 = new BlueJelly();
        je2.isAlive();
        System.out.println(je2);
        System.out.println("Is the jelly alive? " + je2.isAlive());
    }
}