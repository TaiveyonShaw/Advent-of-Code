import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class day1{
    public static void main(String[] args) {
        int total = 0;
        int first = 0;
        int second = 0;
        int third = 0;

        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();

              if (data.equals("")) {
                if (total > first) {
                    third = second;
                    second = first;
                    first = total;
                }
                else if (total > second) {
                    third = second;
                    second = total;
                }
                else if (total > third) {
                    third = total;
                }
                total = 0;
              }
              else {
                int num = Integer.parseInt(data);
                total += num;
              }
            }

            myReader.close();

            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(first + second + third);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}