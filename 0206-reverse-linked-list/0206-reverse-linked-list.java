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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        if(cur==null){
            return prev;
        }
        /////not so imp
        if(cur.next==null){
            cur.next=prev;
            prev.next=null;
            return cur;
        }
        /////////////
        ListNode nxt=cur.next;
        prev.next=null;
        while(cur!=null){
            cur.next=prev;
            prev=cur;
            cur=nxt;
            if(cur==null){
                ;
            }
            else{
            nxt=cur.next;
            }
        }
        return prev;
    }
}