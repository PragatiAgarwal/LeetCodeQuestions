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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode l3 = null, r = null;
        ListNode p = l1, q=l2;
        while(p != null && q != null){
            ListNode node = new ListNode();
            if(p.val > q.val){
                node.val = q.val; 
                q = q.next;
            }
                 
            else{
                node.val = p.val;
                p = p.next;
            }
               
            if(r == null){
                l3 = node;
                r = node;
            }
            
            else {
                r.next = node;
                r = node;
            }
        }
        
        while(p != null){
            ListNode node = new ListNode(p.val);
            r.next = node;
            r = node;
            p = p.next;
        }
        
        while(q != null){
            ListNode node = new ListNode(q.val);
            r.next = node;
            r = node;
            q = q.next;
        }
        
        return l3;
    }
}
