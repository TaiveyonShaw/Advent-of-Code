import java.io.*;
import java.util.*;

public class day4_2 {
    public static void main(String[] args) throws Exception {

         // initialize variables
        File file = new File("input.txt");
        Scanner myReader = new Scanner(file);
        int iter = 0;

        // Iterate through input
        while (myReader.hasNextLine()) {

            // Initialize variables
            String data = myReader.nextLine();
            int comma = data.indexOf(",");

            // Split data into two
            String firsthalf = data.substring(0, comma);
            String secondhalf = data.substring(comma+1, data.length());

            // Get first and second values from first half
            int first = Integer.parseInt(firsthalf.substring(0, firsthalf.indexOf("-")));
            int second = Integer.parseInt(firsthalf.substring(firsthalf.indexOf("-")+1, firsthalf.length()));

            // Get first and second values from second half
            int sfirst = Integer.parseInt(secondhalf.substring(0, secondhalf.indexOf("-")));
            int ssecond = Integer.parseInt(secondhalf.substring(secondhalf.indexOf("-")+1, secondhalf.length()));
            
            // Check if first half is within second half and vice versa
            if ((first <= sfirst && second >= ssecond) 
            || (first >= sfirst && second <= ssecond) 
            || (first <= sfirst && second <= sfirst)
            || (first <= ssecond && second <= ssecond)) {
                iter++;
            }
        }

        // Print
        System.out.println(iter);
    }
}