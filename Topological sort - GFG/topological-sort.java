//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // int indegree[]=new int[V];
        // Arrays.fill(indegree,0);
        // for(int i=0;i<V;i++){
        //     for(int j:adj.get(i)){
        //         indegree[j]++;
        //     }
        // }
        
        // ArrayList<Integer> topo=new ArrayList<>();
        
        // Queue<Integer> q=new LinkedList<>();
        // for(int i=0;i<V;i++){
        //     if(indegree[i]==0){
        //         q.add(i);
        //     }
        // }
        
        // while(!q.isEmpty()){
        //     int node=q.poll();
        //     topo.add(node);
        //     for(int i:adj.get(node)){
        //         indegree[i]--;
        //         if(indegree[i]==0){
        //             q.add(i);
        //         }
        //     }
        // }
        // int ans[]=new int[topo.size()];
        // int j=0;
        // for(int i:topo){
        //     ans[j++]=i;
        // }
        // return ans;
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,vis,s,adj);
            }
        }
        int ans[]=new int[V];
        for(int i=0;i<V;i++){
            ans[i]=s.pop();
        }
        return ans;
        
    }
    static void dfs(int node,boolean vis[],Stack<Integer> s,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfs(i,vis,s,adj);
            }
        }
        s.add(node);
    }
}
