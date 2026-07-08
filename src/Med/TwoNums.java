package Med;

import model.ListNode;
public class TwoNums {
    //2. Add Two Numbers
    //Working
    public static void main(String[] args) {
        int[] arr1 = {0};
        int[] arr2 = {7,3};
        ListNode node1 = ListNode.createLL(arr1);
        ListNode node2 = ListNode.createLL(arr2);
        ListNode.displayLL(twoSum(node1, node2));
    }

    private static ListNode twoSum(ListNode node1, ListNode node2) {
        int cf = 0;
        ListNode res = null;
        ListNode temp = res;
        while(node1!=null && node2!=null) {
            ListNode.displayLL(node1);
            ListNode.displayLL(node2);
            if(temp== null) {
                temp = new ListNode(cf + node1.val + node2.val);
                res = temp;
            } else {
                temp.next = new ListNode(cf + node1.val + node2.val);
                temp = temp.next;
            }

            if(temp.val>=10) {
                cf = 1;
                temp.val = temp.val - 10;
            } else cf = 0;
            node1 = node1.next;
            node2 = node2.next;
        }
        while (node1!=null) {
            ListNode.displayLL(node1);
            temp.next = new ListNode(cf + node1.val);
            temp = temp.next;
            if(temp.val < 10) {
                cf = 0;
                temp.next = node1.next;
                break;
            }
            temp.val = temp.val - 10;
            node1 = node1.next;
        }
        while(node2!=null) {
            ListNode.displayLL(node2);
            temp.next = new ListNode(cf + node2.val);
            temp = temp.next;
            if(temp.val < 10) {
                cf = 0;
                temp.next = node2.next;
                break;
            }
            temp.val = temp.val - 10;
            node2 = node2.next;
        }

        if(cf==1) {
            temp.next = new ListNode(1);
        }
        System.out.println("res");
        return res;
    }
}
