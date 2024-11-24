package itheima.day01;

public class Leetcode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        if (lists.length==1){
            return lists[0];
        }
        return split(lists,0,lists.length-1);
    }

    private ListNode split(ListNode[] lists, int i, int j) {
        if (i==j){
            return lists[i];
        }
        if (i+1==j){
            return mergeTwoLists(lists[i],lists[j]);
        }
        int m=(i+j)>>1;
        ListNode left = split(lists, i, m);
        ListNode right = split(lists, m + 1, j);
        return mergeTwoLists(left,right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sen=new ListNode(-1,null);
        ListNode p=sen;
        while (list1!=null&&list2!=null){
            if (list1.val< list2.val){
                p.next=list1;
                list1=list1.next;
            }else{
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
        }
        if (list1!=null){
            p.next=list1;
        }
        if (list2!=null){
            p.next=list2;
        }
        return sen.next;
    }
}
