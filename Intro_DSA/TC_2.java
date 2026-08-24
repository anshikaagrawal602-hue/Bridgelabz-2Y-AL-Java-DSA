public class TC_2 {

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

        int result = binarySearch(arr, target);

        System.out.println("Element found at index: " + result);
    }

    /*
     Problem TC-2: Iterative Binary Search Complexity

     Sample Array: {0, 2, 3, 4, 8, 61}
     Target = 4

     Step 1:
     low = 0, high = 5
     mid = 2
     arr[mid] = 3
     4 > 3, so search right half.

     Step 2:
     low = 3, high = 5
     mid = 4
     arr[mid] = 8
     4 < 8, so search left half.

     Step 3:
     low = 3, high = 3
     mid = 3
     arr[mid] = 4
     Target found.

     Search space:
     6 → 3 → 1

     Worst Case:
     After k comparisons, search space = N / 2^k

     N / 2^k = 1
     2^k = N
     k = log2(N)

     Time Complexity: O(log N)
     Space Complexity: O(1)
    */
}
