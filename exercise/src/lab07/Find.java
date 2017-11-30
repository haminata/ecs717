package lab07;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 * Created by haminata on 28/11/2017.
 */
public class Find {
    public static void main(String[] args) throws Exception {
       String searchTerm = args[0];
        String fileName = args[1];

        FileReader file1 = new FileReader("./exercise/src/lab07/" + fileName);
        BufferedReader bReader = new BufferedReader(file1);

        String line = bReader.readLine();
        int lineNo  = 1;

        while (line != null) {
            if(line.contains(searchTerm)){
                System.out.println(fileName + ":" + lineNo + " " + line.trim()); // trim remove whitespaces in front and after
            }
            lineNo++;
            line = bReader.readLine();
        }


    }
}

