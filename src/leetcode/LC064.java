package leetcode;

public class LC064 {

    public int minPathSum(int[][] grid) {

    	// ״̬ת�Ʒ���
    	// dp[i][j]=min{dp[i-1][j],dp[i][j-1]};
    	int rowSize = grid.length;
    	int columnSize = grid[0].length;

    	int[][] dp = new int[rowSize][columnSize];
    	dp[0][0] = grid[0][0];
    	// ����һ�и�ֵ
    	for(int i=1; i<columnSize; i++) {
    		dp[0][i] = grid[0][i] + dp[0][i-1];
    	}
    	// ����һ�и�ֵ
    	for(int i=1; i<rowSize; i++) {
    		dp[i][0] = grid[i][0] + dp[i-1][0];
    	}
    	// ����λ��
    	for(int i=1; i<rowSize; i++) {
    		for(int j=1; j<columnSize; j++) {
    			dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
    		}
    	}
    	return dp[rowSize-1][columnSize-1];
    }
}
