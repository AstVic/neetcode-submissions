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
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> stack = new ArrayDeque<>();
        stack.add(root); 
        bfs(stack, res);
        return res;

    }

    public void bfs(Queue<TreeNode> stack, List<List<Integer>> res) {
        int len = stack.size();
        if (len == 0) return;

        List<Integer> cur = new ArrayList<>();

        while (len != 0) {
            TreeNode curNode = stack.poll();
            if (curNode.left != null) stack.add(curNode.left);
            if (curNode.right != null) stack.add(curNode.right);
            cur.add(curNode.val);
            len--;
        }

        res.add(cur);
        bfs(stack, res);
    }
}
