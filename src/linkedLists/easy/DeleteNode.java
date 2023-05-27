package linkedLists.easy;


public class DeleteNode {

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/

//    Delete Node in a Linked List
//    There is a singly-linked list head and we want to delete a node node in it.
//
//You are given the node to be deleted node. You will not be given access to the first node of head.
//
//All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

    public static void main(String[] args) {
        ListNode list = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));
        ListNode nodeToDelete = list.next.next;
        deleteNode(nodeToDelete);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
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
