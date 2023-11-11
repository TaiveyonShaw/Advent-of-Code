import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class day2_2 {                       
    public static void main(String[] args) {
        char opp;
        char player;
        int count = 0;
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                opp = data.charAt(0);
                player = data.charAt(2);
                if (opp == 'A') {
                    if (player == 'X') {
                        count += 3;
                    }
                    else if (player == 'Y') {
                        count += 4;
                    }
                    else if (player == 'Z') {
                        count += 8;
                    }
                }
                else if (opp == 'B') {
                    if (player == 'X') {
                        count += 1;
                    }
                    else if (player == 'Y') {
                        count += 5;
                    }
                    else if (player == 'Z') {
                        count += 9;
                    }
                }
                else if (opp == 'C') {
                    if (player == 'X') {
                        count += 2;
                    }
                    else if (player == 'Y') {
                        count += 6;
                    }
                    else if (player == 'Z') {
                        count += 7;
                    }
                }
            }
            System.out.println(count);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
