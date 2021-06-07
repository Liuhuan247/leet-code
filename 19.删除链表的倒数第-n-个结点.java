/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sensilNode = new ListNode(0, head);
        ListNode firstNode = sensilNode;
        ListNode secondNode = head;
        while(n-- != 0) {
            secondNode = secondNode.next;
        }
        while (secondNode != null) {
            secondNode = secondNode.next;
            firstNode = firstNode.next;
        }
        firstNode.next = firstNode.next.next;
        return sensilNode.next;
    }
}
// @lc code=end

