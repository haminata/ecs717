package lab05;

public class ArrayTest {
    public static void main (String [] args){
        String [] info = new String[3];
        info[0] = "Haminata";
        info[1] = "Female";
        info[2] = "haminata@gmail.com";

        for(int i = 0; i < info.length; i++){
            System.out.println(info[i]);
        }
    }
}
