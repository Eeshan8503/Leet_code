class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean taken[]=new boolean[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        func(nums,taken,new ArrayList<>(),ans);
        return ans;
    }
    public void func(int[]nums,boolean taken[],List<Integer>ds,List<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<nums.length;i++){
            if(!taken[i]){
                taken[i]=true;
                ds.add(nums[i]);
                func(nums,taken,ds,ans);
                taken[i]=false;
                ds.remove(ds.size()-1);
            }
        }   
    }
}