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
    public boolean hasCycle(ListNode head) {
        Set<Integer> seen = new HashSet<>();
        ListNode cur = head;

        if (cur == null) return false;

        while (cur.next != null) {
            int curVal = cur.val;
            if (seen.contains(curVal)) {
                return true;
            }
            seen.add(curVal);
            cur = cur.next;
        }

        return false;
    }
}
