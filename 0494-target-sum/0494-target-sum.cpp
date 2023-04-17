class Solution {
public:
    
    int sol(int i,vector<int>& nums,int target2)
    {
       // if(target2==0)
       //     return 1;
        
        if(target2<0)
            return 0;
        
        if(i==0)
        {
            if(target2==0 && nums[i]==0)
                return 2;
            
            if(target2==0 || nums[i]==target2)
                return 1;
            
            else return 0;
                
            
        }
        
        // if(dp[i][target2]!=-999)return dp[i][target2];
        
        int notTake=sol(i-1,nums,target2);
        
        int take=0;
        //if(target2>=nums[i])
            take=sol(i-1,nums,target2-nums[i]);
        
        return take+notTake;
        
        
    }
    
    int findTargetSumWays(vector<int>& nums, int target) {
        
        int sum=0;
        for(int i=0;i<nums.size();i++)
            sum+=nums[i];
        
        if((sum+target)%2!=0)
            return 0;
        
        int target2=(sum+target)/2;
        
        // vector<vector<int>> dp(nums.size(),vector<int>(target2+1,-999));
        
        return sol(nums.size()-1,nums,target2);
        
    }
};