import java.util.Stack;

public class LargeNumberAddition {

    public static String addLargeNumbers(String num1, String num2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();

        // Push all digits of num1 into stack1
        for (char ch : num1.toCharArray()) {
            stack1.push(ch - '0'); // Convert char to integer
        }

        // Push all digits of num2 into stack2
        for (char ch : num2.toCharArray()) {
            stack2.push(ch - '0'); // Convert char to integer
        }

        int carry = 0;

        // Process the stacks until both are empty and no carry remains
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int digit1 = stack1.isEmpty() ? 0 : stack1.pop(); // Get the top digit of stack1 or 0 if empty
            int digit2 = stack2.isEmpty() ? 0 : stack2.pop(); // Get the top digit of stack2 or 0 if empty

            int sum = digit1 + digit2 + carry;
            resultStack.push(sum % 10); // Push the last digit of the sum
            carry = sum / 10; // Calculate the carry for the next step
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!resultStack.isEmpty()) {
            result.append(resultStack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "987654321987654321987654321";
        String num2 = "123456789123456789123456789";

        String result = addLargeNumbers(num1, num2);
        System.out.println("Sum: " + result);
    }
}


