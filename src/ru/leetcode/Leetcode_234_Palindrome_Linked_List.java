package ru.leetcode;

public class Leetcode_234_Palindrome_Linked_List {
    public class ListNode {
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

        class Solution {
            public boolean isPalindrome(ListNode head) {
                if(head==null || head.next == null){
                    return true;
                }
                ListNode slow = head, fast = head, prev, temp;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                prev = slow;
                slow = slow.next;
                prev.next = null;

                while (slow != null) {
                    temp = slow.next;
                    slow.next = prev;
                    prev = slow;
                    slow = temp;
                }
                slow = prev;
                fast = head;
                while (slow != null) {
                    if (fast.val != slow.val)
                        return false;
                    slow = slow.next;
                    fast = fast.next;
                }
                return true;
            }
        }
    }
}
