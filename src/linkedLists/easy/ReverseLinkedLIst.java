package linkedLists.easy;

public class ReverseLinkedLIst {

//    https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
//     Reverse Linked List
//    Given the head of a singly linked list, reverse the list, and return the reversed list.

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = reverseList(list);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode previousLink = null;
        while (head != null) {
            ListNode futureLink = head.next;
            head.next = previousLink;
            previousLink = head;
            head = futureLink;
        }
        return previousLink;
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