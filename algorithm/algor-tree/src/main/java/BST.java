import java.util.LinkedList;

/**
 * @author caifx
 * @create Created in 21:24 2020/8/8
 * @modified By:
 * Binary search tree symbol table
 **/
public class BST<Key extends Comparable<Key> ,Value> {
    private Node root;

    private class Node{
        private Key key;
        private Value val;
        private Node left ,right;
        private int N;

        public Node(Key key, Value val ,int N){
            this.key = key; this.val = val; this.N = N;
        }
    }

    public int size(){
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    public Value get(Key key){
        return get(root,key);
    }

    /**
     * Return value associated with key in the subtree rooted at x
     * return null if key not present in subtree rooted at x
     * @param x
     * @param key
     * @return
     */
    private Value get(Node x, Key key){
        if(x == null ) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0) {
            return get(x.left, key);
        }
        else if(cmp > 0) {
            return get(x.right,key);
        }
        else { return x.val; }
    }

    public void put(Key key,Value val){
        root = put(root, key, val);
    }

    /**
     * Change key's value to val if key in subtree rooted at x
     * otherwise, add new node to subtree associating key whit val
     * @param x
     * @param key
     * @param val
     * @return
     */
    private Node put(Node x, Key key, Value val){
        if( x == null ) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0 ){
            x.left = put(x.left, key, val);
        }else if(cmp > 0){
            x.right = put(x.right, key, val);
        }else {
            x.val = val;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }


    /**
     * 前序遍历
     */
    public void preOrder(){
        preOrder(root);
    }


    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return ;
        }
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }

    /**
     * 功能描述:广度优先搜索(Breadth-First-Search)
     */
    public void bfs(){
        if(root == null){
            return;
        }
        LinkedList<Node> queue =new LinkedList();
        queue.add(root);
        this.bfs(queue);
    }

    private void bfs(LinkedList<Node> queue){
        if(queue.isEmpty()){
            return;
        }

        Node tempNode = queue.pop();
        System.out.println(tempNode.val);

        if(tempNode.left !=null){
            queue.add(tempNode.left);
        }

        if(tempNode.right != null){
            queue.add(tempNode.right);
        }

        bfs(queue);
    }

    /**
     * 功能描述: 深度优先搜索（Depth-First-Search）
     */
    public void dfs(){
        this.preOrder(root);
        this.inOrder(root);
        this.postOrder(root);
    }



}
