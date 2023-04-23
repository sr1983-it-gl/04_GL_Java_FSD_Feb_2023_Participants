package com.gl.javafsd.bst;

public class TreeNode {

	// data
	// leftNode
	// rightNode
	
	private Integer data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public String toString() {
		
		return "[" + data + "]";
	}
}
