import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author caifx
 * @create Created in 21:37 2020/8/10
 * @modified By:
 **/
class LinkedListCycleTest {

    @Test
    void hasCycleForce() {
        LinkedListCycle linkedListCycle =new LinkedListCycle();
        LinkedListCycle.ListNode exam1Node1 =linkedListCycle.new ListNode(3);
        LinkedListCycle.ListNode exam1Node2 =linkedListCycle.new ListNode(2);
        LinkedListCycle.ListNode exam1Node3 =linkedListCycle.new ListNode(0);
        LinkedListCycle.ListNode exam1Node4 =linkedListCycle.new ListNode(-4);
        exam1Node1.next = exam1Node2;
        exam1Node2.next = exam1Node3;
        exam1Node3.next = exam1Node4;
        exam1Node4.next = exam1Node2;

        LinkedListCycle.ListNode exam2Node1 =linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam2Node2 =linkedListCycle.new ListNode(2);
        exam2Node1.next=exam2Node2;
        exam2Node2.next=exam2Node1;

        LinkedListCycle.ListNode exam3Node1 =linkedListCycle.new ListNode(1);

        LinkedListCycle.ListNode exam4Node1 =linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam4Node2 =linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam4Node3=linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam4Node4 =linkedListCycle.new ListNode(1);
        exam4Node1.next=exam4Node2;
        exam4Node2.next=exam4Node3;
        exam4Node3.next=exam4Node4;

        assertTrue(linkedListCycle.hasCycleForce(exam1Node1));
        assertTrue(linkedListCycle.hasCycleForce(exam2Node1));
        assertFalse(linkedListCycle.hasCycleForce(exam3Node1));
        assertFalse(linkedListCycle.hasCycleForce(exam4Node1));

    }

    @Test
    void hasCycle() {
        LinkedListCycle linkedListCycle =new LinkedListCycle();
        LinkedListCycle.ListNode exam1Node1 =linkedListCycle.new ListNode(3);
        LinkedListCycle.ListNode exam1Node2 =linkedListCycle.new ListNode(2);
        LinkedListCycle.ListNode exam1Node3 =linkedListCycle.new ListNode(0);
        LinkedListCycle.ListNode exam1Node4 =linkedListCycle.new ListNode(-4);
        exam1Node1.next = exam1Node2;
        exam1Node2.next = exam1Node3;
        exam1Node3.next = exam1Node4;
        exam1Node4.next = exam1Node2;

        LinkedListCycle.ListNode exam2Node1 =linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam2Node2 =linkedListCycle.new ListNode(2);
        exam2Node1.next=exam2Node2;
        exam2Node2.next=exam2Node1;

        LinkedListCycle.ListNode exam3Node1 =linkedListCycle.new ListNode(1);

        LinkedListCycle.ListNode exam4Node1 =linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam4Node2 =linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam4Node3=linkedListCycle.new ListNode(1);
        LinkedListCycle.ListNode exam4Node4 =linkedListCycle.new ListNode(1);
        exam4Node1.next=exam4Node2;
        exam4Node2.next=exam4Node3;
        exam4Node3.next=exam4Node4;

        assertTrue(linkedListCycle.hasCycle(exam1Node1));
        assertTrue(linkedListCycle.hasCycle(exam2Node1));
        assertFalse(linkedListCycle.hasCycle(exam3Node1));
        assertFalse(linkedListCycle.hasCycle(exam4Node1));
    }
}