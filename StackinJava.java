import java.util.Stack;

public class StackinJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Stack: " + stack);

        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        System.out.println("Top Element: " + stack.peek());
        System.out.println("Is Stack Empty? " + stack.isEmpty());
        System.out.println("Size of Stack: " + stack.size());
    }
}
// methods of stack
// - push(): adds an element to the top of the stack.
// - pop(): removes and returns the element at the top of the stack 
// - peek(): returns the element at the top of the stack without removing it
// - isEmpty(): checks if the stack is empty or not
// - size(): returns the size of the stack