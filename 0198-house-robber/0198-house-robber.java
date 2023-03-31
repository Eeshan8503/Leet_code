class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return ans(nums,nums.length-1,dp);
    }
    public int ans(int[]nums,int ind,int dp[]){
        
        if(ind==0){
            return nums[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int robbed=nums[ind]+ans(nums,ind-2,dp);
        int not_robbed=ans(nums,ind-1,dp);
        dp[ind]=Math.max(robbed,not_robbed);
        return Math.max(robbed,not_robbed);
        
    }
}