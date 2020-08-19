/**
 * @author caifx
 * @create Created in 21:23 2020/8/4
 * @modified By:
 * Reverse a singly linked list.
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 **/
public class ReversLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){ this.val = val; this.next = next;}
    }

    public ListNode reverseListForce(ListNode head) {
        ListNode prev = null;
        while(head !=null ){
            ListNode curr = new ListNode(head.val);
            curr.next = prev;
            prev = curr;

            head = head.next;
        }

        return prev;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode curr = null;

        while(prev != null){
            ListNode temp = prev;
            prev =prev.next;
            temp.next = curr;
            curr = temp;
        }
        return curr;
    }
}
