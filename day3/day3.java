import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.HashMap;
import java.util.Map;

public class day3 {
    public static void main(String[] args) {
        // try
        try {
            // initialize variables
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            int t = 0;
            char common = 'a';

            // iterate through each line
            while (myReader.hasNextLine()) {
                
                // Initialize variables
                String data = myReader.nextLine();
                String firsthalf = data.substring(0, data.length()/2);
                String secondhalf = data.substring(data.length()/2);

                // Find common letters in firsthalf and secondhalf
                for (int i = 0; i < firsthalf.length(); i++) {
                    for (int j = 0; j < secondhalf.length(); j++) {
                        if (firsthalf.charAt(i) == secondhalf.charAt(j)) {
                            common = firsthalf.charAt(i);
                        }
                    }
                }
                
                // Sum up letters
                if (Character.isUpperCase(common)) {
                    t += common - 'A' + 27;
                } else {
                    t += common - 'a' + 1;
                }
            } 
            // close
            myReader.close();
            
            // print result
            System.out.println(t);

        // catch error
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
