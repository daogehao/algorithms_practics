import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description TODO
 * @Author zjack
 * @DATE 2020/9/15 8:34
 * 703. Kth Largest Element in a Stream
 *
 * int k = 3;
 *  int[] arr = [4,5,8,2];
 *  KthLargest kthLargest = new KthLargest(3, arr);
 *  kthLargest.add(3);   // returns 4
 *  kthLargest.add(5);   // returns 5
 *  kthLargest.add(10);  // returns 5
 *  kthLargest.add(9);   // returns 8
 *  kthLargest.add(4);   // returns 8
 *
 **/
public class KthLargest {

    PriorityQueue<Integer> priorityQueue;
    int resLen;

    public KthLargest(int k, int[] nums) {
        resLen = k;
        priorityQueue=new PriorityQueue<>(k ,(o1,o2) ->o1>o2?1:(o1.equals(o2))?0:-1);
        if(nums == null){
            return;
        }

        for(int i=0;i<nums.length;i++){
            this.add(nums[i]);
        }

    }

    public int add(int val) {
        if(priorityQueue.size() == resLen){
            if(val > priorityQueue.peek()){
                priorityQueue.add(val);
                priorityQueue.poll();
            }
        } else{
            priorityQueue.add(val);
        }
        return priorityQueue.peek();
    }
}
