import edu.princeton.cs.algs4.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parentheses {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        System.out.println(checkInput(input));
    }

    private static Boolean checkInput(String input) {
        char[] chars = input.toCharArray();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(']', '[');
        pairs.put('}', '{');
        pairs.put(')', '(');

        Stack<Character> brackets = new Stack<>();
        for (Character c : chars) {
            switch (c) {
                case '[', '{', '(' -> brackets.push(c);
                case ']', '}', ')' -> {
                    if (brackets.isEmpty()) {
                        return false;
                    }
                    char currentBracket = brackets.pop();
                    if (currentBracket != pairs.get(c)) return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
