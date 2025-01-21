import java.util.Stack;

public class StackExample {

    // Method to create a stack and perform operations
    public static Stack<Integer> createStack() {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Display the stack
        System.out.println("Stack after pushes: " + stack);
        
        return stack;
    }
    
    public static void main(String[] args) {
        // Create and use the stack
        Stack<Integer> stack = createStack();

        // Pop an element
        System.out.println("Popped element: " + stack.pop());

        // Peek at the top element
        System.out.println("Top element after pop: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Display the final state of the stack
        System.out.println("Final Stack: " + stack);
    }
}
