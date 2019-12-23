package leetcode;

/**
 * 爬楼梯
 */
public class LC070 {
    public int climbStairs(int n) {
    	/*** 超时 ***
    	if(n==1) return 1;
        //状态转移方程
    	//dp[i]=dp[i-1]+dp[i-2];
    	int[] dp = new int[n+1];
    	dp[0]=1;
    	dp[1]=1;
    	int i=2;
    	while(i<=n) {
    		dp[i]=dp[i-1]+dp[i-2];
    		i++;
    	}
    	return dp[n];
    	*/
    	
    	return (int)Math.pow(2, n);
    }
}
