/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head == NULL || head->next == NULL) return head;
    struct ListNode *first = head;
    struct ListNode *second = head->next;
    while(second != NULL){
        if(first->val == second->val) second = second->next;
        else{
            first->next = second;
            first = second;
            second = second->next;
        }
    }
    first->next = NULL;
    return head;
}