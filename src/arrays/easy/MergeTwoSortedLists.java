package arrays.easy;


public class MergeTwoSortedLists {
    //    https://leetcode.com/problems/merge-two-sorted-lists/
//    Merge Two Sorted Lists
//    You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
    public static void main(String[] args) {

//        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list1 = new ListNode(1,
                new ListNode(1,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(5,
                                                        new ListNode(6)
                                                ))
                                ))
                ));
        ListNode list2 = new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(4)))));

        ListNode result = mergeTwoLists(list1, list2);
        System.out.println(result);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode handler = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }

        if (l1 != null) {
            handler.next = l1;
        } else if (l2 != null) {
            handler.next = l2;
        }

        return head.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
