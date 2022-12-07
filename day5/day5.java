import java.io.*;
import java.util.*;

public class day5 {
    public static void main(String[] args) throws Exception {
            
        // initialize variables
        File file = new File("input.txt");
        Scanner myReader = new Scanner(file);
        Stack<Character[][]> stack = new Stack<>(); 

        for (int i = 0; i < 9; i++) {
            String data = myReader.nextLine();

            char one = data.charAt(1);
            char two = data.charAt(5);
            char three = data.charAt(9);
            char four = data.charAt(13);
            char five = data.charAt(17);
            char six = data.charAt(21);
            char seven = data.charAt(25);
            char eight = data.charAt(29);
            char nine = data.charAt(33);

            stack.push(new Character[][] {{one}, {two}, {three}, {four}, {five}, {six}, {seven}, {eight}, {nine}});
        }

        stack.forEach(System.out::println);

        while (myReader.hasNextLine()) { 
            
            // Initialize stacks
            String data = myReader.nextLine();

        }

    }
}