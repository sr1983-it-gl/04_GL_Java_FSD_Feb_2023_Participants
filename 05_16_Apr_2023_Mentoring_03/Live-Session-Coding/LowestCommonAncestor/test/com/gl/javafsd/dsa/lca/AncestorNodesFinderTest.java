package com.gl.javafsd.dsa.lca;

import java.util.List;

public class AncestorNodesFinderTest {

	public static void main(String[] args) {
		
		BinaryTree tree = TestDataUtils.sampleBinaryTree();
		
		NodeFinder finder = new NodeFinder(tree);		
		Node _nodeObj = finder.find(70);
		
		AncestorNodesFinder ancestorsFinder 
			= new AncestorNodesFinder(_nodeObj);
		List<Integer> ancestors = ancestorsFinder.find();
		
		System.out.println(ancestors);		
	}
}
