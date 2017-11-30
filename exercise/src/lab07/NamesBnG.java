package lab07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by haminata on 29/11/2017.
 */
public class NamesBnG {

    public static void main(String[] args) throws Exception{
        String searchBoy = args[0];
        //String searchGirl = args[1];


        ArrayList<String> boyNames = new ArrayList<>();
        ArrayList<String> girlNames = new ArrayList<>();

        /*
         * define path of the file and give it a name
         * create new FileReader and then insert the path in order to find the file
          *
         */
        String path = "./exercise/src/lab07/boynames.txt";
        System.out.println("Path of boyFile is: " + path);
        FileReader boyFile = new FileReader(path);

        /*
         * create bufferedReader to read by line of the file
         * the readLine method allows you to read by line of the file
         */
        BufferedReader boyBufferReader = new BufferedReader(boyFile);
        String line = boyBufferReader.readLine();



        //FileReader girlFile = new FileReader("./" + girlNames);

        /*
         * Adds everything to arrayList
         * Create a while loop to:
         * 1: every time the buffered read a line it would add the line to the array list
         * 2: assign lineNo so that it counts the lines until it reaches he end of the line
         * 3: assign line again so that when it reaches the end of the loop it will change the value
         */
        int lineNo  = 1;
        while (line != null){
            boyNames.add(line);
            System.out.println("Reads the boy file: " + line);
            lineNo++;
            line = boyBufferReader.readLine();
        }

        //System.out.println("Inside ArrayList: " + boyNames); // to know what it is inside the array
        //System.out.println("Name searching for is: " + searchBoy); //search is the args[0]

        String searchName = findMatch(boyNames, searchBoy);
        System.out.println("Name searching for is: " + searchName);

        /*
         * Search through the array to look for match
         */

    }

        //this method is not complete
        public static String findMatch(ArrayList<String> arrayS, String search){
            for (int i = 0; i < arrayS.size(); i++) {
                String name1 = arrayS.get(i);
                if (name1.startsWith(search)){
                    return search;


                }
            }
             return null;
        }

}









