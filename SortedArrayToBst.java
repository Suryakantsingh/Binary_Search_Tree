/*
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
*/
package tree.binarySearchTree;

public class SortedArrayToBst {

    static TreeNode root;

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int d) {
            this.val = d;
            left = right = null;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;

        TreeNode a = ArrayToBST(nums, 0, nums.length - 1);
        return a;
    }

    public TreeNode ArrayToBST(int[] nums, int l, int r) {
          if (l>r) return null;

          int mid = (l+r)/2;
          TreeNode s = new TreeNode(nums[mid]);
          s.left = ArrayToBST(nums,l,mid-1);
          s.right = ArrayToBST(nums,mid+1,r);
          return s;
    }

    public static void main(String[] args) {
        int[] num = {-10, -3, 0, 5, 9};
        SortedArrayToBst tree = new SortedArrayToBst();
        System.out.println(tree.sortedArrayToBST(num));
    }
}
