//Problem Number 21- Merge Two Sorted Lists

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
public class Merge_2_Sorted_List_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode op = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                op.next = list1;
                list1 = list1.next;
            } else {
                op.next = list2;
                list2 = list2.next;
            }
            op = op.next;
        }
        op.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}