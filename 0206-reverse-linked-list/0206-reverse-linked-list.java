class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode after = null, current = head, previous = null;
        while(current != null){
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }
        return previous;
    }
}