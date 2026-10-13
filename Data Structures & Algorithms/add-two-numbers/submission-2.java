/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(-1);
        ListNode curr=dummy;
        int count=0;
        while(l1!=null&&l2!=null)
        {
            int a =l1.val;
            int b =l2.val;
            int n= a+b+count;
            int val=n%10;
            count = n/10;
            ListNode digit = new ListNode(val);
            curr.next=digit;
            l1=l1.next;
            l2=l2.next;
            curr=curr.next;

        }
        if(l1==null )
        {
            while(l2!=null)
            {
                int n=l2.val+count;
                int val=n%10;
                ListNode digit= new ListNode(val);
                count=n/10;
                curr.next=digit;
                l2=l2.next;
                curr=curr.next;
            }
        }
        if(l2==null)
        {
            while(l1!=null)
            {
                int n=l1.val+count;
                int val=n%10;
                ListNode digit = new ListNode(val);
                count=n/10;
                curr.next=digit;
                l1=l1.next;
                curr=curr.next;
            }
        }
        if(count!=0)
        {
            ListNode digit = new ListNode(count);
            curr.next=digit;
            curr=curr.next;
                    }
        return dummy.next;
        
    }
}
