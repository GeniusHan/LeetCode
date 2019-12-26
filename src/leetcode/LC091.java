package leetcode;

public class LC091 {
	
    public static int numDecodings(String s) {
    	//״̬ת�Ʒ���
    	//�жϵ�ǰλ�ú�ǰһλ�õ��ַ��������Ƿ��ڱ��뷶Χ֮�ڣ�1-26��
    	//dp[i]=dp[i-1]+dp[i-2]  #����
    	//dp[i]=dp[i-1]    #������
    	int length = s.length();
    	if(length==1) return 1;
    	if(s.charAt(0)=='0') return 0; // ����������
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
