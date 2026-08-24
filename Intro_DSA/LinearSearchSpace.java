public class LinearSearchSpace {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {8, 61, 2, 3, 4, 0};
        int target = 4;

        System.out.println(linearSearch(arr, target));
    }

    /*
    SC-1: Linear Search Space Complexity

    Auxiliary Space Complexity: O(1)

    Reason:
    Only a few extra variables like i and target
    are used. No extra array or data structure is created.
    Therefore, space complexity is O(1).
    */
}