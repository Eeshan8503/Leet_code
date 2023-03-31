class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        combi(ans,new ArrayList<>(),k,n,1);
        return ans;
    }
    public void combi(List<List<Integer>> ans,List<Integer>comb,int k,int n,int start){
        if(k==0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start;i<=n;i++){
            comb.add(i);
            combi(ans,comb,k-1,n,i+1);
            comb.remove(comb.size()-1);
        }
        
    }
}