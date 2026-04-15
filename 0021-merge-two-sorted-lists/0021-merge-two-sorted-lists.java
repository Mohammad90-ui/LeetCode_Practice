class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if(a==null || b==null) return a==null ? b : a;
        if(a.val > b.val) {ListNode t = a; a = b; b = t;}
        a.next = mergeTwoLists(a.next, b);
        return a;
    }
}