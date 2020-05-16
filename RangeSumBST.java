package tree.binarySearchTree;

public class RangeSumBST {
    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int d) {
            val = d;
            left = right = null;
        }
    }

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        if(root.val >= L && root.val <= R)
             sum = sum + root.val;

        rangeSumBST(root.left,L,R);
        rangeSumBST(root.right,L,R);
        return sum;
    }
    public void  iterateTree(TreeNode root,int sum){
        if(root == null)
            return;


        sum = sum + root.val;

        iterateTree(root.left,sum);
        iterateTree(root.right,sum);



    }
    public static void main(String[] args) {

        RangeSumBST tree = new RangeSumBST();
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        System.out.println(tree.rangeSumBST(root,7,15));

    }


}
