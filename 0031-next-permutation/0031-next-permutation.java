class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            for(int i=0;i<n/2;i++){
                nums[i]=nums[i]^nums[n-1-i];
                nums[n-1-i]=nums[i]^nums[n-1-i];
                nums[i]=nums[i]^nums[n-1-i];
                // swap(nums[i],nums[n-1-i]);
            }
            return;
        }
        
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                // swap(nums[i],nums[ind]);
                nums[i]=nums[i]^nums[ind];
                nums[ind]=nums[i]^nums[ind];
                nums[i]=nums[i]^nums[ind];
                
                break;
            }
        }
         for(int i=ind+1;i<n;i++){
            int temp=nums[i];
            nums[i]=nums[n-1];
            nums[n-1]=temp;
            n--;
        }
        
    }
}