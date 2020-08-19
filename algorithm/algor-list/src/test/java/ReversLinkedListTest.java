import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author caifx
 * @create Created in 21:31 2020/8/4
 * @modified By:
 **/
class ReversLinkedListTest {

    @Test
    void reverseList() {
        ReversLinkedList reversLinkedList=new ReversLinkedList();
        ReversLinkedList.ListNode head =reversLinkedList.new ListNode(1);
        ReversLinkedList.ListNode prev = head;
        for(int i=2;i<6;i++){
            ReversLinkedList.ListNode temNode =reversLinkedList.new ListNode(i);
            prev.next = temNode;
            prev = temNode;
        }

        ReversLinkedList.ListNode reverHead = reversLinkedList.reverseList(head);

        String reverStr = "";
        while(reverHead !=null){
            reverStr+=reverHead.val+"->";
            reverHead =reverHead.next;
        }
        reverStr+="NULL";
        Assert.assertEquals("5->4->3->2->1->NULL",reverStr);
    }
}