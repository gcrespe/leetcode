import utils.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum){
        System.out.println("Node value: " + root.val + " Root left: " +  root.left.val + " Root right: "  + root.right.val +" Target: " +targetSum);

        if(root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        boolean hasLeft = false;
        if(root.left != null) hasLeft = hasPathSum(root.left, targetSum - root.val);
        boolean hasRight = false;
        if(root.right != null) hasRight = hasPathSum(root.right, targetSum - root.val);

        return hasLeft || hasRight;
    }
}
