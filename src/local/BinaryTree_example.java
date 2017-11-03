package local;

public class BinaryTree_example {
	public static void main(String[]args) {
	BinaryTree tree = new BinaryTree(20);
	int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
	for(int i : nums ) {
	tree.addnode( i );
	}
	tree.preorder();
	System.out.println();
	tree.inorder();
	System.out.println();
	tree.postorder();
	}
}
