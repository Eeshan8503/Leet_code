/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=0;
    public int longestZigZag(TreeNode root) {
        ans(root.left,-1,1);
        ans(root.right,1,1);
        return max;
    }
    public void ans(TreeNode root, int dir,int len){
        if(root==null){
            return ;
        }
        max=Math.max(max,len);
        if(dir==1){
            ans(root.left,-1,len+1);
            ans(root.right,1,1);
            // return Math.max(op1,new_start);
        }
        else{
            ans(root.right,1,len+1);
            ans(root.left,-1,1);
            // return Math.max(op1,new_start);
        }
    }
}