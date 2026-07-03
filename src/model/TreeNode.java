package model;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTree(int[] arr) {
        if(arr.length==0) {
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if(temp.left==null && i<arr.length) {
                temp.left = new TreeNode(arr[i++]);
                queue.offer(temp.left);
            }
            if(temp.right==null && i<arr.length) {
                temp.right = new TreeNode(arr[i++]);
                queue.offer(temp.right);
            }
        }
        inOrder(root);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if(root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }
}
