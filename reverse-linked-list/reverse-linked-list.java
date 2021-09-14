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
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode p = head;
        while(p!= null){
            if(p == head){
                p = p.next;
                head.next = null;
            }
            
            else{
                ListNode q = p.next;
                p.next = head;
                head = p;
                p = q;
                
            }
        }
        
        return head;
    }
}