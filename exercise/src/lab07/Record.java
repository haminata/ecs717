package lab07;


import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by haminata on 02/12/2017.
 */
public class Record  {
    String boyName;
    String boyOccurrences;

    public Record(String bName, String bOccurrences){
        this.boyName = bName;
        this.boyOccurrences = bOccurrences;
    }

    public static String  readFile() throws Exception {
        String path = "./exercise/src/lab07/boynames.txt";
        FileReader boyFile = new FileReader(path);
        BufferedReader boyBufferReader = new BufferedReader(boyFile);
        String line = boyBufferReader.readLine();
        StringBuilder text = new StringBuilder();


        int lineNo = 1;
        while (line != null) {
            lineNo++;
            line = boyBufferReader.readLine();
            text.append(line);
        }
        return text.toString();

    }










}
