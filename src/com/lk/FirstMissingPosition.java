package com.lk;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * 
 * For example,
 * 
 * Given [1,2,0] return 3,
 * 
 * and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 * @author kolin
 * 
 */
public class FirstMissingPosition {
	public int firstMissingPositive(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i + 1) {
				int temp = nums[i];
				if (nums[i] <= 0 || nums[i] > nums.length
						|| nums[i] == nums[temp - 1]) {
					break;
				}
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}
		int j = 0;
		for (; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return j + 1;
			}
		}

		return j + 1;
	}
}
