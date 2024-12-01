import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class day3_2 {
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
                String data1 = myReader.nextLine();
                String data2 = myReader.nextLine();
                String data3 = myReader.nextLine();

                // Find common letters in firsthalf and secondhalf
                for (int i = 0; i < data1.length(); i++) {
                    for (int j = 0; j < data2.length(); j++) {
                        for (int k = 0; k < data3.length(); k++) {
                            if (data1.charAt(i) == data2.charAt(j) && data2.charAt(j) == data3.charAt(k)) {
                                common = data1.charAt(i);
                            }
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
