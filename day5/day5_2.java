import java.io.*;
import java.util.*;

public class day5_2 {
    public static void main(String[] args) throws Exception {
            
        // initialize variables
        File file = new File("input.txt");
        Scanner myReader = new Scanner(file);
        Deque<Character> deque = new ArrayDeque<>();
        HashMap<Integer, Deque<Character>> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        String result = "";
        int iter = 1;

        // Initialize Crates
        while (myReader.hasNextLine()) {

            // Initialize
            String data = myReader.nextLine();
            // Break
            if (data.equals("")) {
                break;
            }

            // initializing Stacks
            for (int i = 1; i <= 33; i += 4) {
                char curr = data.charAt(i);

                    // Find letter
                    if (Character.isLetter(curr)) {
                        deque = map.get(iter);

                        // Initialize deque
                        deque = (deque == null) ? new ArrayDeque<>() : deque;
                        deque.add(curr);
                        map.put(iter, deque);
                }
                iter = (iter == 9) ? 0 : iter;
                iter++;
            }
        }
        
        while (myReader.hasNextLine()) { 
            // Initialize
            String data = myReader.nextLine();
            int amount = Integer.parseInt(data.substring(5,7).trim());
            int movefrom = Integer.parseInt(data.substring(12, 14).trim());
            int moveto = Integer.parseInt(data.substring(17).trim());

            // Move crates
            for (int i = 0; i < amount; i++) {
                char curr = map.get(movefrom).removeFirst();
                stack.push(curr);
            }
            for (int i = 0; i < amount; i++) {
                char curr = stack.pop();
                map.get(moveto).addFirst(curr);
            }
        }

        // Append and print
        for (int i = 1; i <= 9; i++) {
            result += map.get(i).removeFirst();
        }
        
        System.out.println(result);
        myReader.close();
    }
}