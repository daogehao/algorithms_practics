import java.util.HashSet;
import java.util.Set;

/**
 * @author caifx
 * @create Created in 21:46 2020/8/13
 * @modified By:
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * To represent a cycle in the given linked list,
 * we use an integer pos which represents the position (0-indexed) in the linked list
 * where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 **/
public class LinkedListCycle2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
        ListNode(int x, ListNode nextNode){
            val = x;
            next = nextNode;
        }
    }

    public ListNode detectCycleForce(ListNode head) {
        if(head == null) {
            return null;
        }
        Set<ListNode> listNodes = new HashSet<>();
        ListNode resNode = null;
        while(head.next != null){
            if(listNodes.contains(head)){
                resNode = head;
                break;
            }else {
                listNodes.add(head);
            }
            head = head.next;
        }
        return resNode;
    }


    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while( slow != fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

}
