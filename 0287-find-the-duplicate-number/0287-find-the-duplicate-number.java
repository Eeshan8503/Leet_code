class Solution {
    public int findDuplicate(int[] nums) {
       int aux[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(aux[nums[i]]!=0) 
                return nums[i];
            
            aux[nums[i]]=1;
        }
        return 0;
    }
}