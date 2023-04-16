package com.gl.javafsd.dsa.lca;

public class NodeFinderTest {

	public static void main(String[] args) {
		
		BinaryTree tree = TestDataUtils.sampleBinaryTree();
		
		NodeFinder finder = new NodeFinder(tree);
		
		Node result = finder.find(100);
		
		if (result != null) {
			System.out.println(result.getData() + ", " 
					+ result.getLeft() + ", " + result.getRight() 
						+ ", " + result.getParent());			
		}else {
			System.out.println("Node is null");
		}		
	}
	

}
