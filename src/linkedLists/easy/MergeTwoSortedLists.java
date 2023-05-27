package linkedLists.easy;


public class MergeTwoSortedLists {

    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/771/
//    Merge Two Sorted Lists
//    You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
    public static void main(String[] args) {
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

        mergeTwoLists(list1, list2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode handler = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                handler.next = list1;
                list1 = list1.next;
            } else {
                handler.next = list2;
                list2 = list2.next;
            }
            handler = handler.next;
        }

        if (list1 != null) {
            handler.next = list1;
        } else if (list2 != null) {
            handler.next = list2;
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
