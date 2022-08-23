package ru.leetcode;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode iter, head= new ListNode(0);
    iter = head;
    int res = 0;
    while(l1 != null || l2 !=null || res !=0){
       if(l1 != null){
           res+= l1.val;
           l1 = l1.next;
       }
        if(l2 != null){
            res+= l2.val;
            l2 = l2.next;
        }
        System.out.println(iter.val);
        iter.next = new ListNode(res%10);
        res /= 10;
        iter = iter.next;

    }
return iter;

    }
}