/*
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1

**/
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
        
        int count = 0;
        int result = 0;
        public int kthSmallest(TreeNode root, int k) {
      
            if(root == null){
              return 0;
             }
           
             kthSmallest(root.left,k);
             count++;
           
             if(count == k){
               result = root.val;
             }
             kthSmallest(root.right,k);
             return result;
        }
}
