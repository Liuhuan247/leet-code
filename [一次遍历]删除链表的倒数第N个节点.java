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
        ListNode firstNode = new ListNode(0, head);
        int length = 0;
        ListNode tmp = head;
        while(tmp != null) {
            ++length;
            tmp = tmp.next;
        }
        ListNode cur = firstNode;
        for (int i = 1; i < length - n + 1;i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return firstNode.next;
    }
}
// @lc code=end

