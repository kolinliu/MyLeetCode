package com.lk;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * @author kolin
 * 
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val)
				count++;
			else if (count > 0)
				nums[i - count] = nums[i];
		}
		return nums.length - count;
	}
}
