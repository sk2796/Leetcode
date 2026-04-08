package model;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BTNode {

    public int data;
    public BTNode left;
    public BTNode right;
    public static Queue<BTNode> queue = new ArrayDeque<>();

    public BTNode(int data) {
        this.data = data;
    }

    public BTNode(BTNode left, int data, BTNode right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public BTNode() {
    }

    public static BTNode createBTNode() {
        System.out.println("Enter Root :");
        Scanner sc = new Scanner(System.in);
        int root = sc.nextInt();
        BTNode rootNode = new BTNode(root);
        queue.offer(rootNode);
        while(!queue.isEmpty()) {
            BTNode temp = queue.remove();
            System.out.println("Left child? Enter left data, -1 otherwise, for "+temp.data);
            int leftdata = sc.nextInt();
            if(leftdata!=-1) {
                BTNode leftNode = new BTNode(leftdata);
                temp.left= leftNode;
                queue.offer(leftNode);
            }
            System.out.println("Right child? Enter Right data, -1 otherwise,for"+temp.data);
            int rightdata = sc.nextInt();
            if(rightdata!=-1) {
                BTNode rightNode = new BTNode(rightdata);
                temp.right= rightNode;
                queue.offer(rightNode);
            }
        }
        return rootNode;
    }
}
