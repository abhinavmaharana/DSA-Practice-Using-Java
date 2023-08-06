package Array.LoveBabbar.ReverseAnArrayOrString.ReverseAnArray;


// Approach
// 1) Initialize start and end indexes as start = 0, end = n-1
// 2) Swap arr[start] with arr[end]
// 3) Recursively call reverse for rest of the array.
public class Solution {
    /* Function to reverse arr[] from start to end*/
    private static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }

    /* Utility that prints out an array on a line */
    private static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
