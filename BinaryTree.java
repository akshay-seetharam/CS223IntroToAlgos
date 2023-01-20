import java.util.Collections;
import java.util.ArrayList;

public class BinaryTree<T extends Comparable<? super T>> {
    Node root;

    public BinaryTree(ArrayList<T> list){
        root = list.get(0);
        Collections.sort(list);
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(10);
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(list);
    }
}

public class Node<T extends Comparable<? super T>>{
    private final T val;
    Node left;
    Node right;

    public Node(T val){
        this.val = val;
        left = null;
        right = null;
    }

    public void addConnection(Node newNode){
        if (newNode.val > val){
            right = newNode;
        }
        else {
            left = newNode;
        }
    }
}