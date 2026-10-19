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
    public List<TreeNode> roots = new ArrayList<>();

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        int val = subRoot.val;
        dfs(root, val);
        for (TreeNode r: roots) {
            if (check(r, subRoot)) return true;
        }
        return false;
    }

    public void dfs(TreeNode root, int val) {
        if (root == null) return;
        if (root.val == val) roots.add(root);
        dfs(root.left, val);
        dfs(root.right, val);
    }

    public boolean check(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null && subRoot != null ||
        root != null && subRoot == null) return false;
        return (root.val == subRoot.val && check(root.left, subRoot.left) &&
        check(root.right, subRoot.right));
    }
}
