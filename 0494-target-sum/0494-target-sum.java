// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         int sum=0;
//         for(int i : nums){
//             sum+=i;
//         }
//         int target2=(target+sum)/2;
//          if((sum+target)%2!=0)
//             return 0;
//         return backtrack(nums, target2, 0, new ArrayList<Integer>());
//     }
//     private static int backtrack(int[] nums, int target, int index, List<Integer> curr) {
//         if (index == nums.length) {
//             if (target == 0) {
//                 return 1;
//             }
//             return 0;
//         }
        
       
        
//         int pos=backtrack(nums, target - nums[index], index + 1, curr);
//         int neg=backtrack(nums, target, index + 1, curr);
       

//         return pos+neg;
//     }
// }
public class Solution {
    int count = 0;
    
    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, 0, 0, S);
        return count;
    }
    
    public void calculate(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S) {
                count++;
            }
        } else {
            calculate(nums, i + 1, sum + nums[i], S);
            calculate(nums, i + 1, sum - nums[i], S);
        }
    }
}