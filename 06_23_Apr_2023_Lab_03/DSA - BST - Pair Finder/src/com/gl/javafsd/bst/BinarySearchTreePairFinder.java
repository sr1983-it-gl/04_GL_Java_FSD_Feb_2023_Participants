package com.gl.javafsd.bst;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BinarySearchTreePairFinder {

	private BinarySearchTree tree;
	private int sum;
	private boolean matchingNodesIdentified = false;
	
	public BinarySearchTreePairFinder(BinarySearchTree tree, int sum) {
		
		this.tree = tree;
		this.sum = sum;
	}
	
	public void findPairOfNodes() {
	
		Set<Integer> nodeValues = new LinkedHashSet<>();
		
		findPairOfNodes(tree.getRootNode(), nodeValues);
		
		if (!matchingNodesIdentified) {
			System.out.printf("For the given sum %s, Matching Nodes NOT Found", sum);
		}		
	}
	
	
	boolean findPairOfNodes(TreeNode node, Set<Integer> nodeValues) {
		
		if (node == null) {
			return false;
		}
		
		boolean result = findPairOfNodes(
			node.getLeftNode(), nodeValues);
		if (result) {
			return true;
		}
		
		int difference = sum - node.getData();
		
		System.out.printf("Difference value is %d for the node %d %n", difference, node.getData());
		if (nodeValues.contains(difference)) {
			
			
			System.out.printf("For the give sum %d, the matching nodes are %d and %d %n",
					sum, node.getData(), difference);
			matchingNodesIdentified = true;
//			nodeValues.add(node.getData());

			return matchingNodesIdentified;
		}else {
						
			nodeValues.add(node.getData());
			System.out.printf("Adding the node %d to the collection [%s] %n", node.getData(), nodeValues);;
		}
		
		if (!matchingNodesIdentified) {
			
			result = 
			findPairOfNodes(node.getRightNode(), nodeValues);
			return result;
		}else {
			return true;
		}
		
	}
}
