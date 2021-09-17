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
    public boolean isSymmetric(TreeNode root) {
        //left subtree --> root, left,right
        //right subtree --> root, right, left
        
        if(root == null){
            return true;
        }
        
        //left subtree
        if(root.left != null && root.right!= null){
            System.out.println("Hi");
            TreeNode p = root.left;
            TreeNode q = root.right;
            ArrayList<Integer> leftList = new ArrayList<Integer>();
            ArrayList<Integer> rightList = new ArrayList<Integer>();
            
            leftTraversal(p, leftList);
            rightTraversal(q, rightList);
            System.out.println(leftList);
            System.out.println(rightList);
            
            if(leftList.equals(rightList) == true){
                return true;
            }
            else return false;
        }
        
        else if(root.left != null && root.right == null) return false;
        
        else if(root.left == null && root.right != null) return false;
        
        else return true;
    }
    
    public void leftTraversal(TreeNode root, ArrayList<Integer> leftList){
        if(root == null){
            leftList.add(-100);
            return;
        }
        
        leftList.add(root.val);
        leftTraversal(root.left, leftList);
        leftTraversal(root.right, leftList);
    }
    
    public void rightTraversal(TreeNode root, ArrayList<Integer> rightList){
        if(root == null){
            rightList.add(-100);
            return;
        }
        
        rightList.add(root.val);
        rightTraversal(root.right, rightList);
        rightTraversal(root.left, rightList);
    }
}