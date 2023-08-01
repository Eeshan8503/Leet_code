class Solution {
   public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<Integer>();
        func(n,k,1,ans,ds,1);
        return ans;
    }
    public void func(int n, int k,int i,List<List<Integer>> ans,List<Integer> ds,int s) {
        if(s>k){
            // ds.add(i);
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int ii=i;ii<=n;ii++){
            ds.add(ii);
            
            func(n,k,ii+1,ans,ds,s+1);
            ds.remove(ds.size()-1);
        }
    }
}