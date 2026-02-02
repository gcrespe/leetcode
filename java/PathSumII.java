import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> currentPath = new ArrayList<>();

            solve(root, targetSum, currentPath, result);
            return result;
        }

        private void solve(TreeNode node, int target, List<Integer> path, List<List<Integer>> result) {
            if (node == null) return;
            path.add(node.val);

            if (node.left == null && node.right == null && node.val == target) {
                result.add(new ArrayList<>(path));
            } else {
                if (node.left != null) solve(node.left, target - node.val, path, result);
                if (node.right != null) solve(node.right, target - node.val, path, result);
            }
            path.removeLast();
        }
}
