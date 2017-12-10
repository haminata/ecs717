package lab07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
/**
 * Created by haminata on 29/11/2017.
 */
public class NamesBnG {

    public static boolean findMatch(ArrayList<String> arrayS, String search, String listType){
        boolean found = false;
        for (int i = 0; i < arrayS.size(); i++) {
            String completeName = arrayS.get(i);
            if (completeName.contains(search)){
                found = true;
                String[] line = completeName.split(" ");
                System.out.println();
                System.out.println(line[0] + " is ranked " + (i+1) + " in popularity among boys with " + line[1] + " namings.");
            }
        }
        if(!found){
            System.out.println();
            System.out.println(search + " is not ranked among the top 1000 " +  listType + " names.");
        }

        return found;

    }

    public static void main(String[] args) throws Exception{
        String nameSearch = args[0];

        ArrayList<String> boyNames = new ArrayList<>();
        ArrayList<String> girlNames = new ArrayList<>();

        try{
            String boyPath = "./boynames.txt";
            String girlPath = "./girlnames.txt";

            FileReader boyFile = new FileReader(boyPath);
            BufferedReader boyBufferReader = new BufferedReader(boyFile);
            FileReader girlFile = new FileReader(girlPath);
            BufferedReader girlBufferReader = new BufferedReader(girlFile);

            String boyLine = boyBufferReader.readLine();
            String girlLine = girlBufferReader.readLine();

            int lineNo  = 0;
            while (boyLine  != null && girlLine != null){
                boyNames.add(boyLine);
                girlNames.add(girlLine);
                lineNo++;
                boyLine = boyBufferReader.readLine();
                girlLine = girlBufferReader.readLine();
            }
        }
        catch(IOException ex){

        }

        boolean boyNameFound = findMatch(boyNames, nameSearch, "boy");
        boolean girlsNameFound = findMatch(girlNames, nameSearch, "girl");

        if(!boyNameFound && !girlsNameFound){
            System.out.println();
            System.out.println(nameSearch + " is not in the files");
        }

    }

}