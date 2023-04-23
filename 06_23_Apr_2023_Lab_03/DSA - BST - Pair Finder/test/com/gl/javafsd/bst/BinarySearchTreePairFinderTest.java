package com.gl.javafsd.bst;

public class BinarySearchTreePairFinderTest {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(70);
		tree.insert(50);
		tree.insert(90);
		tree.insert(30);		
		tree.insert(60);		
		tree.insert(80);		
		tree.insert(100);		
		tree.insert(20);		
		tree.insert(40);

		// 120, 60, 190
		// 111, 500, 220
		BinarySearchTreePairFinder finder 
			= new BinarySearchTreePairFinder(tree, 120);
		finder.findPairOfNodes();
	}
}
