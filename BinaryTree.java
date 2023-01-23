import java.util.Collections;
import java.util.ArrayList;
import java.util.Objects;
public class BinaryTree {
    private Node root;
    private int quantity;
    public BinaryTree(ArrayList<Integer> list){
        root = new Node(list.get(0));
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++){
            this.insert(new Node(list.get(i)), root);
        }
        quantity = list.size();
    }

    public void insert(Node node, Node currentNode){
        if (Objects.isNull(node.left) && Objects.isNull(node.right)){
            currentNode.addConnection(node);
        }
        else if (node.getVal() > currentNode.getVal() && Objects.isNull(node.right)){
            currentNode.addConnection(node);
        }
        else if (node.getVal() <= currentNode.getVal() && Objects.isNull(node.left)){
            currentNode.addConnection(node);
        }
        else {
            if (node.getVal() > currentNode.getVal()){
                insert(node, currentNode.left);
            }
            else {
                insert(node, currentNode.right);
            }
        }
        quantity++;
    }
    public Integer findMin(){
        currentNode = root;
        while (!Objects.isNull(root.left)){
            currentNode = root.right;
        }
        return currentNode.getVal();
    }

    public String toString(){
        return "BinaryTree: quantity " + quantity + ", root " + root.getVal();
    }

    /***
    public static void main(String[] args){
        System.out.println("Hello World");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(10);
        BinaryTree binaryTree = new BinaryTree(list);
        System.out.println(binaryTree);
    } ***/
}
public class Node{
    private final Integer val;
    Node left;
    Node right;

    public Node(Integer val){
        this.val = val;
    }

    public void addConnection(Node newNode){
        if (newNode.val > val){
            right = newNode;
        }
        else {
            left = newNode;
        }
        System.out.println("Node successfully added");
    }

    public Integer getVal(){
            return val;
        }
}