class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean vis[]=new boolean[numCourses];
        Arrays.fill(vis,false);
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for(int pre[]:prerequisites){
            adj.get(pre[1]).add(pre[0]);
        }
        int indegree[]=new int[numCourses];
        Arrays.fill(indegree,0);
        for(int i=0;i<numCourses;i++){
            for(int j:adj.get(i)){
                indegree[j]++;
            }
        }
        ArrayList<Integer> topo=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.poll();
            vis[node]=true;
            topo.add(node);
            for(int i:adj.get(node)){
                indegree[i]--;
                if(indegree[i]==0)
                q.add(i);
            }
            
        }
        
        for(boolean i:vis){
            if(!i)
                return false;
        }
        return true;
        
    }
}