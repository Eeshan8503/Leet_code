//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		ArrayList<ArrayList<pair>> adj =new ArrayList<>();
		for(int i=0;i<N;i++){
		    adj.add(new ArrayList<pair>());
		}
		for(int[] i:edges){
		    adj.get(i[0]).add(new pair(i[1],i[2]));
		}
		Stack<Integer> s=new Stack<>();
		boolean vis[]=new boolean[N];
		Arrays.fill(vis,false);
		for(int i=0;i<N;i++){
		    if(!vis[i]){
		        dfs(i,vis,adj,s);
		    }
		}
		
		int distance[]=new int[N];
		Arrays.fill(distance,10000000);
		distance[0]=0;
		while(!s.isEmpty()){
		    int node=s.pop();
		    for(pair i:adj.get(node)){
		        if(distance[node]+i.weight<distance[i.node]){
		            distance[i.node]=distance[node]+i.weight;
		        }
		    }
		}
		
		for(int i=0;i<N;i++){
		    if(distance[i]==10000000){
		        distance[i]=-1;
		    }
		}
		return distance;
	}
	public void dfs(int node,boolean vis[],	ArrayList<ArrayList<pair>> adj,Stack<Integer> s){
	    vis[node]=true;
	    
	    for(pair i:adj.get(node)){
	        if(!vis[i.node]){
	            dfs(i.node,vis,adj,s);
	        }
	    }
	    s.add(node);
	    
	}
}
class pair{
    int node;
    int weight;
    public pair(){}
    public pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
    // public String toString(){
    //     return node+" "+weight;
    // }
}