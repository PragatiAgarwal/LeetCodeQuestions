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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        inorder(root, q);
        TreeNode root1 = new TreeNode(q.poll());
        TreeNode curr = root1;
        while(q.size()> 0){
            TreeNode node = new TreeNode(q.poll());
            curr.left = null;
            curr.right = node;
            curr = curr.right;
        }
        return root1;
    }
    public void inorder(TreeNode root, Queue q){
        if(root == null){
            return;
        }
        inorder(root.left, q);
        q.add(root.val);
        inorder(root.right, q);
    }
}