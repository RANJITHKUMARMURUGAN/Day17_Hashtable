package binary_tree;

public class BinaryTree {
	//instance variable
private TreeNode root;
	
	//TreeNode we create TreeNode class //
	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data; 
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	public void createBinaryTree() {
		TreeNode first = new TreeNode(56);
		TreeNode second = new TreeNode(30);
		TreeNode third = new TreeNode(70);
		//root ---> first
		root = first;
		first.left = second;
		//second ---> first ---> third
		first.right = third;
		}
	}
}
