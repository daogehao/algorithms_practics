import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author caifx
 * @create Created in 21:42 2020/8/5
 * @modified By:
 **/
class SwapNodesInPairsTest {

    @Test
    void swapPairsForce() {
        SwapNodesInPairs swapNodesInPairs=new SwapNodesInPairs();
        SwapNodesInPairs.ListNode head =swapNodesInPairs.new ListNode(1);
        SwapNodesInPairs.ListNode prev = head;
        for(int i=2;i<5;i++){
            SwapNodesInPairs.ListNode temNode =swapNodesInPairs.new ListNode(i);
            prev.next = temNode;
            prev = temNode;
        }

        SwapNodesInPairs.ListNode swapHead = swapNodesInPairs.swapPairsForce(head);

        String swapStr = "";
        while(swapHead !=null){
            swapStr+=swapHead.val+"->";
            swapHead =swapHead.next;
        }
        Assert.assertEquals("2->1->4->3->",swapStr);
    }
}