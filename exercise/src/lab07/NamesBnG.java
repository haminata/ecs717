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


        String path = "./exercise/src/lab07/boynames.txt";
        System.out.println("Path of boyFile is: " + path);
        FileReader boyFile = new FileReader(path);


        BufferedReader boyBufferReader = new BufferedReader(boyFile);
        String line = boyBufferReader.readLine();


        int lineNo  = 1;
        while (line != null){
            boyNames.add(line);
            //System.out.println("Reads the boy file: " + line);
            lineNo++;
            line = boyBufferReader.readLine();
        }


        String searchName = findMatch(boyNames, searchBoy);
        System.out.println("Name searching for is: " + searchName);

        String[] words = searchName.split(" ");

        Integer timesNameUsed = Integer.parseInt(words[1]);


        Integer ranking = findRanking(boyNames, searchBoy);

        System.out.println(searchBoy + " is ranked " + ranking + " in popularity among boys with " + timesNameUsed);
    }


        public static String findMatch(ArrayList<String> arrayS, String search){
            for (int i = 0; i < arrayS.size(); i++) {
                String completeName = arrayS.get(i);
                if (completeName.startsWith(search)){
                    return completeName;

                }
            }
             return null;
        }

        public static Integer findRanking(ArrayList<String> ranking, String sName){
            for (int i = 0; i < ranking.size(); i++) {
                String namesRanking = ranking.get(i);
                if(namesRanking.startsWith(sName) )
                return i;
            }
            return null;
        }


}









