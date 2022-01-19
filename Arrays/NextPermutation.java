Next Permutation



class Solution {
    public void nextPermutation(int[] nums) {
    int index = nums.length - 2;
    while (index >= 0 && nums[index] >= nums[index + 1]) {
        index--;
    }
    if (index == -1) {
        // the given permutation is the max, reverse to get the min
        reverse(nums, 0);
        return;
    }
    int swapIndex = nums.length - 1;
	// find the first number from the end bigger than nums[index]
    while (nums[swapIndex] <= nums[index]) {
        swapIndex--;
    }
    // swap, this will make our number bigger
    int temp = nums[index];
    nums[index] = nums[swapIndex];
    nums[swapIndex] = temp;
    // the numbers to the right of index are in descending order, we need them is ascending order
    reverse(nums, index + 1);
}


private void reverse(final int[] nums, int from) {
    for (int i = from, j = nums.length - 1; i < j; i++, j--) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
}