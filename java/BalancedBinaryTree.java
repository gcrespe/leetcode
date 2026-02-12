import utils.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode root){
        if(root == null) return 0;

        int left = checkHeight(root.left);
        int right = checkHeight(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

}
