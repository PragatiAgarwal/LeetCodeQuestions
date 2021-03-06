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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        preTraversal(root, result);
        
        return result;
    }
    
    public void preTraversal(TreeNode root, List<Integer> l){
        if(root == null){
            return;
        }
        l.add(root.val);
        preTraversal(root.left, l);
        preTraversal(root.right, l);
    }
}