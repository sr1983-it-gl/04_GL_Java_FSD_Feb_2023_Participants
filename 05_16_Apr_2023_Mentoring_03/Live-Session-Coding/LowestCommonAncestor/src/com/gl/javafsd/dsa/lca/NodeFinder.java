package com.gl.javafsd.dsa.lca;

public class NodeFinder {

	private BinaryTree tree;
	
	public NodeFinder(BinaryTree tree) {
		
		this.tree = tree;
	}
	
	public Node find(int data) {
		
		Node result = findInternal(tree.getRoot(), data);
		return result;
	}
	
	Node findInternal(Node aNode, int data){
				
		if (aNode == null) {
			return null;
		}

		System.out.println("aNode.data " + aNode.getData());

		if (aNode.getData() == data) {
			return aNode;
		}
		
		Node result = findInternal(aNode.getLeft(), data);
		if (result != null) {			
			return result;
		}
		
		result = findInternal(aNode.getRight(), data);
		return result;		
	}
}
