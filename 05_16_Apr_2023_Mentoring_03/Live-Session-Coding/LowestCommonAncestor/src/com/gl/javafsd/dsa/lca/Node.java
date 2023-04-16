package com.gl.javafsd.dsa.lca;

public class Node {
	
	private int data;
	
	private Node left;
	private Node right;
	
	private Node parent;

	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		
		// left [20]
		// this [10]
		
		this.left = left;		
		left.setParent(this);
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
		
		// right - 30
		// this - 10
		
		right.setParent(this);
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
//	public String toString() {
//		
//		return d
//		data + ", " 
//				+ result.getLeft() + ", " + result.getRight() 
//					+ ", " + result.getParent()
//	}
//	
}
