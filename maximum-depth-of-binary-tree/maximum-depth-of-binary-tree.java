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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<Integer> val = new Stack<Integer>();
        s.push(root);
        val.push(1);
        int height = 0;
        while(!s.empty()){
            TreeNode node = s.pop();
            int temp = val.pop();
            height = Math.max(height, temp);
            
            if(node.left != null){
                s.push(node.left);
                val.push(temp + 1);
            }
            
            if(node.right != null){
                s.push(node.right);
                val.push(temp + 1);
            }
        }
        
        return height;
        
        
    }
}