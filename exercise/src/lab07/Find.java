package lab07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by haminata on 28/11/2017.
 */
public class Find {
    public static void main(String[] args) throws Exception {
       String searchTerm = (args[0]);
        String fileName = (args[1]);

        FileReader file1 = new FileReader("./exercise/src/lab07/" + fileName);
        BufferedReader bReader = new BufferedReader(file1);

        String line = bReader.readLine();
        int lineNo  = 0;

        while (line != null) {
            if(line.contains(searchTerm)){
                System.out.println(fileName + ":" + lineNo + " " + line.trim());
            }
            lineNo++;
            line = bReader.readLine();
        }


    }
}

