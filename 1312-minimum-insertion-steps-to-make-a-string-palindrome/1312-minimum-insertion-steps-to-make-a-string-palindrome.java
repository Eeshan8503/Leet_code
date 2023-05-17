class Solution {
    public int minInsertions(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int [] i:dp){
            Arrays.fill(i,-1);
        }
        return s.length()-LongestpalendromicSubsequence(0,s.length()-1,s,dp);
    }
    public int LongestpalendromicSubsequence(int first,int last,String s,int dp[][]){
        if(first==last){
            return 1;
        }
        if(first>last){
            return 0;
        }
        if(dp[first][last]!=-1){
            return dp[first][last];
        }
        
        if(s.charAt(first)==s.charAt(last)){
            int ans=2+LongestpalendromicSubsequence(first+1,last-1,s,dp);
            dp[first][last]=ans;
            return ans;
        }
        int ans=Math.max(LongestpalendromicSubsequence(first,last-1,s,dp),LongestpalendromicSubsequence(first+1,last,s,dp));
        dp[first][last]=ans;
        return ans;
    }
}