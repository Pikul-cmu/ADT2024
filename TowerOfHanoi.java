import java.util.Scanner;

public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: If only one disk is left, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary rod using destination as buffer
        towerOfHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth (largest) disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 disks from auxiliary rod to destination using source as buffer
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of disks
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        // Rods: A = Source, B = Auxiliary, C = Destination
        System.out.println("Steps to solve Tower of Hanoi:");
        towerOfHanoi(n, 'A', 'C', 'B');

        scanner.close();
    }
}