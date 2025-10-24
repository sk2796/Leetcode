package Easy.recursion;

import model.ListNode;

import static model.ListNode.createLL;
import static model.ListNode.displayLL;

public class ReverseLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = createLL(arr);
        displayLL(head);
        System.out.println();
        head = reverseLL(head);
        displayLL(head);
    }

    private static ListNode reverseLL(ListNode head) {
        return head;
    }
}
