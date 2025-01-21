import java.util.Stack;

public class BalancedBraces {

    // Method to check if braces are balanced
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Traverse each character in the string
        for (char ch : input.toCharArray()) {
            if (ch == '{') {
                // Push opening brace onto the stack
                stack.push(ch);
            } else if (ch == '}') {
                // If closing brace encountered, check stack
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false; // Unbalanced
                }
            }
        }
        
        // If stack is empty, all braces are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test case
        String testString = "abc{defg{ijk}{l{mn}}op}qr{";
        boolean result = isBalanced(testString);
        
        // Output result
        if (result) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }
}
