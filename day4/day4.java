import java.io.*;
import java.util.*;

public class day4 {
    public static void main(String[] args) throws Exception {
         // initialize variables
        File file = new File("input.txt");
        Scanner myReader = new Scanner(file);

        // Iterate through input
        while (myReader.hasNextLine()) {

            // Initialize variables
            String data = myReader.nextLine();
            int comma = data.indexOf(",");
            String first = data.substring(0, comma);
            String second = data.substring(comma+1, data.length());
            if (first )
        }
    }
}