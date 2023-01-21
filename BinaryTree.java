import java.util.Collections;
import java.util.ArrayList;
import java.util.Objects;

public class Node{
    private final Integer val;
    Node left;
    Node right;

    public Node(Integer val){
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

    public Integer getVal(){
            return val;
        }

    public static void main(String[] args){
        Node node = new Node(5);
        node.addConnection(new Node(3));
        System.out.println("Node successfully created");
    }
}
public class BinaryTree {
    private Node root;
    public BinaryTree(ArrayList<Integer> list){
        Node root = new Node(list.get(0));
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++){
            this.addNode(new Node(list.get(i)), root);
        }
    }

    public void addNode(Node node, Node currentNode){
        if (node.left){
            currentNode.addConnection(node);
        }
        else if ()
        else {
            if (node.getVal() > currentNode.getVal()){
                addNode(node, currentNode.left);
            }
            else {
                addNode(node, currentNode.right);
            }
        }
    }

    public String toString(){
        return "BinaryTree with root " + root.getVal();
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(10);
        BinaryTree binaryTree = new BinaryTree(list);
        System.out.println(binaryTree);
    }
}