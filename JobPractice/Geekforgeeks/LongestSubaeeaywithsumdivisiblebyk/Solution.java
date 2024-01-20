package JobPractice.Geekforgeeks.LongestSubaeeaywithsumdivisiblebyk;

import java.util.HashMap;

public class Solution {
    public static int longSubarrWthSumDivByK(int[] a, int n, int k)
    {
        // Complete the function
        HashMap<Integer, Integer> remainderMap = new HashMap<>();

        int maxLen = 0;
        int currentSum = 0;

        for(int i=0; i < n; i++) {
            currentSum += a[i];

            int remainder = (currentSum % k + k) % k;

            if (remainder == 0) {
                maxLen = i + 1;
            } else {
                if (remainderMap.containsKey(remainder)) {
                    maxLen = Math.max(maxLen, i - remainderMap.get(remainder));
                } else {
                    remainderMap.put(remainder, i);
                }
            }
        }
        return maxLen;
    }


}
