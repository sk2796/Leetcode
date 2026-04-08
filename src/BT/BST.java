package BT;

import model.BTNode;

import static BT.BinaryTree.*;

public class BST {
    public static void main(String[] args) {
        int[] arr = {12,10,7,14,18,9,3,11,6};
        BTNode root = createBSTNode(arr);
        inOrder(root);
        //insert if not found, else don't insert
        boolean found = insertKey(root, 4);
        if(!found) {
            System.out.println("\nKey inserted : ");
            inOrder(root);
        } else System.out.println("\nKey found in the tree");

        boolean keyFound = rsearch(root, 8);
        System.out.println("\nIs Key Found ? : "+keyFound);
        System.out.println("Count : "+countOfNodes(root));
        System.out.println("Height : "+heightOfTree(root));
        deleteNode(root, 8);
    }

    private static BTNode deleteNode(BTNode node, int key) {
        if(node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            return null;
        }
        if(node.data < key) {
            node.right = deleteNode(node.right, key);
        } else if(key < node.data) {
            node.left = deleteNode(node.left, key);
        } else {
            if(heightOfTree(node.left) > heightOfTree(node.right)) {
                BTNode q = InOrderPrecessor(node.left);
                node.data = q.data;
                node.left = deleteNode(node.left, q.data);
            } else {
                BTNode q = InOrderSuccessor(node.right);
                node.data = q.data;
                node.right = deleteNode(node.right, q.data);
            }
        }
        return node;
    }

    private static BTNode InOrderSuccessor(BTNode node) {
        while(node.left!=null) {
            node = node.left;
        }
        return node;
    }

    private static BTNode InOrderPrecessor(BTNode node) {
        while(node.right!=null) {
            node = node.right;
        }
        return node;
    }

    private static boolean rsearch(BTNode node, int key) {
        if(node == null) {
            return false;
        } else if (node.data == key) {
            return true;
        } else if (node.data > key) {
            return rsearch(node.left, key);
        } else return rsearch(node.right, key);
    }

    private static boolean insertKey(BTNode node, int key) {
        while(node!=null) {
            if(node.data==key) {
                return true;
            } else if(node.data>key && node.left!=null) {
                node = node.left;
            } else if (node.data< key && node.right!= null) {
                node = node.right;
            } else break;
        }
        if(node.data> key) {
            node.left = new BTNode(key);
        } else node.right = new BTNode(key);

        return false;
    }

    private static BTNode createBSTNode(int[] arr) {
        BTNode root = null;
        if(root == null) {
            root = new BTNode(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            BTNode temp = root;
            while(temp!=null) {
                if(temp.data>=arr[i] && temp.left!=null) {
                    temp = temp.left;
                } else if(temp.data<arr[i] && temp.right!=null) {
                    temp = temp.right;
                } else break;
            }
            if(temp.data>=arr[i] ) {
                temp.left = new BTNode(arr[i]);
            } else {
                temp.right = new BTNode(arr[i]);
            }
        }
        return root;
    }
}
