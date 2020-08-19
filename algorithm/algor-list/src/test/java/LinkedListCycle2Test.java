import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author caifx
 * @create Created in 22:02 2020/8/13
 * @modified By:
 **/
class LinkedListCycle2Test {

    @Test
    void detectCycleForce() {
        LinkedListCycle2 LinkedListCycle2 =new LinkedListCycle2();
        LinkedListCycle2.ListNode exam1Node1 =LinkedListCycle2.new ListNode(3);
        LinkedListCycle2.ListNode exam1Node2 =LinkedListCycle2.new ListNode(2);
        LinkedListCycle2.ListNode exam1Node3 =LinkedListCycle2.new ListNode(0);
        LinkedListCycle2.ListNode exam1Node4 =LinkedListCycle2.new ListNode(-4);
        exam1Node1.next = exam1Node2;
        exam1Node2.next = exam1Node3;
        exam1Node3.next = exam1Node4;
        exam1Node4.next = exam1Node2;

        LinkedListCycle2.ListNode exam2Node1 =LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam2Node2 =LinkedListCycle2.new ListNode(2);
        exam2Node1.next=exam2Node2;
        exam2Node2.next=exam2Node1;

        LinkedListCycle2.ListNode exam3Node1 =LinkedListCycle2.new ListNode(1);

        LinkedListCycle2.ListNode exam4Node1 =LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam4Node2 =LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam4Node3=LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam4Node4 =LinkedListCycle2.new ListNode(1);
        exam4Node1.next=exam4Node2;
        exam4Node2.next=exam4Node3;
        exam4Node3.next=exam4Node4;

        assertEquals(LinkedListCycle2.detectCycleForce(exam1Node1),exam1Node2);
        assertEquals(LinkedListCycle2.detectCycleForce(exam2Node1),exam2Node1);
        assertEquals(LinkedListCycle2.detectCycleForce(exam3Node1),null);
        assertEquals(LinkedListCycle2.detectCycleForce(exam4Node1),null);
        assertEquals(LinkedListCycle2.detectCycleForce(null),null);
    }

    @Test
    void detectCycle() {
        LinkedListCycle2 LinkedListCycle2 =new LinkedListCycle2();
        LinkedListCycle2.ListNode exam1Node1 =LinkedListCycle2.new ListNode(3);
        LinkedListCycle2.ListNode exam1Node2 =LinkedListCycle2.new ListNode(2);
        LinkedListCycle2.ListNode exam1Node3 =LinkedListCycle2.new ListNode(0);
        LinkedListCycle2.ListNode exam1Node4 =LinkedListCycle2.new ListNode(-4);
        exam1Node1.next = exam1Node2;
        exam1Node2.next = exam1Node3;
        exam1Node3.next = exam1Node4;
        exam1Node4.next = exam1Node2;

        LinkedListCycle2.ListNode exam2Node1 =LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam2Node2 =LinkedListCycle2.new ListNode(2);
        exam2Node1.next=exam2Node2;
        exam2Node2.next=exam2Node1;

        LinkedListCycle2.ListNode exam3Node1 =LinkedListCycle2.new ListNode(1);

        LinkedListCycle2.ListNode exam4Node1 =LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam4Node2 =LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam4Node3=LinkedListCycle2.new ListNode(1);
        LinkedListCycle2.ListNode exam4Node4 =LinkedListCycle2.new ListNode(1);
        exam4Node1.next=exam4Node2;
        exam4Node2.next=exam4Node3;
        exam4Node3.next=exam4Node4;

        assertEquals(LinkedListCycle2.detectCycle(exam1Node1),exam1Node2);
        assertEquals(LinkedListCycle2.detectCycle(exam2Node1),exam2Node1);
        assertEquals(LinkedListCycle2.detectCycle(exam3Node1),null);
        assertEquals(LinkedListCycle2.detectCycle(exam4Node1),null);
        assertEquals(LinkedListCycle2.detectCycle(null),null);
    }
}