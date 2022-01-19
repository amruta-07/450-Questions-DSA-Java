287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

Example 2:

Input: nums = [3,1,3,4,2]
Output: 3




class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
		// Go to the index pointed by the value of the element and negate it
		// Return the abs of the element, at the index of which, the value is already negative
        for(int i=0; i<n; i++) {
            if(nums[Math.abs(nums[i])] < 0)
                return Math.abs(nums[i]);
            nums[Math.abs(nums[i])] *= -1;
        }
        return -1;
    }
}