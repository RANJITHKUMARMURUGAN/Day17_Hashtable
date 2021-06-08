import java.util.Stack;

public class BinaryTree {
// instance variable
private TreeNode root;

	//in order to represent a TreeNode we create TreeNode class
	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}


	private class TreeNodee {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNodee(int data) {
			this.data = data;
		}
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public TreeNode insert(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}

		if(value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	public void inOrder() {
		inOrder(root);
	}

	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public TreeNode search(int key) {
		return search(root, key);
	}

	public TreeNode search(TreeNode root, int key) {
		if(root == null || root.data == key) {
			return root;
		}

		if(key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}

	}

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		bst.insert(22);
		bst.insert(40);
		bst.insert(60);
		bst.insert(95);
		bst.insert(11);
		bst.insert(65);
		bst.insert(3);
		bst.insert(16);
		bst.insert(63);
		bst.insert(67);

		bst.inOrder();

		System.out.println();

		if(null != bst.search(95)) {
			System.out.println("Key found !!!");
		} else {
			System.out.println("Key not found !!!");
		}
	}

}
