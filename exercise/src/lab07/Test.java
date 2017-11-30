package lab07;

import java.util.ArrayList;

/**
 * Created by haminata on 30/11/2017.
 */
public class Test {
    public static void main(String[] args) {


        ArrayList<Integer> test1 =  new ArrayList<>();
        test1.add(5);
        test1.add(4);
        test1.add(64);
        test1.add(94);
        test1.add(84);

        ArrayList<String> test2 = new ArrayList<>();
        test2.add("Hello World");
        test2.add("Obialo");
        test2.add("Gog");
        test2.add("Play");
        test2.add("John 99886");

        Integer result1 = findIndex(test2, "John");
        Integer result = findNumber(test1, 64);
        System.out.println("Index is: " + result1);

        //System.out.println("Index of 60 in test1 is: " + result);

    }
    public static Integer findIndex(ArrayList<String> arrayS, String indexString){
        for (int i = 0; i < arrayS.size(); i++) {
            String value1 = arrayS.get(i);
            if (value1.startsWith(indexString)){
                return i;
            }

        }
        return null;

    }

    public static Integer findNumber(ArrayList<Integer> arrayList, int numberIndex){

        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i); //array at index i

            if(value == numberIndex){ //
                return i;
            }

        }
        return null;
    }

}
