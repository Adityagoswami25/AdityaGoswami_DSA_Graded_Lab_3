package com.glearning.client;
import java.util.HashSet;

import com.glearning.node.Node;
import com.glearning.service.Service;

public class Client {

	public static void main(String[] args) {
		Service tree = new Service();
        tree.root = new Node(40);
        tree.root.left = new Node(20);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(50);
        tree.root.right.right = new Node(70);

        int sum = 130;
        HashSet<Integer> set = new HashSet<>();
        if (!tree.findPair(tree.root, sum, set)) {
            System.out.println("Nodes are not found.");
        }
    }
}
