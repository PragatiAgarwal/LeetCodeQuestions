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
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode l3 = new ListNode();
        ListNode head = null;
        int carry = 0;
        
        while(l1 != null && l2 != null){
            if(head == null){
                l3.val = l1.val+l2.val+ carry;
                carry = l3.val/10;
                l3.val = l3.val % 10;
                
                head = l3;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            else{
                ListNode node = new ListNode();
                node.val = l1.val+l2.val + carry;
                carry = node.val/10;
                node.val = node.val % 10;
                head.next = node;
                head = node;
                l1 = l1.next;
                l2 = l2.next;
                
            }
        }
        
        while(l1 != null){
            ListNode node = new ListNode();
            node.val = l1.val + carry;
            carry = node.val/10;
            node.val = node.val % 10;
            head.next = node;
            head = node;
            l1 = l1.next;
                
            }
        
    
         while(l2 != null){
            ListNode node = new ListNode();
            node.val = l2.val + carry;
            carry = node.val/10;
            node.val = node.val % 10;
            head.next = node;
            head = node;
            l2 = l2.next;
                
            }
        
        if(carry != 0){
            ListNode node = new ListNode();
            node.val =  carry;
            head.next = node;
            head = node;
        }
    
    return l3;
        
    }
}