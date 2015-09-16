package com.lk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given a set of distinct integers, nums, return all possible subsets.
 * 
 * Note:
 * 
 * Elements in a subset must be in non-descending order.
 * 
 * The solution set must not contain duplicate subsets.
 * 
 * For example,
 * 
 * If nums = [1,2,3], a solution is:
 * 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 * @author kolin<br>
 * 
 * solution:
 * 数组A[]={a,b,c}的子集有2^(A.length)个,二进制表示为：000,001,010,011...111.
 * 二级制每一位代表数组中的位置，1表示取该数组位的数据，0表示不取。
 * 如000表示取空集，011表示取A[0]和A[1]
 * 
 */
public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {		
		Arrays.sort(nums);
		List<List<Integer>> subSets = new ArrayList<List<Integer>>();
		for (int i = 0; i < Math.pow(2, nums.length); i++) {
			int j = i, k = 0;
			List<Integer> set = new ArrayList<Integer>();
			while (j > 0) {
				if (j % 2 != 0) {
					set.add(nums[k]);
				}
				j = j >> 1;
				k++;
			}
			subSets.add(set);
		}

		return subSets;
	}
}
