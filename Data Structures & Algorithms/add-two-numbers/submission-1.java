class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode end = res;
        int add = 0;

        while (l1 != null || l2 != null || add != 0) {
            int v1 = (l1 != null ? l1.val : 0);
            int v2 = (l2 != null ? l2.val : 0);
            int sum = v1 + v2 + add;

            res.next = new ListNode(sum % 10);
            add = sum / 10;

            res = res.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }


        return end.next;
    }
}