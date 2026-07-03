package Easy.tree;

import com.sun.security.auth.NTDomainPrincipal;
import model.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        int[] arr = {5,4,8,11,0,13,4,7,2,0,0,0,1};
        int target = 13;
        TreeNode root = TreeNode.createTree(arr);
        System.out.println();
        System.out.println("isSymmetric : "+isSymmetricTree(root.left, root.right));
        System.out.println("Length of Tree : "+lengthOfTree(root));
        System.out.println("Path Sum : "+pathSum(root, target));
    }

    // 112. Path Sum
    private static boolean pathSum(TreeNode root, int target) {
        if(target<0 || root== null) {
            return false;
        }



        return false;
    }

    //104. Maximum Depth of Binary Tree
    private static int lengthOfTree(TreeNode root) {
        if(root.left==null && root.right==null) {
            return 1;
        } else {
            int x = lengthOfTree(root.left);
            int y = lengthOfTree(root.right);
            return x > y ? x+1 : y+1;
        }
    }

    //101. Symmetric Tree
    private static boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if(left==null || right== null || (left==null && right==null)) {
            return true;
        }
        if(right.val!= left.val ) {
            return false;
        } else {
            boolean x = isSymmetricTree(left.left, right.right);
            boolean y = isSymmetricTree(left.right, right.left);
            return x && y;
        }
    }

}
