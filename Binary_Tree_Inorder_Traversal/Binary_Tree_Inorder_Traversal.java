import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                } else {
                    node = stack.pop();
                    ans.add(node.val);
                    node = node.right;
                }
            }
        }

        System.out.println(ans);
        return ans;
    }
}

public class Main {
    public static TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        TreeNode[] nodes = new TreeNode[values.length];
        for (int i = 0; i < values.length; i++) {
            if(values[i] != null) {
                nodes[i] = new TreeNode(values[i]);
            }
        }

        System.out.println(Arrays.toString(nodes));
        int index = 1;
        for (int i = 0; i < values.length; i++) {
            if (nodes[i] != null) {
                if (index < values.length && nodes[index] != null) {
                    nodes[i].left = nodes[index];
                }
                index++;
                if (index < values.length && nodes[index] != null) {
                    nodes[i].right = nodes[index];
                }
                index++;
            }
        }
        return nodes[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Integer[] values1 = {1, null, 2, 3};
        TreeNode root1 = buildTree(values1);
        System.out.println(solution.inorderTraversal(root1));

        Integer[] values2 = {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9};
        TreeNode root2 = buildTree(values2);
        System.out.println(solution.inorderTraversal(root2));

        Integer[] values3 = {};
        TreeNode root3 = buildTree(values3);
        System.out.println(solution.inorderTraversal(root3));

        Integer[] values4 = {1};
        TreeNode root4 = buildTree(values4);
        System.out.println(solution.inorderTraversal(root4));
    }
}
