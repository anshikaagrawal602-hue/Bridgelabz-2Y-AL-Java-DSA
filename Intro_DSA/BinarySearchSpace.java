public class BinarySearchSpace {

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 8, 61};
        int target = 4;

        System.out.println(binarySearch(arr, target));
    }

    /*
    SC-2: Binary Search Space Complexity

    Auxiliary Space Complexity: O(1)

    Reason:
    Iterative Binary Search uses only variables
    like low, high and mid.
    No extra array or recursion stack is used.
    Therefore, space complexity is O(1).
    */
}