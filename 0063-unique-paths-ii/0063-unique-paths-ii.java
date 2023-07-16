class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1) return 0;
        int[][] dp = new int[m][n];
        for(int i=m-1 ; i>=0 ; i--){
            for(int j=n-1 ; j>=0;j--){
                if(i==m-1 && j==n-1){
                    if(grid[i][j]==1) dp[i][j] = 0;
                    else dp[i][j] = 1;
                }
                else if(i==m-1){
                    if(grid[i][j]==1) dp[i][j] = 0;
                    else dp[i][j] = dp[i][j]=dp[i][j+1];
                }
                else if(j==n-1){
                    if(grid[i][j]==1) dp[i][j] = 0;
                    else dp[i][j] = dp[i+1][j];
                }
                else {
                    if(grid[i][j]==1) dp[i][j] = 0;
                    else dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
}