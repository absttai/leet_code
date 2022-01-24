

/**
 * 链表反转 力扣
 * 206 题
 * @author 13303
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(4))));
        ListNode listNode = xieMen(head);
        System.out.println(listNode.toString());
    }

    /**
     * 迭代解法
     *
     * @param head
     * @return
     */
    public static ListNode dieDai(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 递归解法
     *
     * @param head
     * @return
     */
    public static ListNode diGui(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = diGui(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 邪门歪路
     *
     * @param head
     * @return
     */
    public static ListNode xieMen(ListNode head) {
        ListNode pre = null;
        for (ListNode x = head; x != null; x = x.next) {
            pre = new ListNode(x.var, pre);
        }
        return pre;
    }


}

class ListNode {
    int var;
    ListNode next;

    ListNode() {

    }

    ListNode(int var) {
        this.var = var;
    }

    ListNode(int var, ListNode next) {
        this.var = var;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "var=" + var +
                ", next=" + next +
                '}';
    }
}