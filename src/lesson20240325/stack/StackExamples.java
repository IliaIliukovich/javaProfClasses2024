package lesson20240325.stack;

import java.util.Stack;

public class StackExamples {

    public static void main(String[] args) {

        // LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int position = stack.search(7);

        System.out.println(position);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
