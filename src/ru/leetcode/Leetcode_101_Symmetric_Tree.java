package ru.leetcode;

import java.util.*;


class Leetcode_101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)  return true;
        if(root.left==null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;

        Stack <TreeNode> stack = new Stack();
        stack.push(root.right);
        stack.push(root.left);

        while(!stack.isEmpty()){
            TreeNode s1, s2;
            s1 = stack.pop();
            s2 = stack.pop();

            if(s1.val != s2.val)
                return false;
            if((s1.left==null) != (s2.right==null))return false;
            if((s1.right==null) != (s2.left==null))return false;


            if(s1.left != null){
                stack.push(s1.left);
                stack.push(s2.right);
            }
            if(s1.right != null){
                stack.push(s1.right);
                stack.push(s2.left);
            }
        }
return true;
}

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


}


