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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        
        ListNode p = head, rem = head;
        while(p != null){
            if(p.val == val){
                if(p == head){
                    head = p.next;
                    rem = head;
                    p = p.next;
                }
                
                else{
                    rem.next = p.next;
                    p = p.next;
                    
                }
            }
            else{
                rem = p;
                p = p.next;
            }
        }
        
        return head;
        
    }
}