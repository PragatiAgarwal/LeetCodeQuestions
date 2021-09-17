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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) return result;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> l = new ArrayList<Integer>();
            for(int i = 0; i<size; i++){
                TreeNode n = q.remove();
                l.add(n.val);
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }
            
            result.add(l);
        }
        return result;
    }
}