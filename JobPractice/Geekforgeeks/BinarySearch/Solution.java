package JobPractice.Geekforgeeks.BinarySearch;

public class Solution {
    public static int binarysearch (int arr[], int n, int k) {
        return binarySearchSort(arr, 0, n - 1, k );
    }

    private static int binarySearchSort(int arr[], int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearchSort(arr, mid + 1, high, target);
            } else {
                return binarySearchSort(arr, low, mid - 1, target);
            }
        }

        return -1;
    }
}
