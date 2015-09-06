package com.lk;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * 
 * Output: index1=1, index2=2
 * 
 * @author kolin
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int v1 = target - nums[i];
			Integer v2 = map.get(v1);
			if(v2!=null){
				return new int[]{v2,i+1};
			}
			if(map.get(nums[i])==null)
				map.put(nums[i], i+1);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] v = {2,3,4,5,5,6,7,8};
		int[] v1 = new TwoSum().twoSum(v, 11);
		for (int i : v1) {
			System.out.println(i);
		}
	}
}
