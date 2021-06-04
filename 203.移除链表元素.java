/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode firstNode = new ListNode(0);
        firstNode.next = head;
        ListNode curNode = head;
        ListNode prevNode = firstNode;
        while (curNode != null) {
            if (curNode.val == val) {
                prevNode.next = curNode.next;
            } else {
                prevNode = curNode;
            }
            curNode = curNode.next;
        }
        return firstNode.next;
    }
}
// @lc code=end

