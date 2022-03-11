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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
       
        int temp = 0;
        
        int size = 0;
        ListNode q = head;
        while(q!= null){
            q = q.next;
            size++;
        }
        
        if(k>size){
            k=k%size;
        }
        
        while(k>0){
             ListNode p = head;
            while(p.next.next!= null){
               p = p.next;
               
            }
            p.next.next = head;
            head = p.next;
            p.next = null;
            k--;
        }
        
        return head;
    }
}