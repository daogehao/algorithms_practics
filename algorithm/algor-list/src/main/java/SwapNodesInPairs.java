/**
 * @author caifx
 * @create Created in 20:56 2020/8/5
 * @modified By:
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 **/
public class SwapNodesInPairs {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, SwapNodesInPairs.ListNode next){ this.val = val; this.next = next;}
    }

    public ListNode swapPairsForce(ListNode head) {
        ListNode temp = null;
        ListNode curr = head;
            if(curr ==null || curr.next == null){
                return curr;
            }
        ListNode prev = curr.next;
        temp = curr.next.next;
        curr.next.next = curr;
        curr.next = temp == null ? null: this.swapPairsForce(temp);
        return prev;
    }


}
