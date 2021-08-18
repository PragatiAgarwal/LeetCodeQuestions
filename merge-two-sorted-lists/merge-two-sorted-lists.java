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
        ListNode l3= null, r = null;
        ListNode p = l1, q = l2;
        while(p != null && q !=null){
            if(p.val < q.val){
                ListNode node = new ListNode(p.val);
                
                if(l3 == null){
                    l3 = node;
                    r = node;
                }
                else{
                    r.next = node;
                    r = node;
                }
               // ListNode node1 = new ListNode(q.val);
               // r.next = node1;
               // r = r.next;
                p = p.next;
                //q = q.next;
            }
            else{
                 ListNode node = new ListNode(q.val);
                
                if(l3 == null){
                    l3 = node;
                    r = node;
                }
                else{
                    r.next = node;
                    r = node;
                }
               // ListNode node1 = new ListNode(p.val);
               // r.next = node1;
               // r = r.next;
               // p = p.next;
                q = q.next;
            }
            
            
        }
        
        while( p != null){
            ListNode node = new ListNode(p.val);
             if(l3 == null){
                    l3 = node;
                    r = node;
                }
           else{ r.next = node;
                r = r.next;
               }
           
            p=p.next;
        }
        
         while( q != null){
            ListNode node = new ListNode(q.val);
            if(l3 == null){
                    l3 = node;
                    r = node;
                }
           else{ r.next = node;
                r = r.next;
               }
           
           
             q=q.next;
        }
        
        return l3;
    }
}