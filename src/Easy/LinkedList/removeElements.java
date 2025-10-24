package Easy.LinkedList;

import model.ListNode;

import static Easy.LinkedList.removeDups.displayLL;
import static model.ListNode.createLL;

public class removeElements {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7};
        ListNode head = createLL(arr);
        displayLL(head);
        System.out.println();
        head = removeElementsR(head, 7);
        displayLL(head);
    }

    private static ListNode removeElementsR(ListNode head, int val) {
        while(head!=null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        while(temp!=null && temp.next!=null) {
            if(temp.next.val != val) {
                temp= temp.next;
            } else temp.next = temp.next.next;
        }
        return head;
    }
}
