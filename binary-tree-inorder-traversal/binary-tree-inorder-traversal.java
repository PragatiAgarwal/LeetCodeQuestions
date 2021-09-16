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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inTraversal(root, result);
        return result;
    }
    
     public void inTraversal(TreeNode root, List<Integer> l){
         if(root == null) return;
         
         inTraversal(root.left, l);
         l.add(root.val);
         inTraversal(root.right, l);
     }
    
}