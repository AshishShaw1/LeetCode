class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(stack.peek() != temp.val){
                return false;
            }
            stack.pop();
            temp = temp.next;
        }
        return true;
    }
}