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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        postTraversal(root, result);
        return result;
    }
    
    public void postTraversal(TreeNode root, List<Integer> l){
        if(root == null) return;
        
        postTraversal(root.left, l);
        postTraversal(root.right, l);
        l.add(root.val);
    }
}