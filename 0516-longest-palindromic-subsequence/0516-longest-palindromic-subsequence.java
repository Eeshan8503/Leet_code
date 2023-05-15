class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return func(s,0,s.length()-1,dp);
        // return tabulation(s);
    }
    public int func(String s,int first,int last,int dp[][]){
        
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
            int ans=2+func(s,first+1,last-1,dp);
            dp[first][last]=ans;
            return ans;
        }
        int ans=Math.max(func(s,first+1,last,dp),func(s,first,last-1,dp));
        dp[first][last]=ans;
        return ans;
    }
}

    // Tabulation

//     public int tabulation(String s){
//         int dp[][]=new int[s.length()][s.length()];
//         int n=dp.length;
//         int m=dp[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==j){
//                     dp[i][j]=1;
//                 }
//                 if(i>j){
//                     dp[i][j]=0;
//                 }
//             }
//         }
//         for(int first=m-1;first>0;first--){
//             for(int last=0;last<m-1;last++){
//                 if(s.charAt(first)==s.charAt(last)){
//                 int ans=2+dp[first-1][last+1];
//                 dp[first][last]=ans;
//                 }
//                 else{
//                     int ans=Math.max(dp[first-1][last],dp[first][last+1]);
//                     dp[first][last]=ans;
//                 }
        
//             }
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(dp[i][j]+" ");
//             }
//             System.out.println();
//         }
//         return dp[m-1][m-1];
//     }
// }