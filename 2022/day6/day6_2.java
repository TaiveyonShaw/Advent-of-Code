import java.io.*;
import java.util.*;

public class day6_2 {
    public static void main(String[] args) throws Exception {
            
        // initialize variables
        File file = new File("input.txt");
        Scanner myReader = new Scanner(file);
        boolean again = true;
        boolean br = false;
        String substr = "";
        int iter = 13;

        // Loop through every 4 sets
        String str = myReader.nextLine();

        // 4 letters
        for (int i = 0; again; i++) { 
            iter++;
            substr = str.substring(i, i+14);
            char[] strarr = substr.toCharArray();

            // Compare
            // How can we make it so it only iterates through the characters that's after the current one?
            for (int j = 0; j < 14; j++) {
                for (int k = j + 1; k <= 13; k++) {
                    if (strarr[j] == strarr[k]) {
                        br = true;
                        break;
                    }
                }
                if (br) {
                    break;
                }
            }
            if (br) {
                br = false;
                continue;
            }
            again = false;
        }
        System.out.println(substr);
        System.out.println(iter);
    }
}