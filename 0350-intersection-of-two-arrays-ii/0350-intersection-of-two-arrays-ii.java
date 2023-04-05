class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean chosen[]=new boolean[nums2.length];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i] && !chosen[j]){
                    ans.add(nums2[j]);
                    chosen[j]=true;
                    break;
                }
            }
        }
        int anss[]=new int[ans.size()];
        for(int i=0;i<anss.length;i++){
            anss[i]=ans.get(i);
        }
        return anss;
    }
}