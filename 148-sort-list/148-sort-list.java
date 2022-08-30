class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    public ListNode mergeSort(ListNode head){
        if(null == head || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode nextHead = mid.next;
        mid.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextHead);
        return merge(left, right);
    }
    
    public ListNode merge(ListNode one, ListNode two){
        if(null == one) return two;
        if(null == two) return one;
        ListNode root = new ListNode();
        ListNode prev = root;
        while(one != null && two != null){
            if(one.val <= two.val){
                prev.next = one;
                one = one.next;
            }else{
                prev.next = two;
                two = two.next;
            }
            prev = prev.next;
        }
        prev.next = one == null ? two : one;
        return root.next;
    }
    
    public ListNode getMid(ListNode head){
        if(null == head) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}