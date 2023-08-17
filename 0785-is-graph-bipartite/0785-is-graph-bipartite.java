class Solution {
    public boolean isBipartite(int graph[][]){
         int coloured[]=new int[graph.length];
         Arrays.fill(coloured,-1);
         boolean vis[]=new boolean[graph.length];
         Arrays.fill(vis,false);
         boolean ans=true;
         for(int i=0;i<graph.length;i++){
             if(!vis[i]){
                 ans=ans && isBipartite(graph,coloured,i,vis);
             }
         }
        return ans;
    }
    public boolean isBipartite(int[][] graph,int coloured[],int start,boolean vis[]) {
       
        Queue<Integer> q=new LinkedList<>();
        coloured[start]=0;
        q.add(start);
        int pen;
        while(!q.isEmpty()){
            int node=q.poll();
            vis[node]=true;
            if(coloured[node]==0){
               pen=1;
            }
            else{
                pen=0;
            }
            for(int i:graph[node]){
                if(coloured[i]==-1){
                    coloured[i]=pen;
                    q.add(i);
                }
                else{
                    if(coloured[i]!=pen){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}