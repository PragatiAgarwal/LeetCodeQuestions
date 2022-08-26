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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        ListNode head1 = head;
        int count = 1;
        // find the middle node
        while(head1.next != null) {
            count++;
            head1= head1.next;
        }
     
        ListNode head2 = head;
        int mid = 0;
        // if(count % 2 == 1){
        //     mid = count/2 + 1 ;
        // }
        // else{
        //     mid = count/2  ;
        // }
        mid= count/2;
   
        while(mid != 0){
            head2 = head2.next;
            mid--;
        }
        
        //reverse the list
        ListNode p = head2, q = p.next, r = q;
        while(q != null){
            r = r.next;
            q.next = p;
            p = q;
            q = r;
           
        }
        
       // if(count % 2 == 1){
       //      mid = count/2 + 1 ;
       //  }
       //  else{
       //      mid = count/2  ;
       //  }
        mid = count/2;
        System.out.print(mid);
       System.out.print(count);
        while(mid != 0){
            if(head.val != head1.val){
                
                return false;
            }
            head = head.next;
            head1 = head1.next;
            mid--;
        }
        
        return true;
        
    }
}