//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        int distance[]=new int[n];
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,0));
        Arrays.fill(distance,100000);
        distance[src]=0;
        while(!q.isEmpty()){
            Pair nn=q.poll();
            int node=nn.node;
            int wt=nn.weight;
            for(int i:adj.get(node)){
                if(wt+1<distance[i]){
                    distance[i]=wt+1;
                    q.add(new Pair(i,distance[i]));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(distance[i]==100000){
                distance[i]=-1;
            }
        }
        return distance;
       
    }
   
}
class Pair{
    int node;
    int weight;
    public Pair(){}
    public Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}