package ru.leetcode;

import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class LeetCode_938_Range_Sum_of_BST {
    public int rangeSumBST(TreeNode root, int low, int high) {
// 1. Recursive

        return pre(root,low,high);}
    int pre(TreeNode root, int low, int high){
        if(root == null)
            return 0;
        if (root.val > high)
            pre(root.left, low, high);
        if (root.val < low)
            pre(root.right, low, high);
    return root.val + pre(root.left,low,high) + pre(root.right, low,high);
    }



// 2.Iterative

        //        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        int sum = 0;
//        while (!stack.empty()){
//            TreeNode n = stack.pop();
//            if(n == null)
//                continue;
//            if(n.val > low)
//                stack.push(n.left);
//            if(n.val > high)
//                stack.push(n.right);
//            if(n.val>= low && n.val>=high)
//                sum+=n.val;
//            System.out.println();
//        }
//    return sum;
    //}
    }

