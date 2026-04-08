package BT;

import model.BTNode;

import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {

//        Thread t1 = new Thread("tdfs");
//        Thread.State state = t1.getState();
//        t1.start();
//        System.out.println(state.name());
//        System.out.println(t1);

        BTNode root = BTNode.createBTNode();
        System.out.println("Preorder : ");
        preOrder(root);
        System.out.println("\nInorder : ");
        inOrder(root);
        System.out.println("\nPostorder : ");
        postOrder(root);
        System.out.println("\nPreorder iterative : ");
        preOrderIterative(root);
        System.out.println("\nInorder iterative : ");
        inOrderIterative(root);
        System.out.println("\npostorder iterative : ");
        postOrderIterative(root);
        System.out.println("\nCount : "+countOfNodes(root));
        System.out.println("\nHeight : "+heightOfTree(root));

    }

    public static int countOfNodes(BTNode node) {
        int x, y;
        if(node != null) {
            x = countOfNodes(node.left);
            y = countOfNodes(node.right);
            return x + y + 1;
        }
        return 0;
    }

    public static int heightOfTree(BTNode node) {
        if(node == null) {
            return 0;
        }
        int x = 0 , y=0 ;
        x = heightOfTree(node.left);
        y = heightOfTree(node.right);
        return (x > y) ? x +1 : y+1;
    }

    private static void postOrderIterative(BTNode node) {
        Stack<BTNode> st = new Stack<>();
        while(!st.isEmpty() || node!=null) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                node = st.pop();
                if(node.data>0) {
                    node.data = - node.data;;
                    st.push(node);
                    node = node.right;
                } else {
                    System.out.print(-node.data+" ");
                    node = null;
                }
            }
        }
    }

    private static void inOrderIterative(BTNode node) {
        Stack<BTNode> st = new Stack<>();
        while(!st.isEmpty() || node!=null) {
            if(node!=null) {
                st.push(node);
                node = node.left;
            }
            else {
                node = st.pop();
                System.out.print(node.data+" ");
                node = node.right;
            }
        }
    }

    private static void preOrderIterative(BTNode node) {
        Stack<BTNode> st = new Stack<>();
        while(!st.isEmpty() || node!=null) {
            if(node!=null) {
                System.out.print(node.data+ " ");
                st.push(node);
                node = node.left;
            }
            else {
                node = st.pop();
                node = node.right;
            }
        }

    }

    private static void postOrder(BTNode root) {
        if (root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void inOrder(BTNode root) {
        if(root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(BTNode root) {
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
