import edu.princeton.cs.algs4.Stack;

public class Exercise {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("1.3.3-a-------");
        for (int i = 0; i <= 4; i++) {
            stack.push(i);
        }
        for (int i = 0; i <= 4; i++) {
            System.out.print(stack.pop() + " ");
        }
        for (int i = 5; i <= 9; i++) {
            stack.push(i);
        }
        for (int i = 5; i <= 9; i++) {
            System.out.print(stack.pop() + " ");
        }

        // б - неправильный
        // в - правильный
        // г - правильный
        // д - правильный
        // е - неправильный
        // ж - неправильный
        // з - правильный

        System.out.println("1.3.");

    }
}
