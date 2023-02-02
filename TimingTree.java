package Algos;

import java.util.*;

public class TimingTree {
    public static void main(String[] args){
        // create ArrayList with random Integer values
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            int pick = rand.nextInt(100);
            list.add(pick);
        }
        System.out.println("Contents of list: " + list);

        // create BinaryTree
        BinaryTree bt = new BinaryTree(list);
    }
}
