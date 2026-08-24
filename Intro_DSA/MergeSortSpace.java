public class MergeSortSpace {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 61, 2, 3, 4, 0};

        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    /*
    SC-3: Merge Sort Space Complexity

    Auxiliary Space Complexity: O(n)

    Reason:
    During merging, temporary arrays are created
    to store the divided subarrays.
    This extra memory grows with the input size n.

    Merge Sort: O(n)

    Comparison:
    Insertion Sort: O(1) extra space
    Quick Sort: O(log n) average extra space

    Therefore, Merge Sort uses more extra memory
    than in-place sorting algorithms.
    */
}