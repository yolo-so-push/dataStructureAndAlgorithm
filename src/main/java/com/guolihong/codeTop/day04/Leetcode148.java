package com.guolihong.codeTop.day04;

import com.guolihong.codeTop.day01.ListNode;

public class Leetcode148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 首先计算链表的长度
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        // 创建一个哑节点作为合并后的链表的头节点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        // 自底向上进行归并，每次将链表分成若干个长度为step的子链表，并两两合并
        for (int step = 1; step < length; step <<= 1) {
            ListNode prev = dummyHead;
            ListNode curr = dummyHead.next;
            while (curr != null) {
                // 找到第一个子链表
                ListNode head1 = curr;
                for (int i = 1; i < step && curr.next != null; i++) {
                    curr = curr.next;
                }
                // 找到第二个子链表
                ListNode head2 = curr.next;
                curr.next = null;
                curr = head2;
                for (int i = 1; i < step && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }
                // 分割第二个子链表
                ListNode next = null;
                if (curr != null) {
                    next = curr.next;
                    curr.next = null;
                }
                // 合并两个子链表
                ListNode merged = merge(head1, head2);
                // 将合并后的链表接回原链表
                prev.next = merged;
                while (prev.next != null) {
                    prev = prev.next;
                }
                // 更新当前节点为下一个未合并的子链表
                curr = next;
            }
        }

        return dummyHead.next;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode sen=new ListNode(-1);
        ListNode p=sen;
        while (left!=null&&right!=null){
            if (left.val<=right.val){
                p.next=left;
                left=left.next;
            }else{
                p.next=right;
                right=right.next;
            }
            p=p.next;
        }
        p.next=left==null?right:left;
        return sen.next;
    }

    public static void main(String[] args) {
        Leetcode148 leetcode148=new Leetcode148();
        ListNode listNode = leetcode148.sortList(new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4,new ListNode(0))))));
        System.out.println(listNode);
    }
}
