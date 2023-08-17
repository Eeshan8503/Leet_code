class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    count++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
    public void dfs(int i,int j,boolean vis[][],char grid[][]){
      
        if(vis[i][j])
            return;
        
        vis[i][j]=true;
        int delrow[]={0,-1,0,1};
        int delcol[]={-1,0,1,0};
        for(int ii=0;ii<4;ii++){
            if(!(i+delrow[ii]>=0 && i+delrow[ii]<grid.length && j+delcol[ii]>=0 && j+delcol[ii]<grid[0].length))
                continue;
            if(!vis[i+delrow[ii]][j+delcol[ii]] && grid[i+delrow[ii]][j+delcol[ii]]=='1' ){
                dfs(i+delrow[ii],j+delcol[ii],vis,grid);
            }
        }
    }
}