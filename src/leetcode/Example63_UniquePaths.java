package leetcode;

/*
	 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
	机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
	问总共有多少条不同的路径？
 */
public class Example63_UniquePaths {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //无障碍情况下，状态转移方程
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
        //有障碍
        int rowSize = obstacleGrid.length;
        int columnSize = obstacleGrid[0].length;
        int[][] dp = new int[rowSize][columnSize];
        for(int i=0; i<rowSize; i++) {
        	for(int j=0; j<columnSize; j++) {
        		// 先判断路径点的值是否为1
        		if(obstacleGrid[i][j]==1) { // 无法通过该点
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
