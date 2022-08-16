package ru.leetcode;

public class Leetcode_206_ReversedLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        class Solution {
            public ListNode reverseList(ListNode head) {

                ListNode temp = new ListNode();
               while(head != null){
                   temp.next = new ListNode(temp.val);
                   temp = head;
                   head = head.next;
               }
               temp.next = new ListNode(22);
               return temp;
            }}}}
