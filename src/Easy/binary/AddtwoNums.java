package Easy.binary;

import model.ListNode;

import static model.ListNode.createLL;
import static model.ListNode.displayLL;

public class AddtwoNums {
    public static void main(String[] args) {
        int[] a1 = {1,6,0,3,3,6,7,2,0,1};
        int[] a2 = {6,3,0,8,9,6,6,9,6,1};
        ListNode head = createLL(a1);
        displayLL(head);
        ListNode head2 = createLL(a2);
        displayLL(head2);
        head = addTwoLL(head, head2);
        displayLL(head);
    }

    private static ListNode addTwoLL(ListNode head, ListNode head2) {
        int cf = 0;
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while(head!=null || head2!=null || cf>0) {
            int sum = 0;
            if(head!=null) {
                sum = sum + cf + head.val;
                cf =0;
                head = head.next;
            }
            if(head2!=null) {
                sum = sum + cf + head2.val;
                cf = 0;
                head2 = head2.next;
            }
            if(sum>0|| head!=null || head2!=null) {
                ListNode newNode = new ListNode(sum%10);
                cf = sum/10;
                temp.next = newNode;
                temp = temp.next;
            } else {
                ListNode newNode = new ListNode(cf);
                cf=0;
                temp.next = newNode;
//                temp = temp.next;
            }
        }
        return res.next;
    }

    //TIME LIMIT EXCEEDED - WORKING CODE
    private static ListNode addTwoLL2(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        int cf = 0;
        ListNode prev = new ListNode(-1);
        while(temp!=null || l2!=null) {
            if(temp!=null && l2!=null) {
                temp.val = cf + temp.val + l2.val;
                if(temp.val>=10) {
                    cf = temp.val / 10;
                    temp.val = temp.val%10;
                } else cf =0;
                prev.next = temp;
                temp = temp.next;
                l2 = l2.next;
            } else if(temp!=null) {
                temp.val = cf + temp.val;
                if(temp.val>=10) {
                    cf = temp.val / 10;
                    temp.val = temp.val%10;
                } else cf =0;
                prev.next= temp;
                temp=temp.next;
            }
            else {
                temp = l2;
                prev.next = temp;
                temp.val = cf + temp.val;
                if(temp.val>=10) {
                    cf = temp.val / 10;
                    temp.val = temp.val%10;
                } else cf = 0;
                temp=temp.next;
            }

        }
        if(cf>0) {
            ListNode newNode = new ListNode(1);
            prev.next.next = newNode;
        }
        return l1;
    }

    //TIME LIMIT EXCEEDED - WORKING CODE
    private static ListNode addTwoLL1(ListNode l1, ListNode l2) {
        int cf = 0;
        ListNode prev = new ListNode(-1);
        ListNode temp = l1;
        while(temp!=null && l2!=null) {
            temp.val = cf + temp.val + l2.val;
            if(temp.val>=10){
                temp.val = temp.val %10;
                cf = 1;
            } else cf = 0;
            prev.next = temp;
            temp = temp.next;
            l2 = l2.next;
        }
        if(l2!=null) {
            temp = prev.next;
            temp.next = l2;
            temp=temp.next;
        }
        while(temp!=null ) {
            temp.val = cf + temp.val;
            if(temp.val==10){
                temp.val = 0;
                cf = 1;
                prev.next = temp;
                temp=temp.next;
            } else cf = 0;
        }
        if(cf==1) {
            if(temp!=null) {
                temp.val = cf + temp.val;
            } else temp = prev.next;
            ListNode newNode = new ListNode(cf);
            temp.next = newNode;
        }
        return l1;
    }
}
