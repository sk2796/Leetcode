package Easy.newStart;

import model.ListNode;

import static model.ListNode.createLL;
import static model.ListNode.displayLL;

public class MergeTwoSortList {

    //21. Merge Two Sorted Lists
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,8,10,15};
        int[] arr2 = {1,3,4,5,6,10};

        ListNode head = createLL(arr1);
        displayLL(head);
        ListNode node2 = createLL(arr2);
        displayLL(node2);
        displayLL(mergeTwoList(head, node2));
    }

    private static ListNode mergeTwoList(ListNode node1, ListNode node2) {

        ListNode temp = new ListNode(-1);
        ListNode head = temp;

        while (node1!=null && node2!= null) {
            if(node1.val<= node2.val) {
                temp.next = node1;
//                temp = temp.next;
                node1 = node1.next;
            } else {
                temp.next = node2;
                node2 = node2.next;
            }
            temp = temp.next;
        }
        if(node1!=null) {
            temp.next = node1;
        }
        if(node2!=null) {
            temp.next = node2;
        }

        return head.next;
    }


}
