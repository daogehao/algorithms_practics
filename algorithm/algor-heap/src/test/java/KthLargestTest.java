import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void add() {
        int k = 3;
        int[] arr = {4,5,8,2};

        KthLargest kthLargest = new KthLargest(k, arr);
        assertEquals(kthLargest.add(3),4);   // returns 4
        assertEquals(kthLargest.add(5),5);   // returns 5
        assertEquals(kthLargest.add(10),5);  // returns 5
        assertEquals(kthLargest.add(9),8);   // returns 8
        assertEquals(kthLargest.add(4),8);   // returns 8
    }

    @Test
    void add2() {
        int k = 1;
        int[] arr = null;

        KthLargest kthLargest = new KthLargest(k, arr);
        assertEquals(kthLargest.add(-3),-3);   // returns null
        assertEquals(kthLargest.add(-2),-2);   // returns 5
        assertEquals(kthLargest.add(-4),-2);  // returns 5
        assertEquals(kthLargest.add(0),0);   // returns 8
        assertEquals(kthLargest.add(4),4);   // returns 8
    }

}