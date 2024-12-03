public class BinarySearchExample {
    public static void main(String[] args) {
        // Sorted array (binary search requires a sorted array)
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Print result
        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index " + result);
        }
    }

    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Left boundary of the search
        int right = arr.length - 1; // Right boundary of the search

        while (left <= right) {
            int mid = left + (right - left) / 2; // Middle index to prevent overflow

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid; // Return the index if found
            }

            // If the target is smaller than the middle element, search the left half
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                // Otherwise, search the right half
                left = mid + 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }
}


