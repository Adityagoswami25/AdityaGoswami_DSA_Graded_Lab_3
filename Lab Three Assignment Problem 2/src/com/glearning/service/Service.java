package com.glearning.service;
import java.util.HashSet;

import com.glearning.node.Node;

public class Service {
	
	public Node root;

    public boolean findPair(Node node, int sum, HashSet<Integer> set) {
        if (node == null)
            return false;

        if (findPair(node.left, sum, set))
            return true;

        if (set.contains(sum - node.data)) {
            System.out.println("Pair is (" + (sum - node.data) + "," + node.data + ")");
            return true;
        } else
            set.add(node.data);

        return findPair(node.right, sum, set);
    }
}

