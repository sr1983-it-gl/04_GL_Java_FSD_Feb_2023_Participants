package com.gl.javafsd.dsa.lca;

public class TestDataUtils {

	public static BinaryTree sampleBinaryTree() {
		
		
		Node _40Node = new Node(40);
		Node _50Node = new Node(50);
		
		Node _20Node = new Node(20);
		_20Node.setLeft(_40Node);
		_20Node.setRight(_50Node);

		Node _60Node = new Node(60);
		Node _70Node = new Node(70);
		
		Node _30Node = new Node(30);
		_30Node.setLeft(_60Node);
		_30Node.setRight(_70Node);
		
		Node _10Node = new Node(10);
		_10Node.setLeft(_20Node);
		_10Node.setRight(_30Node);

		BinaryTree tree = new BinaryTree(_10Node);
		return tree;		
	}	
}
