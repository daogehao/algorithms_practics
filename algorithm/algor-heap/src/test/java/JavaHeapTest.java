import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHeapTest {

    @Test
    void iterater() {
        Integer[] arr =new Integer[]{45,36,18,53,72,30,48,93,15,35};
        JavaHeap<Integer> myHeap = new JavaHeap(arr);
        assertEquals("93,72,48,53,45,30,18,36,15,35,",myHeap.iterater());
    }
}