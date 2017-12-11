package lab05;
import java.util.ArrayList;


public class ArrayLists {
    public static void main(String[] args){

        ArrayList <String> myList = new ArrayList <String>();
        myList.add("Haminata");
        myList.add("Female");
        myList.add("haminata@gmail.com");

        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
