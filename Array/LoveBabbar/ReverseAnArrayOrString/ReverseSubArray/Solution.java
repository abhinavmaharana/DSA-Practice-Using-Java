package Array.LoveBabbar.ReverseAnArrayOrString.ReverseSubArray;

// Approach
// 1) Validate the input
// 2) Convert to 0-based Indexing
// 3) Use two-pointer approach : Initialize two pointers, one pointing to the start of the subarray (l) and the other pointing to the end of the subarray (r). Swap the elements at these two pointers, and then move the pointers towards each other until they meet in the middle.
// 4) Repeat until l < r

// This code is able to pass 188 / 202 test cases.
public class Solution {
    private static void reverseSubArray(int arr[], int n, int l, int r) {
        // code here
        if (l < 1 || r > n || l >= r) {
            // Invalid input or subarray with no elements, do nothing
            return;
        }

        // Convert 1-based indexing to 0-based indexing
        l--;
        r--;

        // Reverse the subarray using a single loop
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
