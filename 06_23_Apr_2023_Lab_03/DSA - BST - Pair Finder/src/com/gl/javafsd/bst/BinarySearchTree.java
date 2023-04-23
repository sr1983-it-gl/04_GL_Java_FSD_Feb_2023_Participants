package com.gl.javafsd.bst;

public class BinarySearchTree {

	private TreeNode rootNode;
	
	public BinarySearchTree() {
		rootNode = null;
	}
	
	public void insert(Integer nodeValue) {
		
		rootNode = insert(rootNode, nodeValue);
	}
	
	TreeNode insert(TreeNode rootNode, Integer nodeValue){
	
		if (rootNode == null) {
			
			TreeNode newNode = createNewNode(nodeValue);
			return newNode;					
		}else if (nodeValue < rootNode.getData()) {
			
			// Left Side
			TreeNode newNode 
				= insert(rootNode.getLeftNode(), nodeValue);
			rootNode.setLeftNode(newNode);
//			System.out.printf("Left-side Called for the node %d whose parent is %d %n", 
//					nodeValue, rootNode.getData());			
			return rootNode;			
		}else{
			
			// Right Side
			TreeNode newNode 
				= insert(rootNode.getRightNode(), nodeValue);
			rootNode.setRightNode(newNode);
//			System.out.printf("Right-side Called for the node %d whose parent is %d %n", 
//				nodeValue, rootNode.getData());			
			return rootNode;
		}
	}
	
	TreeNode createNewNode(Integer nodeValue){
		
//		System.out.printf("New Node Creation %d %n", nodeValue);
		TreeNode newNode = new TreeNode(nodeValue);
		return newNode;
	}
	
	public TreeNode getRootNode() {
		return rootNode;
	}
}
