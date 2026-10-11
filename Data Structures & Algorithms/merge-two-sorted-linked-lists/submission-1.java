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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=null,head=null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1!=null&&list2!=null&&list1.val<=list2.val)
        {
            head=list1;
            curr=head;
            list1=list1.next;
        }
        else if(list1!=null&&list2!=null&&list2.val<=list1.val)
        {
            head=list2;
            curr=head;
            list2=list2.next;
        }
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
              //  prev=curr;
                curr.next=list1;
                curr=list1;
                list1=list1.next;

            }
            else
            {
               // prev=curr;
                curr.next=list2;
                curr=list2;
                list2=list2.next;
            }
        }
        if(list1==null)
        {
            curr.next=list2;

        }
        else if(list2==null)
        {
            curr.next=list1;
        }
        return head;

    }
}