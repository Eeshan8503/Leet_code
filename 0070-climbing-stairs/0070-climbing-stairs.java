class Solution {
    public int climbStairs(int n) {

        int dp[]=new int[n+1];
        return ans(n,n,dp);
    }
    public int ans(int n,int cur,int dp[]){
        if(dp[cur]!=0){
            return dp[cur];
        }
        if(cur==0){
            return 1;
        }
        if(cur==1){
            return 1;
        }
        int one=ans(n,cur-1,dp);
        int two=ans(n,cur-2,dp);
        dp[cur]=one+two;

        return one + two;

    }
}