public class CustomStack {
    private int[] stack;   // Array to store stack elements
    private int top;       // Index of the top element in the stack
    private int capacity;  // Maximum capacity of the stack

    // Constructor to initialize the stack
    public CustomStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot add element: " + element);
            return;
        }
        stack[++top] = element;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1; // Returning -1 to indicate error
        }
        return stack[top--];
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1; // Returning -1 to indicate error
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing the stack implementation
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element
        System.out.println("Popped element: " + stack.pop());
        stack.display();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push more elements
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // This will trigger "Stack Overflow"
        stack.display();
    }
}

