package leetcode;

public class LC091 {
	
    public static int numDecodings(String s) {
    	//状态转移方程
    	//判断当前位置和前一位置的字符合起来是否在编码范围之内（1-26）
    	//dp[i]=dp[i-1]+dp[i-2]  #满足
    	//dp[i]=dp[i-1]    #不满足
    	int length = s.length();
    	if(length==1) return 1;
    	if(s.charAt(0)=='0') return 0; // 不符合条件
    	int[] digits = new int[length];
    	for(int i=0; i<length; i++) {
    		digits[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
    	}
    	int[] dp = new int[length+1];
    	dp[0]=1; 
    	dp[1]=1;
    	for(int i=1; i<length; i++) {
    		int m=i+1;
    		dp[m]=0;
    		if(digits[i]<=26 && digits[i]>=1) {
    			dp[m] += dp[m-1];
    		}
    		if(digits[i-1]!=0 && (digits[i-1]*10+digits[i])<=26) {
    			dp[m] += dp[m-2];
    		}
    	}
        return dp[length];
    }
    

}
