/**
 * @Description TODO
 * @Author zjack
 * @DATE 2020/9/2 13:01
 **/
public class JavaHeap<T extends Comparable<T>>{
    private T[] heap;
    private int length;
    private int index=0;

    public JavaHeap(T[] arr ){
        heap = arr;
        length = arr.length;
        this.structure();
    }

    public JavaHeap(){
        heap =(T[]) new Object[100];
        this.length = 100;
    }

    public JavaHeap(int capital){
        heap =(T[]) new Object[capital];
        this.length = capital;
    }

    public String iterater(){
        StringBuffer sb =new StringBuffer();
        for(T t : heap){
            sb.append(t+",");
        }
        return sb.toString();
    }

    //1序列对应一个完全二叉树，从最后一个分支节点（n div 2）开始，到跟（1）为止，一次对每个分支节点进行调整（下沉），
    //以便形成以每个分支节点为根的堆，当最后对树根节点进行调整后，整个树就变成一个堆。
    private void structure(){
        int len = heap.length;
        //获取下沉节点开始postion
        int pos = len/2;
        //从leng/2开始判断下沉，一直到位置1也就是roo节点
        while (pos != 0){
            this.buildHeap(pos);
            pos--;
        }
    }

    //根据最大堆或者最小堆的定义，更换根节点和左右子节点的位置
    //根节点pos为i，左子节点pos为2i,右子节点为2i+1;
    //返回值为下沉节点的新pos
    private int buildHeap(int pos){
        int currPos = pos;
        //退出条件：节点为叶子节点
        if(pos>length/2){
            return currPos;
        }

        T t1 = heap[pos-1];
        T t2 = heap[pos*2-1];
        T t3 = pos*2==length?null:heap[pos*2];
        T temp;
        //如果是最大堆
        if(t3!=null&&t2.compareTo(t3)<0){
            //排序两个叶子节点
            temp = heap[pos*2-1];
            heap[pos*2-1] = heap[pos*2];
            heap[pos*2] = temp;

            //排序根节点和右子节点
            if(heap[pos-1].compareTo(heap[pos*2])<0){
                temp = heap[pos-1];
                heap[pos-1] = heap[pos*2];
                heap[pos*2] = temp;
            }
        }



        //排序根节点和左叶子节点
        if(heap[pos-1].compareTo(heap[pos*2-1])<0){
            temp = heap[pos-1];
            heap[pos-1] = heap[pos*2-1];
            heap[pos*2-1] = temp;
            //pos*2为节点下沉后的位置
            //递归继续下沉判断
            this.buildHeap(pos * 2);
        }

        return currPos;
    }


    //堆插入操作，插入堆底，调用上浮操作
    public void push(T t){
        if(index+1>this.length){
            throw new ArrayIndexOutOfBoundsException();
        }


    }

    //最大堆上浮操作
    private void shift_up(int pos){
        while(pos>1 && (heap[(pos-1)/2].compareTo(heap[pos])<0) ){
            swap_node((pos-1)/2, pos);
        }
    }

    private void swap_node(int indexA,int indexB){
        T temp = heap[indexA];
        heap[indexA] = heap[indexB];
        heap[indexB] = temp;
    }

}
