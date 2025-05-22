package Easy.LinkedList;

import model.ListNode;

public class removeDups {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        ListNode head = createLL(arr);
        displayLL(head);
        System.out.println();
        head = deleteDuplicates(head);
        displayLL(head);
    }

    private static void displayLL(ListNode head) {
        while(head!=null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
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

    private static ListNode createLL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp=temp.next;
        }
        return head;
    }
}
