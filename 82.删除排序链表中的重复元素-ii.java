/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode sNode = new ListNode(-101, head);
        ListNode curNode = sNode;
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        while(secondNode != null) {
            if (firstNode.val == secondNode.val) {
                int v = firstNode.val;
                while(secondNode != null && secondNode.val == v) {
                    secondNode = secondNode.next;
                }
                curNode.next = secondNode;
                firstNode = secondNode;
                if (firstNode != null) {
                    secondNode = firstNode.next;
                }
            } else {
                firstNode = firstNode.next;
                secondNode = secondNode.next;
                curNode = curNode.next;
            }
            
        }
        return sNode.next;
    }
}
// @lc code=end

