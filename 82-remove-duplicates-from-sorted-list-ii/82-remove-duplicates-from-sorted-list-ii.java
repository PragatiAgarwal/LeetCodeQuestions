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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        while(p!= null && p.next != null){
            
            if(p.val == p.next.val){
                while(p != null && p.next!= null && p.val == p.next.val){
                    p.next = p.next.next;
                }
                if(p.val == q.val){
                    
                    q = p.next;
                    p = p.next;
                    head = p;
                    
                }
                else{
                    q.next = p.next;
                    p = q.next;
                } 
                
            }
             else{
                 q = p;
                 p = p.next;
                 
             }
        }
        
        
        
        return head;
        
        
    }
}