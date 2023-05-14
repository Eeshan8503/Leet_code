class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        // for(int[]i:dp){
        //     Arrays.fill(i,-1);
        // }
        // return func(text1,text2,text1.length()-1,text2.length()-1,dp);
        return tabulation(text1,text2,dp);
    }
    public int func(String text1,String text2,int ind1,int ind2,int dp[][]){
        // base case
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(text1.charAt(ind1)==text2.charAt(ind2)){
            int ans=1+func(text1,text2,ind1-1,ind2-1,dp);
            dp[ind1][ind2]=ans;
            return ans;
        }
        int ans=0+Math.max(func(text1,text2,ind1-1,ind2,dp),func(text1,text2,ind1,ind2-1,dp));
        dp[ind1][ind2]=ans;
        return ans;
        // return 


    }
    public int tabulation(String text1,String text2,int dp[][]){
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                 int ans=1+dp[i-1][j-1];
                 dp[i][j]=ans;
                }
                else{
                int ans=Math.max(dp[i-1][j],dp[i][j-1]);
                dp[i][j]=ans;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}