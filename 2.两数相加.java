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
        ListNode head = l1;
        while(l1.next != null && l2.next != null)
        {
            l1.val += l2.val;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1.next == null)
        {
            l1.next = l2.next;
            l1.val += l2.val;
        }
        else{
            l1.val += l2.val;
        }
        l1 = head;
        while(l1 != null)
        {
            if(l1.val >= 10)
            {
                if(l1.next == null)
                {
                    l1.next = new ListNode(0);
                }
                l1.next.val += 1;
                l1.val -= 10;
                l1 = head;
            }
            l1 = l1.next;
        }
        return head;
    }
}
// @lc code=end
