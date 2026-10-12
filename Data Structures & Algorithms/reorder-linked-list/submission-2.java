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
    public void reorderList(ListNode head) {
        ListNode mid=null,list2=null,nhead=head;int count=0;
        if(head==null||head.next==null) return ;
        mid=findMid(head);
    
        list2=mid.next;
            mid.next=null;
                ListNode list1=head.next;
    
        list2=doreverse(list2);
        ListNode curr=head;
        while(list1!=null&&list2!=null)
        {
            if(count%2==0)
            {
               curr.next=list2;
               list2=list2.next; 
               curr=curr.next;
               count++;

            }
            else{
                curr.next=list1;
                list1=list1.next;
                curr=curr.next;
                count++;
            }
        }
        if(list1==null) curr.next=list2;
        if(list2==null) curr.next=list1;
        head=nhead;
       // return nhead;

        
    }
    public ListNode findMid(ListNode head)
    {
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode doreverse(ListNode head)
    {
        ListNode nextpt=head,curr=null,prev=null;
        while(nextpt!=null)
        {
            curr=nextpt;
            //curr.next=prev;
            //prev=curr;
            nextpt=nextpt.next;
            curr.next=prev;
            prev=curr;
        }
        return curr;
            }
}
