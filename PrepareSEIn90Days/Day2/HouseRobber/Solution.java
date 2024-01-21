package PrepareSEIn90Days.Day2.HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        // Maximum amount that can be robbed (without current house)
        int previousMaxAmt = 0;
        // Maximum amount that can be robbed (with current house)
        int currentMaxAmt = 0;

        for (int num: nums) {
            int temp = currentMaxAmt;
            currentMaxAmt = Math.max(previousMaxAmt + num, currentMaxAmt);
            previousMaxAmt = temp;
        }

        return currentMaxAmt;
    }
}
