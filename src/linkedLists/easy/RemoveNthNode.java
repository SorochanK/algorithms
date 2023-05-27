package linkedLists.easy;

public class RemoveNthNode {
//    https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
//Remove Nth Node From End of List
//    Given the head of a linked list, remove the nth node from the end of the list and return its head.
    public static void main(String[] args) {
        ListNode list = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));
        ListNode result = removeNthFromEnd(list, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
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
