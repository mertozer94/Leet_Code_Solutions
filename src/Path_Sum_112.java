import Helper.TreeNode;

/**
 * @author Mert Ozer
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

5
/ \
4   8
/   / \
11  13  4
/  \      \
7    2      1
 */
public class Path_Sum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if(root.left == null && root.right == null)
            return sum-root.val == 0;
        if(root.left == null)
            return hasPathSum(root.right, sum-root.val);
        else if(root.right == null)
            return hasPathSum(root.left, sum-root.val);
        else return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
