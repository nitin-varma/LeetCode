class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = curr;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<ListNode>();

        ListNode temp = head;
        if (head == null)
            return head;

        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }
        if (st.isEmpty())
            return null;

        ListNode res = st.pop();
        temp = res;
        while (!st.isEmpty()) {
            temp.next = st.pop();
            temp = temp.next;
            if (st.isEmpty())
                temp.next = null;
        }
        return res;
    }
}
