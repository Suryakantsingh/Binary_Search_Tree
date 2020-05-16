package tree.binarySearchTree;

import java.util.Stack;

public class BstToGreaterTree {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int d) {
            this.val = d;
            left = right = null;
        }
    }

    public TreeNode convertBST(TreeNode root) {

        if (root == null)
            return null;

        Stack<TreeNode> stack = new Stack();



        TreeNode temp = root;
        int sum = 0;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.right;
            }
            temp = stack.pop();
            sum = sum+temp.val;
            temp.val = sum;
            temp = temp.left;
            }

        return root;
    }

    public void print(TreeNode root) {

        if(root == null)
            return;

        print(root.left);
        System.out.print(root.val + " ");
        print(root.right);

    }

    public static void main(String[] args) {

        root = new TreeNode(2);
        root.left = new TreeNode(0);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(1);
        BstToGreaterTree bst = new BstToGreaterTree();
        System.out.println(bst.convertBST(root));
        bst.print(root);
    }

}
