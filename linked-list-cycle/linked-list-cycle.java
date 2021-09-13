/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null ){
            if(first.next != null){
                first = first.next;
                if(second.next != null && second.next.next!= null){
                second = second.next.next;
            }
                else return false;
            }
            else return false;
            
            if(first == second){
                return true;
            }
        }
        return false;
    }
}