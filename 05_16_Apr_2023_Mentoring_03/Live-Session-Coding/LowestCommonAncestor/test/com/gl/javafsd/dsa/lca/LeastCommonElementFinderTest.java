package com.gl.javafsd.dsa.lca;

import java.util.List;

public class LeastCommonElementFinderTest {

	public static void main(String[] args) {
		
		BinaryTree tree = TestDataUtils.sampleBinaryTree();
		
		NodeFinder finder = new NodeFinder(tree);		
		Node node1 = finder.find(20);
		Node node2 = finder.find(40);
		
		AncestorNodesFinder ancestorsFinder 
			= new AncestorNodesFinder(node1);
		List<Integer> ancestorsForNode1 = ancestorsFinder.find();

		ancestorsFinder 
			= new AncestorNodesFinder(node2);
		List<Integer> ancestorsForNode2 = ancestorsFinder.find();
		
		LeastCommonElementFinder lcaFinder 
			= new LeastCommonElementFinder(
					ancestorsForNode1, ancestorsForNode2);
		int lca = lcaFinder.find();
		System.out.println("LCA is " + lca);
	}
}
