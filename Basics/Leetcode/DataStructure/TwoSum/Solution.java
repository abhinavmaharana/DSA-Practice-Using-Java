package Basics.Leetcode.DataStructure.TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] retNum = new int[2];
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1;j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    retNum[0] = i;
                    retNum[1] = j;
                }
            }
        }
        return retNum;
    };
}
