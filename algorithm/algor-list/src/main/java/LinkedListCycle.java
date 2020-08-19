import java.util.HashSet;
import java.util.Set;

/**
 * @author caifx
 * @create Created in 21:18 2020/8/10
 * @modified By:
 * Given a linked list, determine if it has a cycle in it.
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 **/
public class LinkedListCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
        ListNode(int x,ListNode nextNode){
            val = x;
            next = nextNode;
        }
    }

    public boolean hasCycleForce(ListNode head) {
        if(head == null){
            return false;
        }
        Set<ListNode> nodes = new HashSet<>();
        boolean flag = false;
        for(;head.next !=null;head=head.next){
            if(nodes.contains(head)){
                flag = true;
                break;
            }else {
                nodes.add(head);
            }
        }
        return flag;
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode slowPoint = head;
        ListNode fastPoint = head.next;

        while(slowPoint != fastPoint ){
            if(slowPoint == null ||fastPoint ==null || fastPoint.next == null){
                return false;
            }
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next.next;
        }

        return true;
    }
}
