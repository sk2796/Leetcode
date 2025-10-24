package Easy.LinkedList;

import model.ListNode;

import static model.ListNode.createLL;
import static model.ListNode.displayLL;

public class removeDups {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        ListNode head = createLL(arr);
        displayLL(head);
        System.out.println();
        head = deleteDuplicates(head);
        displayLL(head);
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null) {
            if(temp.val!= temp.next.val) {
                temp = temp.next;
            } else temp.next = temp.next.next;
        }
        return head;
    }


}
