package leetcode;

/**
 * ��¥��
 */
public class LC070 {
    public int climbStairs(int n) {
    	/*** ��ʱ ***
    	if(n==1) return 1;
        //״̬ת�Ʒ���
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
