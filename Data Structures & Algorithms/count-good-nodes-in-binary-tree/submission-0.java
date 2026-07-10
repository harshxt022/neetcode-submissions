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
    int count  = 0;
    public int goodNodes(TreeNode root) {
        counts(root,root.val);
        return count;
    }
    public void counts(TreeNode curr , int max){
        if(curr.val >= max){
            count++;
            max = curr.val;
        }
        if(curr.left != null) counts(curr.left,max);
        if(curr.right != null) counts(curr.right,max);
    }
}
