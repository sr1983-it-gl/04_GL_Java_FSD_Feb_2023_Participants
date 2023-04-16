package com.gl.javafsd.dsa.lca;

import java.util.ArrayList;
import java.util.List;

public class AncestorNodesFinder {

	private Node aNode;
	
	public AncestorNodesFinder(Node aNode) {
	
		this.aNode = aNode;
	}
	
	public List<Integer> find() {
		
		List<Integer> ancestorNodes = new ArrayList<>();
		
		Node tempNode = aNode;
		
		while (tempNode != null) {
			
			int nodeData =	tempNode.getData();
			ancestorNodes.add(nodeData);
			
			tempNode = tempNode.getParent();
		}	
		
		return ancestorNodes;
	}
}
