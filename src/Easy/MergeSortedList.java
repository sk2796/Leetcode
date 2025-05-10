package Easy;


import model.ListNode;

public class MergeSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(3, null);
        ListNode l3 = new ListNode(4, null);
        l1.next=l2;
        l2.next = l3;

        ListNode l4 = new ListNode(1,null);
        ListNode l5 = new ListNode(2, null);
        ListNode l6 = new ListNode(4, null);
        l4.next = l5; l5.next = l6;

        ListNode res = mergerSorted(l1, l4);
        displayLN(res);
    }

    private static void displayLN(ListNode res) {
        System.out.println();
        ListNode temp = res;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    private static ListNode mergerSorted(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode curr = preHead;
        while(l1!=null && l2!=null) {
            if(l1.val<=l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next= l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1==null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        return preHead.next;
    }
}
