public class CenteredArrayCheck {

    public static int isCentered(int[] arr) {
        int n = arr.length;

        // Must have an odd number of elements
        if (n % 2 == 0) {
            return 0;
        }

        int middleIndex = n / 2;
        int middleValue = arr[middleIndex];

        // Check all elements except the middle
        for (int i = 0; i < n; i++) {
            if (i != middleIndex && arr[i] <= middleValue) {
                return 0;
            }
        }

        return 1;
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 3, 8, 20};
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] arr3 = {10, 2, 30, 1, 40};

        System.out.println(isCentered(arr1)); // Output: 1 (center = 3, others > 3)
        System.out.println(isCentered(arr2)); // Output: 0 (center = 30, not all > 30)
        System.out.println(isCentered(arr3)); // Output: 0 (center = 30, 10 and 2 < 30)
    }
}
