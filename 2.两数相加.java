import java.util.ListResourceBundle;

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while (l1 != null && l2 != null) {
            if (ret.next == null) {
                ret.next = new ListNode(0);
            }
            ret = ret.next;
            ret.val += l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null) {
        } else {

            if (l1 == null) {
                if (ret.next != null) {
                    ret.next.val += l2.val;
                    ret.next.next = l2.next;
                } else {
                    ret.next = l2;
                }
            } else {
                if (ret.next != null) {
                    ret.next.val += l1.val;
                    ret.next.next = l1.next;
                } else {
                    ret.next = l1;
                }
            }
        }
        ret = head.next;
        while (ret != null) {
            if (ret.val >= 10) {
                if (ret.next == null) {
                    ret.next = new ListNode(0);
                }
                ret.next.val += 1;
                ret.val -= 10;
                ret = head.next;
            }
            ret = ret.next;
        }
        return head.next;
    }
}
// @lc code=end
