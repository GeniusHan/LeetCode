package leetcode;

/*
	 һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����
	������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������
	���ܹ��ж�������ͬ��·����
 */
public class Example63_UniquePaths {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //���ϰ�����£�״̬ת�Ʒ���
        //dp[i][j]=dp[i-1][j]+dp[i][j-1];
        /*
        int dp[][] = new int[m][n];
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
        */
        //���ϰ�
        int rowSize = obstacleGrid.length;
        int columnSize = obstacleGrid[0].length;
        int[][] dp = new int[rowSize][columnSize];
        for(int i=0; i<rowSize; i++) {
        	for(int j=0; j<columnSize; j++) {
        		// ���ж�·�����ֵ�Ƿ�Ϊ1
        		if(obstacleGrid[i][j]==1) { // �޷�ͨ���õ�
        			dp[i][j]=0;
        			continue;
        		}
        		if(i==0 && j==0) {
        			dp[i][j]=1;
        		}
        		if(i==0 && j!=0) {
        			dp[i][j] = dp[i][j-1];
        		} 
        		else if(i!=0 && j==0) {
        			dp[i][j] = dp[i-1][j];
        		} 
        		else {
            		dp[i][j] = dp[i-1][j]+dp[i][j-1];
        		}
        	}
        }
        return dp[rowSize-1][columnSize-1];
    }
}
