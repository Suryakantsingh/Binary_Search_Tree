package tree.binarySearchTree;



public class NthOrderTraversalPostOrder {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int d) {
            val = d;
            left = right = null;
        }
    }
    int count = 0;
    int result = 0;

    public int search(TreeNode root, int number){
        if(root == null)
            return 0;

        search(root.left, number);
        search(root.right,number);
        count++;
        if(count == number){
            result = root.val;
            return result;
        }
        return result;
    }
    public static void main(String[] args){
        NthOrderTraversalPostOrder tree = new NthOrderTraversalPostOrder();
        root = new TreeNode(11);
        root.left = new TreeNode(21);
        root.right = new TreeNode(31);
        root.left.left = new TreeNode(41);
        root.left.right = new TreeNode(51);
        System.out.println(tree.search(root,4));
    }
}
