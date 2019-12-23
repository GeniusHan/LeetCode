package leetcode;

import java.util.Arrays;

public class Example53_MaxSubArray {
	
	/*
	 * ¶¯Ì¬¹æ»®
	 * 
	 */
	public static int maxSubArray(int[] nums) {
		
		/*
		int length = nums.length;
		if(length==1) return nums[0];
		int[] dp = new int[length];
		dp[0] = nums[0];
		int maxNum = dp[0];
		for(int i=1; i<length; i++) {
			dp[i] = dp[i-1]>=0 ? dp[i-1]+nums[i] : nums[i];
			maxNum = Math.max(maxNum, dp[i]);
		}
		return maxNum;
		*/
		int length = nums.length;
		int sum=0;
		int ans = nums[0];
		for(int i=0; i<length; i++) {
			if(sum>0) {
				sum += nums[i];
			} else {
				sum = nums[i];
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}
}
