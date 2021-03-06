package com.lk;

/**
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given
 * input specs). You are responsible to gather all the input requirements up
 * front.
 * 
 * Update (2015-02-10): The signature of the C++ function had been updated. If
 * you still see your function signature accepts a const char * argument, please
 * click the reload button to reset your code definition.
 * 
 * Requirements for atoi:
 * 
 * The function first discards as many whitespace characters as necessary until
 * the first non-whitespace character is found. Then, starting from this
 * character, takes an optional initial plus or minus sign followed by as many
 * numerical digits as possible, and interprets them as a numerical value.
 * 
 * The string can contain additional characters after those that form the
 * integral number, which are ignored and have no effect on the behavior of this
 * function.
 * 
 * If the first sequence of non-whitespace characters in str is not a valid
 * integral number, or if no such sequence exists because either str is empty or
 * it contains only whitespace characters, no conversion is performed.
 * 
 * If no valid conversion could be performed, a zero value is returned. If the
 * correct value is out of the range of representable values, INT_MAX
 * (2147483647) or INT_MIN (-2147483648) is returned.
 * 
 * @author kolin
 * 
 */
public class Atoi {

	public int myAtoi(String str) {
		char[] nums = str.trim().toCharArray();
		boolean plus = true;
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				if (nums[i] == 45) {
					plus = false;
				} else if (47 < nums[i] && nums[i] < 58) {
					num = num * 10 + nums[i] - 48;
				} else if (nums[i] != 43) {
					return num;
				}
			} else if (47 < nums[i] && nums[i] < 58) {
				if (plus) {
					num = num * 10 + (nums[i] - 48);
				} else {
					num = num * 10 - (nums[i] - 48);
				}
			} else {
				return num;
			}
			if (num >= 0) {
				if (i < nums.length - 1) {
					if (num > 214748364
							&& (47 < nums[i + 1] && nums[i + 1] < 58)) {
						return 2147483647;
					} else if (num == 214748364) {
						if (nums[i + 1] > 55 && nums[i + 1] < 58) {
							return 2147483647;
						}
					}
				}
			} else {
				if (i < nums.length - 1) {
					if (num < -214748364
							&& (47 < nums[i + 1] && nums[i + 1] < 58)) {
						return -2147483648;
					} else if (num == -214748364) {
						if (nums[i + 1] > 55 && nums[i + 1] < 58) {
							return -2147483648;
						}
					}
				}
			}

		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(new Atoi().myAtoi(" -1010023630o4"));
	}

}
