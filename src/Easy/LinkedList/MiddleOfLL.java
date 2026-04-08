package Easy.LinkedList;

import model.ListNode;

public class MiddleOfLL {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,4,5,6};
        ListNode head = ListNode.createLL(arr);
        ListNode.displayLL(head);

        //876. Middle of the Linked List
        ListNode listNode = middleOfLL(head);
        System.out.println("Middle of LL");
        ListNode.displayLL(listNode);

        //2095. Delete the Middle Node of a Linked List
        System.out.println("Middle element deleted of LL");
        ListNode.displayLL(deleteMiddleOfLL(head));
    }

    private static ListNode deleteMiddleOfLL(ListNode head) {
        if(head.next==null) {
            return null;
        }
        ListNode fast = head;
        ListNode preSlow = new ListNode(-1);
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            preSlow = slow;
            slow = slow.next;
        }
        while (fast.next!=null) {
            fast = fast.next;
            preSlow = slow;
            slow = slow.next;
        }
        preSlow.next = slow.next;
        return head;
    }

    private static ListNode middleOfLL(ListNode head) {
        int countFirst = 1, countMiddle=1;
        ListNode temp = head;
        while (temp!=null) {
            temp = temp.next;
            countFirst++;
            if(countMiddle < ((countFirst+1)/2)) {
                countMiddle++;
                head = head.next;
            }
        }
        return head;
    }
}