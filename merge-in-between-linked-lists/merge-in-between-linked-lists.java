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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i=0, j=0;
     
        ListNode p = list1, q = list1, end = list2;
        
        while( i < a-1){
            p = p.next;
            i++;
        }
        
        while( j < b){
            q = q.next;
            j++;
        }
        
        while(end.next != null){
            end = end.next;
        }
        
        p.next = list2;
        end.next = q.next;
        
        return list1;
        
    }
}