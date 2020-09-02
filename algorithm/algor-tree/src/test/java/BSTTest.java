import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author caifx
 * @create Created in 21:38 2020/8/8
 * @modified By:
 **/
class BSTTest {



    @BeforeEach
    void init(){
        System.out.println("before init BST");

    }

    @Test
    void size() {
        BST bst= new BST<Integer, String>();
        bst.put(1,"1:a");
        bst.put(2,"2:b");
        bst.put(3,"3:c");
        Assert.assertEquals(bst.size(),3);
    }

    @Test
    void get() {
        BST bst= new BST<Integer, String>();
        bst.put(1,"1:a");
        bst.put(2,"2:b");
        bst.put(3,"3:c");
        bst.put(3,"3:c3");
        bst.put(4,"4:c");
        Assert.assertEquals(bst.get(3),"3:c3");
    }

    @Test
    void put() {
        BST bst= new BST<Integer, String>();
        bst.put(1,"1:a");
        bst.put(2,"2:b");
        bst.put(3,"3:c");
        bst.put(3,"3:c3");
        bst.put(4,"4:c");
        Assert.assertEquals(bst.size(),4);
    }

    @Test
    void preOrder() {
        BST bst = new BST<Integer,String>();
        bst.put(28,"28");
        bst.put(16,"16");
        bst.put(30,"30");
        bst.put(13,"13");
        bst.put(22,"22");
        bst.put(29,"29");
        bst.put(42,"42");
        System.out.println("PreOrder:");
        bst.preOrder();
    }

    @Test
    void inOrder() {
        BST bst = new BST<Integer,String>();
        bst.put(28,"28");
        bst.put(16,"16");
        bst.put(30,"30");
        bst.put(13,"13");
        bst.put(22,"22");
        bst.put(29,"29");
        bst.put(42,"42");
        System.out.println("InOrder:");
        bst.inOrder();
    }

    @Test
    void postOrder() {
        BST bst = new BST<Integer,String>();
        bst.put(28,"28");
        bst.put(16,"16");
        bst.put(30,"30");
        bst.put(13,"13");
        bst.put(22,"22");
        bst.put(29,"29");
        bst.put(42,"42");
        System.out.println("PostOrder:");
        bst.postOrder();
    }

    @Test
    void bfs(){
        BST bst= new BST<Integer, String>();
        bst.put(1,"1:a");
        bst.put(2,"2:b");
        bst.put(3,"3:c");
        bst.put(3,"3:c3");
        bst.put(4,"4:c");
        bst.bfs();
    }
}