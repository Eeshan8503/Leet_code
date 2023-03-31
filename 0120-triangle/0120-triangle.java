class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int[] i:dp){
            Arrays.fill(i,20000);            
        }
        return func(triangle,0,0,dp);
    }
    public int func(List<List<Integer>> triangle,int ind1,int ind2,int[][]dp){
        if(dp[ind1][ind2]!=20000){
            return dp[ind1][ind2];
        }
        if(ind1==triangle.size()-1){
            return triangle.get(ind1).get(ind2);
        }
        int left=triangle.get(ind1).get(ind2)+func(triangle,ind1+1,ind2,dp);
        int right=triangle.get(ind1).get(ind2)+func(triangle,ind1+1,ind2+1,dp);
        dp[ind1][ind2]=Math.min(left,right);
        return Math.min(left,right);
    }
}