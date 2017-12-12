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
        String searchGirl = args[1];


        ArrayList<String> boyNames = new ArrayList<>();
        ArrayList<String> girlNames = new ArrayList<>();

        String boyPath = "./boynames.txt";
        String girlPath = "./girlnames.txt";


        /// mission: take data from file and stick it in a String

        FileReader boyFile = new FileReader(boyPath);
        BufferedReader boyBufferReader = new BufferedReader(boyFile);
        String boyLine = boyBufferReader.readLine();

        FileReader girlFile = new FileReader(girlPath);
        BufferedReader girlBufferReader = new BufferedReader(girlFile);
        String girlLine = girlBufferReader.readLine();

        int lineNo  = 1;
        while (boyLine  != null && girlLine != null){
            boyNames.add(boyLine);
            girlNames.add(girlLine);
            lineNo++;
            boyLine = boyBufferReader.readLine();
            girlLine = girlBufferReader.readLine();
        }

        String searchName = findMatch(boyNames, searchBoy);
        System.out.println();
        System.out.println("Boy name searching for is: " + searchName);

        String searchName1 = findMatch(girlNames, searchGirl);

        System.out.println("Girl name searching for is: " + searchName1);

        String[] words = searchName.split(" ");
        Integer timesNameUsed = Integer.parseInt(words[1]);

        String[] words1 = searchName1.split(" ");
        Integer timesNameUsed1 = Integer.parseInt(words1[1]);

        Integer ranking = findRanking(boyNames, searchBoy);
        //Integer ranking1 = findRanking(girlNames, searchGirl);

        System.out.println();
        System.out.println(searchBoy + " is ranked " + ranking + " in popularity among boys with " + timesNameUsed + " namings");
        System.out.println();
        System.out.println(searchGirl + " is ranked " + findRanking(girlNames, searchGirl) + " in popularity among girls with " + timesNameUsed1 + " namings");
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